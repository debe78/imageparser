package it.larusba.imageparser;

import static org.junit.Assert.assertEquals;
import it.larusba.imageparser.domain.ImageColor;
import it.larusba.imageparser.utility.ImageManager;

import java.awt.Color;
import java.io.File;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import org.junit.Assert;
import org.junit.Test;

public class ImageManagerTest 
{

	@Test
	public void avgMinMaxBlackImageTest() 
	{
		try
		{
			File file = Paths.get("K:\\Progetti\\ArtProject\\Software\\Git\\imageparser\\src\\test\\resources\\BlackImage.PNG").toFile();
			ImageManager imageManager = new ImageManager(ImageIO.read(file ));
			ImageColor analyzeImage = imageManager.analyzeImage();
			
			Color avg = new Color(0,0,0);
			assertEquals(analyzeImage.getRgbAverageColor(),avg);
			Color min = new Color(0,0,0);
			assertEquals(analyzeImage.getRgbMinimumColor(),min);
			Color max = new Color(0,0,0);
			assertEquals(analyzeImage.getRgbMaximumColor(),max);
			
			Assert.assertEquals(analyzeImage.getNameAverageColor(), "Black");
			Assert.assertEquals(analyzeImage.getNameMaximumColor(), "Black");
			Assert.assertEquals(analyzeImage.getNameMinimumColor(), "Black");
		}
		catch(Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
	
	
	@Test
	public void avgMinMaxVincentVanGoghBranchesOfAnAlmondTreeInRedTest() 
	{
		try
		{
			File file = Paths.get("K:\\Progetti\\ArtProject\\Software\\Git\\imageparser\\src\\test\\resources\\vincent-van-gogh-branches-of-an-almond-tree-in-red.jpg").toFile();
			ImageManager imageManager = new ImageManager(ImageIO.read(file ));
			ImageColor analyzeImage = imageManager.analyzeImage();
			
			System.out.println("AVG name:"+analyzeImage.getNameAverageColor());
			System.out.println("MAX name:"+analyzeImage.getNameMaximumColor());
			System.out.println("MIN name:"+analyzeImage.getNameMinimumColor());
			System.out.println("AVG :"+analyzeImage.getRgbAverageColor().toString());
			System.out.println("Max :"+analyzeImage.getRgbMaximumColor().toString());
			System.out.println("Min :"+analyzeImage.getRgbMinimumColor().toString());
			
			Color avg = new Color(138,31,27);
			assertEquals(analyzeImage.getRgbAverageColor(),avg);
			Color min = new Color(0,4,0);
			assertEquals(analyzeImage.getRgbMinimumColor(),min);
			Color max = new Color(255,168,166);
			assertEquals(analyzeImage.getRgbMaximumColor(),max);
			
			Assert.assertEquals(analyzeImage.getNameAverageColor(), "FalunRed");
			Assert.assertEquals(analyzeImage.getNameMaximumColor(), "LightPink");
			Assert.assertEquals(analyzeImage.getNameMinimumColor(), "Black");
		}
		catch(Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}

}
