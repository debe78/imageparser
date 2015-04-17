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
			File file = Paths.get("/home/larus/git/imageparser/src/test/resources/BlackImage.PNG").toFile();
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
	public void avgMinMaxWhiteTest() 
	{
		try
		{
			File file = Paths.get("/home/larus/git/imageparser/src/test/resources/white.png").toFile();
			ImageManager imageManager = new ImageManager(ImageIO.read(file ));
			ImageColor analyzeImage = imageManager.analyzeImage();
			
			System.out.println("AVG name:"+analyzeImage.getNameAverageColor());
			System.out.println("MAX name:"+analyzeImage.getNameMaximumColor());
			System.out.println("MIN name:"+analyzeImage.getNameMinimumColor());
			System.out.println("AVG :"+analyzeImage.getRgbAverageColor().toString());
			System.out.println("Max :"+analyzeImage.getRgbMaximumColor().toString());
			System.out.println("Min :"+analyzeImage.getRgbMinimumColor().toString());
			
			Color avg = new Color(255,255,255);
			assertEquals(analyzeImage.getRgbAverageColor(),avg);
			Color min = new Color(255,255,255);
			assertEquals(analyzeImage.getRgbMinimumColor(),min);
			Color max = new Color(255,255,255);
			assertEquals(analyzeImage.getRgbMaximumColor(),max);
			
			Assert.assertEquals(analyzeImage.getNameAverageColor(), "White");
			Assert.assertEquals(analyzeImage.getNameMaximumColor(), "White");
			Assert.assertEquals(analyzeImage.getNameMinimumColor(), "White");
		}
		catch(Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void avgMinMaxRedTest() 
	{
		try
		{
			File file = Paths.get("/home/larus/git/imageparser/src/test/resources/redImage.png").toFile();
			ImageManager imageManager = new ImageManager(ImageIO.read(file ));
			ImageColor analyzeImage = imageManager.analyzeImage();
			
			System.out.println("AVG name:"+analyzeImage.getNameAverageColor());
			System.out.println("MAX name:"+analyzeImage.getNameMaximumColor());
			System.out.println("MIN name:"+analyzeImage.getNameMinimumColor());
			System.out.println("AVG :"+analyzeImage.getRgbAverageColor().toString());
			System.out.println("Max :"+analyzeImage.getRgbMaximumColor().toString());
			System.out.println("Min :"+analyzeImage.getRgbMinimumColor().toString());
			
			Color avg = new Color(255,0,0);
			assertEquals(analyzeImage.getRgbAverageColor(),avg);
			Color min = new Color(255,0,0);
			assertEquals(analyzeImage.getRgbMinimumColor(),min);
			Color max = new Color(255,0,0);
			assertEquals(analyzeImage.getRgbMaximumColor(),max);
			
			Assert.assertEquals(analyzeImage.getNameAverageColor(), "Red");
			Assert.assertEquals(analyzeImage.getNameMaximumColor(), "Red");
			Assert.assertEquals(analyzeImage.getNameMinimumColor(), "Red");
		}
		catch(Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void avgMinMaxGreenTest() 
	{
		try
		{
			File file = Paths.get("/home/larus/git/imageparser/src/test/resources/greenImage.png").toFile();
			ImageManager imageManager = new ImageManager(ImageIO.read(file ));
			ImageColor analyzeImage = imageManager.analyzeImage();
			
			System.out.println("AVG name:"+analyzeImage.getNameAverageColor());
			System.out.println("MAX name:"+analyzeImage.getNameMaximumColor());
			System.out.println("MIN name:"+analyzeImage.getNameMinimumColor());
			System.out.println("AVG :"+analyzeImage.getRgbAverageColor().toString());
			System.out.println("Max :"+analyzeImage.getRgbMaximumColor().toString());
			System.out.println("Min :"+analyzeImage.getRgbMinimumColor().toString());
			
			Color avg = new Color(0,255,0);
			assertEquals(analyzeImage.getRgbAverageColor(),avg);
			Color min = new Color(0,255,0);
			assertEquals(analyzeImage.getRgbMinimumColor(),min);
			Color max = new Color(0,255,0);
			assertEquals(analyzeImage.getRgbMaximumColor(),max);
			
			Assert.assertEquals(analyzeImage.getNameAverageColor(), "Green");
			Assert.assertEquals(analyzeImage.getNameMaximumColor(), "Green");
			Assert.assertEquals(analyzeImage.getNameMinimumColor(), "Green");
		}
		catch(Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void avgMinMaxBlueTest() 
	{
		try
		{
			File file = Paths.get("/home/larus/git/imageparser/src/test/resources/blueImage.png").toFile();
			ImageManager imageManager = new ImageManager(ImageIO.read(file ));
			ImageColor analyzeImage = imageManager.analyzeImage();
			
			System.out.println("AVG name:"+analyzeImage.getNameAverageColor());
			System.out.println("MAX name:"+analyzeImage.getNameMaximumColor());
			System.out.println("MIN name:"+analyzeImage.getNameMinimumColor());
			System.out.println("AVG :"+analyzeImage.getRgbAverageColor().toString());
			System.out.println("Max :"+analyzeImage.getRgbMaximumColor().toString());
			System.out.println("Min :"+analyzeImage.getRgbMinimumColor().toString());
			
			Color avg = new Color(0,0,255);
			assertEquals(analyzeImage.getRgbAverageColor(),avg);
			Color min = new Color(0,0,255);
			assertEquals(analyzeImage.getRgbMinimumColor(),min);
			Color max = new Color(0,0,255);
			assertEquals(analyzeImage.getRgbMaximumColor(),max);
			
			Assert.assertEquals(analyzeImage.getNameAverageColor(), "Blue");
			Assert.assertEquals(analyzeImage.getNameMaximumColor(), "Blue");
			Assert.assertEquals(analyzeImage.getNameMinimumColor(), "Blue");
		}
		catch(Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void avgMinMaxOnePixelWhiteTest() 
	{
		try
		{
			File file = Paths.get("/home/larus/git/imageparser/src/test/resources/onePixelWhite.png").toFile();
			ImageManager imageManager = new ImageManager(ImageIO.read(file ));
			ImageColor analyzeImage = imageManager.analyzeImage();
			
			System.out.println("AVG name:"+analyzeImage.getNameAverageColor());
			System.out.println("MAX name:"+analyzeImage.getNameMaximumColor());
			System.out.println("MIN name:"+analyzeImage.getNameMinimumColor());
			System.out.println("AVG :"+analyzeImage.getRgbAverageColor().toString());
			System.out.println("Max :"+analyzeImage.getRgbMaximumColor().toString());
			System.out.println("Min :"+analyzeImage.getRgbMinimumColor().toString());
			
			Color avg = new Color(0,0,0);
			assertEquals(analyzeImage.getRgbAverageColor(),avg);
			Color min = new Color(0,0,0);
			assertEquals(analyzeImage.getRgbMinimumColor(),min);
			Color max = new Color(255,255,255);
			assertEquals(analyzeImage.getRgbMaximumColor(),max);
			
			Assert.assertEquals(analyzeImage.getNameAverageColor(), "Black");
			Assert.assertEquals(analyzeImage.getNameMaximumColor(), "White");
			Assert.assertEquals(analyzeImage.getNameMinimumColor(), "Black");
		}
		catch(Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void avgMinMaxOnePixelBlackTest() 
	{
		try
		{
			File file = Paths.get("/home/larus/git/imageparser/src/test/resources/onePixelBlack.png").toFile();
			ImageManager imageManager = new ImageManager(ImageIO.read(file ));
			ImageColor analyzeImage = imageManager.analyzeImage();
			
			System.out.println("AVG name:"+analyzeImage.getNameAverageColor());
			System.out.println("MAX name:"+analyzeImage.getNameMaximumColor());
			System.out.println("MIN name:"+analyzeImage.getNameMinimumColor());
			System.out.println("AVG :"+analyzeImage.getRgbAverageColor().toString());
			System.out.println("Max :"+analyzeImage.getRgbMaximumColor().toString());
			System.out.println("Min :"+analyzeImage.getRgbMinimumColor().toString());
			
			Color avg = new Color(254,254,254);
			assertEquals(analyzeImage.getRgbAverageColor(),avg);
			Color min = new Color(0,0,0);
			assertEquals(analyzeImage.getRgbMinimumColor(),min);
			Color max = new Color(255,255,255);
			assertEquals(analyzeImage.getRgbMaximumColor(),max);
			
			Assert.assertEquals(analyzeImage.getNameAverageColor(), "White");
			Assert.assertEquals(analyzeImage.getNameMaximumColor(), "White");
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
			File file = Paths.get("/home/larus/git/imageparser/src/test/resources/vincent-van-gogh-branches-of-an-almond-tree-in-red.jpg").toFile();
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
	
	@Test
	public void avgMinMaxThe_Sower_painting_by_Van_GoghTest() 
	{
		try
		{
			File file = Paths.get("/home/larus/git/imageparser/src/test/resources/The_Sower_-_painting_by_Van_Gogh.jpg").toFile();
			ImageManager imageManager = new ImageManager(ImageIO.read(file ));
			ImageColor analyzeImage = imageManager.analyzeImage();
			
			System.out.println("AVG name:"+analyzeImage.getNameAverageColor());
			System.out.println("MAX name:"+analyzeImage.getNameMaximumColor());
			System.out.println("MIN name:"+analyzeImage.getNameMinimumColor());
			System.out.println("AVG :"+analyzeImage.getRgbAverageColor().toString());
			System.out.println("Max :"+analyzeImage.getRgbMaximumColor().toString());
			System.out.println("Min :"+analyzeImage.getRgbMinimumColor().toString());
			
			Color avg = new Color(103,98,73);
			assertEquals(analyzeImage.getRgbAverageColor(),avg);
			Color min = new Color(25,78,94);
			assertEquals(analyzeImage.getRgbMinimumColor(),min);
			Color max = new Color(204,195,140);
			assertEquals(analyzeImage.getRgbMaximumColor(),max);
			
			Assert.assertEquals(analyzeImage.getNameAverageColor(), "DimGray");
			Assert.assertEquals(analyzeImage.getNameMaximumColor(), "Tan");
			Assert.assertEquals(analyzeImage.getNameMinimumColor(), "DarkSlateGray");
		}
		catch(Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
	
	@Test
	public void avgMinMaxvangoghbridge() 
	{
		try
		{
			File file = Paths.get("/home/larus/git/imageparser/src/test/resources/van-gogh-bridge.jpg").toFile();
			ImageManager imageManager = new ImageManager(ImageIO.read(file ));
			ImageColor analyzeImage = imageManager.analyzeImage();
			
			System.out.println("AVG name:"+analyzeImage.getNameAverageColor());
			System.out.println("MAX name:"+analyzeImage.getNameMaximumColor());
			System.out.println("MIN name:"+analyzeImage.getNameMinimumColor());
			System.out.println("AVG :"+analyzeImage.getRgbAverageColor().toString());
			System.out.println("Max :"+analyzeImage.getRgbMaximumColor().toString());
			System.out.println("Min :"+analyzeImage.getRgbMinimumColor().toString());
			
			Color avg = new Color(100,123,120);
			assertEquals(analyzeImage.getRgbAverageColor(),avg);
			Color min = new Color(0,0,0);
			assertEquals(analyzeImage.getRgbMinimumColor(),min);
			Color max = new Color(255,237,174);
			assertEquals(analyzeImage.getRgbMaximumColor(),max);
			
			Assert.assertEquals(analyzeImage.getNameAverageColor(), "DimGray");
			Assert.assertEquals(analyzeImage.getNameMaximumColor(), "Moccasin");
			Assert.assertEquals(analyzeImage.getNameMinimumColor(), "Black");
		}
		catch(Exception e)
		{
			Assert.fail(e.getMessage());
		}
	}
	
}
