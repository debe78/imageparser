/**
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.larusba.imageparser.service;
import it.larusba.imageparser.domain.ColorDomain;
import it.larusba.imageparser.domain.ColourAnalysis;
import it.larusba.imageparser.exception.ImageParserException;
import it.larusba.imageparser.utility.UtilityImage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

/**
 * @author Enrico De Benetti
 * @since 30 Apr 2015
 *
 */
public class DefaultImageManager implements ImageManager
{
	private BufferedImage image, nuovaImage;
	private UtilityImage utility;
	private Color[][] mappaPixel;
	private Color avg, min, max;
	private ArrayList<ColorDomain> listColor = null;

	public DefaultImageManager(BufferedImage image) throws IOException //Inizializzo il bufferedImage dell'immagine letta
	{
		this.image = image;
		this.listColor = colorList();
	}
	
	public List<ColourAnalysis> analyseVanGoghImage() throws ImageParserException{
		
		List<ColourAnalysis> listVanGogImageColor = new ArrayList<ColourAnalysis>();
		
		
		try {

			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource("vangoghartworks.txt").getFile());
			
			BufferedReader input = new BufferedReader(new FileReader(file));
			int i=0;
			String line;
			while ((line = input.readLine()) != null) {
				
				String[] splitLine = line.split("-");
				System.out.println(++i);
				ColourAnalysis colourAnalysis = analyseImageByUrl(splitLine[1],splitLine[0]);
				listVanGogImageColor.add(colourAnalysis);
			}
			input.close();

		} catch (Exception e) {
			
			System.out.println("errore: "+e.getMessage());
		}	
		return listVanGogImageColor;
	}

	/**
	 * @param imageColor
	 * @return
	 * @throws ImageParserException
	 */
	private ColourAnalysis analyseImageByUrl(String urlS,String imageName)
			throws ImageParserException {
		
		ColourAnalysis imageColor = null;
		
		System.out.println("Analysing image: "+imageName+" .....");
		
		try {
			URL url = new URL(urlS);
			this.image = ImageIO.read(url);
			imageColor = analyzeImage();
			imageColor.setImageName(imageName);
			imageColor.setSource(urlS);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
          throw new ImageParserException(e.getMessage());			
		}
		
		return imageColor;
	}
	
	
	public ColourAnalysis analyzeImage() throws ImageParserException{
		
	  ColourAnalysis imageColor = new ColourAnalysis();
	  
	    Color[] colorReport = new Color[3];
		operationImage();
		colorReport = getReportRgb(utility.pixelMatrix());
		
		imageColor.setNameAverageColor(getNameColor(colorReport[0]));
		imageColor.setNameMaximumColor(getNameColor(colorReport[2]));
		imageColor.setNameMinimumColor(getNameColor(colorReport[1]));
		imageColor.setRgbAverageColor(colorReport[0]);
		imageColor.setRgbMaximumColor(colorReport[2]);
		imageColor.setRgbMinimumColor(colorReport[1]);
		
	  return imageColor;	
	}
	
	public void operationImage() throws ImageParserException
	{
		utility = new UtilityImage(image);
		nuovaImage = utility.resizeImage(image);//Chiamo il metodo per il resize dell'immagine
		utility = new UtilityImage(nuovaImage);
		utility.initializeMatrix();
	}
	
	public Color[][] getMapPixel()//Metodo che restituisce una matrice di oggetti (Color)
	{
		return utility.pixelMatrix();
	}
	
	
	public Color[] getReportRgb(Color[][] mappaPixel)//Scrivo in append, i dati di riepilogo dell'immagine
	{
		Color[] colorReport = new Color[3];
		colorReport[0] = utility.getAvg(mappaPixel);
		colorReport[1] = utility.getMin(mappaPixel);
		colorReport[2] = utility.getMax(mappaPixel);
		return colorReport;
	}
	
	public String getNameColor(Color color) {
		String nome = "";
		nome = getColorName(color.getRed(), color.getGreen(),color.getBlue());
		return nome;
	}


	public String getColorName(int red, int green, int blue)// Ritorno il nome del colore medio
	{
		int maxPixel = Integer.MAX_VALUE;
		int valuePixel;
		ColorDomain trovato = null;
		for (ColorDomain colorDomain : listColor) {
			valuePixel = ((red - colorDomain.getRed()) * (red - colorDomain.getRed()) + (green - colorDomain.getGreen()) * (green - colorDomain.getGreen()) + (blue - colorDomain.getBlue()) * (blue - colorDomain.getBlue())) / 3;

			if (valuePixel < maxPixel) {
				maxPixel = valuePixel;
				trovato = colorDomain;
			}
		}
		if (trovato != null) {
			return trovato.getName();
		}
		return null;
	}

	public ArrayList<ColorDomain> colorList() {
		int red, green, blue;
		ArrayList<ColorDomain> color = new ArrayList<ColorDomain>();
		try {

			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource("color.txt").getFile());
			
			BufferedReader input = new BufferedReader(new FileReader(file));
			
			int index = 0;
			String line;
			while ((line = input.readLine()) != null) {
				
				String[] hex = line.split("#");
				red = Integer.parseInt(hex[1].substring(0, 2), 16);
				green = Integer.parseInt(hex[1].substring(2, 4), 16);
				blue = Integer.parseInt(hex[1].substring(4, 6), 16);

				ColorDomain colorDomain = new ColorDomain(line.replaceAll("#+[0-9A-z]*","").replace("\t", ""), red, green, blue);

				color.add(index, colorDomain);
				index++;
			}
			input.close();

		} catch (Exception e) {
		}
		return color;
	}
	
	
	public Color[][] getMappaPixel() 
	{
		return mappaPixel;
	}

	public Color getAvg() 
	{
		return avg;
	}

	public Color getMin() 
	{
		return min;
	}

	public Color getMax() 
	{
		return max;
	}
}