package it.larusba.imageparser.main;

import it.larusba.imageparser.utility.InputImage;

@interface Autore
{
	String autore();
   	String data();
}

@Autore (
	autore = "Mattia Zaratin",
	data = "24/03/2015"
)

public class Main 
{

	public static void main(String[] args) 
	{
		InputImage input = new InputImage();
		input.input();
	}
	
}
