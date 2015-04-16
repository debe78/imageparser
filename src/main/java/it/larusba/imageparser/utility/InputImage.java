package it.larusba.imageparser.utility;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.Scanner;

import javax.imageio.ImageIO;


public class InputImage
{
	private String input;
	private BufferedImage image;
	Scanner scan = new Scanner(System.in);
	
	public InputImage()
	{
		
	}
	
	public void input()
	{
		int ingresso = scelta();
		if(ingresso == 1)
		{
			fileLocale();
		}
		else
		{
			fileUrl();
		}
	}
	
	public int scelta()
	{
		int scelta = 0;
		System.out.println("1)Inserisci l'indirizzo locale dell'immagine:");
		System.out.println("2)Inserisci l'indirizzo URL dell'immagine:");
		System.out.println("Le immagini inserirle nella Srivania(basta inserire solo il nome del file senza .jpg)");
		scelta = Integer.parseInt(scan.nextLine());
		return scelta;
	}
	
	public void fileLocale()
	{
		ImageManager imageManager;
		File in;
		System.out.println("Inserisci l'indirizzo:");//Prendo l'immagine da locale
		input = scan.nextLine();
		input = "/home/larus/Scrivania/"+input+".jpg";
		in = new File(""+input);
		try 
		{
			this.image = ImageIO.read(in);
			imageManager = new ImageManager(this.image);
			System.out.println("Sto elaborando.....");
			imageManager.menuImage();
			System.out.println("Immagine analizzata correttamente!!");
		}
		catch (Exception e) 
		{
			
		}
	}
	
	public void fileUrl()
	{
		ImageManager imageManager;
		System.out.println("Inserisci l'indirizzo URL:");//Prendo l'immagine da un indirizzo URL
		input = scan.nextLine();
		try 
		{
			URL url = new URL(input);
			this.image = ImageIO.read(url);
			imageManager = new ImageManager(this.image);
			System.out.println("Sto elaborando.....");
			imageManager.menuImage();
			System.out.println("Immagine analizzata correttamente!!");
		} 
		catch (Exception e) 
		{
			
		}
	}
	
	public BufferedImage getImage()
	{
		return image;
	}
}
