package it.larusba.imageparser.write;

import it.larusba.imageparser.domain.ImageColor;

import java.awt.Color;


public interface IWriteFile {
	
  void saveReport(ImageColor image);
  
  void savePixel(Color[] c);

}
