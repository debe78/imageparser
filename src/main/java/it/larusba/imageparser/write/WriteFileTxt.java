package it.larusba.imageparser.write;
import it.larusba.imageparser.domain.ColourAnalysis;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class WriteFileTxt implements IWriteFile{
	
	private String file;
	
	public WriteFileTxt(String file)
	{
		this.file = file+".txt";
	}
	
	public void savePixel(Color[] c)//Scrivere i Pixel su file
	 {
		int i = 0;
		 try
		 {
			 PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
			 while(i < c.length)
			 {
				 String testo = "Red:"+c[i].getRed()+"Green:"+c[i].getGreen()+"Blue:"+c[i].getBlue()+"\n";
				 pw.print(testo);
				 i++;
			 }
			 pw.close();
		 }
		 catch(Exception e)
		 {
			
		 }
	 }
	
	public void saveReport(ColourAnalysis image)//Scrivere report su file TXT
	{
		try
		 {
			 String rAvg = "AVG RED: "+image.getRgbAverageColor().getRed()+" AVG GREEN: "+image.getRgbAverageColor().getGreen()+" AVG BLUE: "+image.getRgbAverageColor().getBlue()+"\n";
			 String rMin = "MIN RED: "+image.getRgbMinimumColor().getRed()+" MIN GREEN: "+image.getRgbMinimumColor().getGreen()+" MIN BLUE: "+image.getRgbMinimumColor().getBlue()+"\n";
			 String rMax = "MAX RED: "+image.getRgbMaximumColor().getRed()+" MAX GREEN: "+image.getRgbMaximumColor().getGreen()+" MAX BLUE: "+image.getRgbMaximumColor().getBlue()+"\n";
			 String rNameAvg = "NAME RGB AVG: "+image.getNameAverageColor()+"\n";
			 String rNameMax = "NAME RGB MAX: "+image.getNameMaximumColor()+"\n";
			 String rNameMin = "NAME RGB MIN: "+image.getNameMinimumColor()+"\n";
			 String increment = "INCREMENT: "+image.getIncrement();
			 PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
			 pw.print(rAvg);
			 pw.print(rMin);
			 pw.print(rMax);
			 pw.print(rNameAvg);
			 pw.print(rNameMax);
			 pw.print(rNameMin);
			 pw.print(increment);
			 pw.close();
		 }
		 catch(Exception e)
		 {
			
		 }
	}
	
	public void isFileTxt()//Controllo se il file esiste
	{
		File f = new File(file);
		boolean flag = f.exists();
		if(flag == true)
		{
			f.delete();
		}
	}
 
}
