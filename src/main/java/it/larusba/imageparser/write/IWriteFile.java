package it.larusba.imageparser.write;

import it.larusba.imageparser.domain.ColourAnalysis;

import java.awt.Color;


public interface IWriteFile {
	
  void saveReport(ColourAnalysis image);
  
  void savePixel(Color[] c);

}
