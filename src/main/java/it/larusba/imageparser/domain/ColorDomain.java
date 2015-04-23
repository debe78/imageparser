package it.larusba.imageparser.domain;


public class ColorDomain {
	private int red, green, blue;
	private String name;

	public ColorDomain(String name, int red, int green, int blue)// Inizializzo i colori RGB e li converto da HEX a INT
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.name = name;
	}

	public ColorDomain() {

	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public String getName() {
		return name;
	}
}
