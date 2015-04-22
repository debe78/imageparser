package it.larusba.imageparser.utility;
import it.larusba.imageparser.domain.ColorDomain;
import it.larusba.imageparser.domain.ImageColor;
import it.larusba.imageparser.exception.ImageParserException;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ImageManager 
{
	private BufferedImage image, nuovaImage;
	private UtilityImage utility;
	private Color[][] mappaPixel;
	private Color avg, min, max;
	private ArrayList<ColorDomain> listColor = null;

	public ImageManager(BufferedImage image) throws IOException //Inizializzo il bufferedImage dell'immagine letta
	{
		this.image = image;
		this.listColor = colorList();
	}
	
	public void menuImage() throws ImageParserException//Chiamo tutti i metodi da eseguire
	{
		ImageColor imageColor = analyzeImage();
		operationImage();
		this.mappaPixel = getMapPixel();
		writePixelToFile();
		imageColor.setIncrement(utility.getIncrement());
		writeReport(imageColor.getRgbAverageColor(), imageColor.getRgbMinimumColor(), imageColor.getRgbMaximumColor(), imageColor);
	}
	
	public ImageColor analyzeImage() throws ImageParserException{
		
	  ImageColor imageColor = new ImageColor();
	  
	    Color[] colorReport = new Color[3];
		operationImage();
		this.mappaPixel = getMapPixel();
		colorReport = getReportRgb(mappaPixel);
		
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
		utility.initializeMatrix(mappaPixel);
	}
	
	public Color[][] getMapPixel()//Metodo che restituisce una matrice di oggetti (Color)
	{
		return utility.pixelMatrix();
	}
	
	public void writePixelToFile()//Scrivo su file tutti i pixel 
	{
		this.utility.initializeFile();
		this.utility.writePixel(mappaPixel);
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

	public void writeReport(Color avg, Color min, Color max,ImageColor imageColor) {
		imageColor.setRgbAverageColor(avg);
		imageColor.setRgbMaximumColor(max);
		imageColor.setRgbMinimumColor(min);
		this.utility.writeReportCSV(imageColor);
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