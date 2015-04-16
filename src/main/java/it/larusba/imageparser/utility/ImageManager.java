package it.larusba.imageparser.utility;
import it.larusba.imageparser.domain.ColorDomain;
import it.larusba.imageparser.domain.ImageColor;
import it.larusba.imageparser.exception.ImageParserException;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageManager 
{
	private BufferedImage image, nuovaImage;
	private UtilityImage utility;
	private Color[][] mappaPixel;
	private Color avg, min, max;
	private String nome;


	public ImageManager(BufferedImage image) throws IOException //Inizializzo il bufferedImage dell'immagine letta
	{
		this.image = image;
	}
	
	public void menuImage() throws ImageParserException//Chiamo tutti i metodi da eseguire
	{
		Color[] colorReport = new Color[3];
		operationImage();
		this.mappaPixel = getMapPixel();
		writePixelToFile();
		colorReport = getReportRgb(mappaPixel);
		String nome = getNameColor(colorReport[0]);
		writeReport(colorReport[0], colorReport[1], colorReport[2], nome);
		this.avg = colorReport[0];
		this.max = colorReport[2];
		this.min = colorReport[1];
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
	
	public String getNameColor(Color avg)
	{
		ColorDomain colorName = new ColorDomain();
		nome = colorName.getColorName(avg.getRed(), avg.getGreen(), avg.getBlue());
		return nome;
	}
	
	public void writeReport(Color avg, Color min, Color max, String nome)
	{
		ImageColor imageImport = new ImageColor(avg, min, max, nome, utility.increment());
		this.utility.writeReportCSV(imageImport);
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