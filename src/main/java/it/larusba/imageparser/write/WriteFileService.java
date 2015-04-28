package it.larusba.imageparser.write;
import it.larusba.imageparser.domain.ColourAnalysis;

import java.awt.Color;

public class WriteFileService
{
	private String tipo;
	private WriteFileCsv writeFileCsv;
	private WriteFileTxt writeFileTxt;
	
	public WriteFileService(String file)//Inizializzare i file
	{
		this.tipo = file;
		writeFileTxt = new WriteFileTxt(tipo);
		writeFileCsv = new WriteFileCsv(tipo);
	}
	
	public void saveReport(ColourAnalysis image, boolean flag)
	{
		IWriteFile writeFile = null;
		if(flag == true)
		{
			writeFile = new WriteFileTxt(tipo);
			
		}
		else
		{
			writeFile = new WriteFileCsv(tipo);
		}
		
		writeFile.saveReport(image);
	}
	
	public void savePixel(Color[] c, boolean flag)
	{
		IWriteFile writeFile = null;
		if(flag == true)
		{
			writeFile = new WriteFileTxt(tipo);
		}
		else
		{
			writeFile = new WriteFileCsv(tipo);
		}
		writeFile.savePixel(c);
	}
	
	public void inizializeFile()
	{
		writeFileTxt.isFileTxt();
		writeFileCsv.isFileCsv();
		writeFileCsv.createSheet();
	}
}
