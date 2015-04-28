package it.larusba.imageparser.domain;
import java.awt.Color;


public class ColourAnalysis 
{
	private String imageName;
	
	private String nameAverageColor;

	private Color rgbAverageColor;

	private String nameMinimumColor;

	private Color rgbMinimumColor;

	private String nameMaximumColor;

	private Color rgbMaximumColor;
	
	int increment;

	/**
	 * 
	 */
	public ColourAnalysis() {

	}
   	
	/**
	 * @param nameAverageColor
	 * @param rgbAverageColor
	 * @param nameMinimumColor
	 * @param rgbMinimumColor
	 * @param nameMaximumColor
	 * @param rgbMaximumColor
	 * @param increment
	 */
	public ColourAnalysis( Color rgbAverageColor, Color rgbMinimumColor,
			Color rgbMaximumColor, int increment) {
		
		this.rgbAverageColor = rgbAverageColor;
		this.rgbMinimumColor = rgbMinimumColor;
		this.rgbMaximumColor = rgbMaximumColor;
		this.increment = increment;
	}
	
	public int getIncrement() 
	{
		return increment;
	}
	public void setIncrement(int increment) 
	{
		this.increment = increment;
	}


	public String getNameAverageColor() {
		return nameAverageColor;
	}


	public void setNameAverageColor(String nameAverageColor) {
		this.nameAverageColor = nameAverageColor;
	}


	public Color getRgbAverageColor() {
		return rgbAverageColor;
	}


	public void setRgbAverageColor(Color rgbAverageColor) {
		this.rgbAverageColor = rgbAverageColor;
	}


	public String getNameMinimumColor() {
		return nameMinimumColor;
	}


	public void setNameMinimumColor(String nameMinimumColor) {
		this.nameMinimumColor = nameMinimumColor;
	}


	public Color getRgbMinimumColor() {
		return rgbMinimumColor;
	}


	public void setRgbMinimumColor(Color rgbMinimumColor) {
		this.rgbMinimumColor = rgbMinimumColor;
	}


	public String getNameMaximumColor() {
		return nameMaximumColor;
	}


	public void setNameMaximumColor(String nameMaximumColor) {
		this.nameMaximumColor = nameMaximumColor;
	}


	public Color getRgbMaximumColor() {
		return rgbMaximumColor;
	}


	public void setRgbMaximumColor(Color rgbMaximumColor) {
		this.rgbMaximumColor = rgbMaximumColor;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
}
