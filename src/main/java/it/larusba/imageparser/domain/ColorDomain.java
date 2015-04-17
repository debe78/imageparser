package it.larusba.imageparser.domain;

import java.util.ArrayList;

public class ColorDomain {
	private int r, g, b;
	private String name;

	public ColorDomain(String name, int r, int g, int b)// Inizializzo i colori
														// RGB e li converto da
														// HEX a INT
	{
		this.r = r;
		this.g = g;
		this.b = b;
		this.name = name;
	}

	public ColorDomain() {

	}

	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}

	public String getName() {
		return name;
	}

	public ArrayList<ColorDomain> initColorList()// Lista colori
	{
		ArrayList<ColorDomain> colorList = new ArrayList<ColorDomain>();
		colorList.add(new ColorDomain("AliceBlue", 0xF0, 0xF8, 0xFF));
		colorList.add(new ColorDomain("AntiqueWhite", 0xFA, 0xEB, 0xD7));
		colorList.add(new ColorDomain("Aqua", 0x00, 0xFF, 0xFF));
		colorList.add(new ColorDomain("Aquamarine", 0x7F, 0xFF, 0xD4));
		colorList.add(new ColorDomain("Azure", 0xF0, 0xFF, 0xFF));
		colorList.add(new ColorDomain("Beige", 0xF5, 0xF5, 0xDC));
		colorList.add(new ColorDomain("Bisque", 0xFF, 0xE4, 0xC4));
		colorList.add(new ColorDomain("Black", 0x00, 0x00, 0x00));
		colorList.add(new ColorDomain("BlanchedAlmond", 0xFF, 0xEB, 0xCD));
		colorList.add(new ColorDomain("Blue", 0x00, 0x00, 0xFF));
		colorList.add(new ColorDomain("BlueViolet", 0x8A, 0x2B, 0xE2));
		colorList.add(new ColorDomain("Brown", 0xA5, 0x2A, 0x2A));
		colorList.add(new ColorDomain("BurlyWood", 0xDE, 0xB8, 0x87));
		colorList.add(new ColorDomain("CadetBlue", 0x5F, 0x9E, 0xA0));
		colorList.add(new ColorDomain("Chartreuse", 0x7F, 0xFF, 0x00));
		colorList.add(new ColorDomain("Chocolate", 0xD2, 0x69, 0x1E));
		colorList.add(new ColorDomain("Coral", 0xFF, 0x7F, 0x50));
		colorList.add(new ColorDomain("CornflowerBlue", 0x64, 0x95, 0xED));
		colorList.add(new ColorDomain("Cornsilk", 0xFF, 0xF8, 0xDC));
		colorList.add(new ColorDomain("Crimson", 0xDC, 0x14, 0x3C));
		colorList.add(new ColorDomain("Cyan", 0x00, 0xFF, 0xFF));
		colorList.add(new ColorDomain("DarkBlue", 0x00, 0x00, 0x8B));
		colorList.add(new ColorDomain("DarkCyan", 0x00, 0x8B, 0x8B));
		colorList.add(new ColorDomain("DarkGoldenRod", 0xB8, 0x86, 0x0B));
		colorList.add(new ColorDomain("DarkGray", 0xA9, 0xA9, 0xA9));
		colorList.add(new ColorDomain("DarkGreen", 0x00, 0x64, 0x00));
		colorList.add(new ColorDomain("DarkKhaki", 0xBD, 0xB7, 0x6B));
		colorList.add(new ColorDomain("DarkMagenta", 0x8B, 0x00, 0x8B));
		colorList.add(new ColorDomain("DarkOliveGreen", 0x55, 0x6B, 0x2F));
		colorList.add(new ColorDomain("DarkOrange", 0xFF, 0x8C, 0x00));
		colorList.add(new ColorDomain("DarkOrchid", 0x99, 0x32, 0xCC));
		colorList.add(new ColorDomain("DarkRed", 0x8B, 0x00, 0x00));
		colorList.add(new ColorDomain("DarkSalmon", 0xE9, 0x96, 0x7A));
		colorList.add(new ColorDomain("DarkSeaGreen", 0x8F, 0xBC, 0x8F));
		colorList.add(new ColorDomain("DarkSlateBlue", 0x48, 0x3D, 0x8B));
		colorList.add(new ColorDomain("DarkSlateGray", 0x2F, 0x4F, 0x4F));
		colorList.add(new ColorDomain("DarkTurquoise", 0x00, 0xCE, 0xD1));
		colorList.add(new ColorDomain("DarkViolet", 0x94, 0x00, 0xD3));
		colorList.add(new ColorDomain("DeepPink", 0xFF, 0x14, 0x93));
		colorList.add(new ColorDomain("DeepSkyBlue", 0x00, 0xBF, 0xFF));
		colorList.add(new ColorDomain("DimGray", 0x69, 0x69, 0x69));
		colorList.add(new ColorDomain("DodgerBlue", 0x1E, 0x90, 0xFF));
		colorList.add(new ColorDomain("FireBrick", 0xB2, 0x22, 0x22));
		colorList.add(new ColorDomain("FloralWhite", 0xFF, 0xFA, 0xF0));
		colorList.add(new ColorDomain("ForestGreen", 0x22, 0x8B, 0x22));
		colorList.add(new ColorDomain("FalunRed", 128, 24, 24));
		colorList.add(new ColorDomain("Fuchsia", 0xFF, 0x00, 0xFF));
		colorList.add(new ColorDomain("Gainsboro", 0xDC, 0xDC, 0xDC));
		colorList.add(new ColorDomain("GhostWhite", 0xF8, 0xF8, 0xFF));
		colorList.add(new ColorDomain("Gold", 0xFF, 0xD7, 0x00));
		colorList.add(new ColorDomain("GoldenRod", 0xDA, 0xA5, 0x20));
		colorList.add(new ColorDomain("Gray", 0x80, 0x80, 0x80));
		colorList.add(new ColorDomain("Green", 0, 255, 0));
		colorList.add(new ColorDomain("GreenYellow", 0xAD, 0xFF, 0x2F));
		colorList.add(new ColorDomain("HoneyDew", 0xF0, 0xFF, 0xF0));
		colorList.add(new ColorDomain("HotPink", 0xFF, 0x69, 0xB4));
		colorList.add(new ColorDomain("IndianRed", 0xCD, 0x5C, 0x5C));
		colorList.add(new ColorDomain("Indigo", 0x4B, 0x00, 0x82));
		colorList.add(new ColorDomain("Ivory", 0xFF, 0xFF, 0xF0));
		colorList.add(new ColorDomain("Khaki", 0xF0, 0xE6, 0x8C));
		colorList.add(new ColorDomain("Lavender", 0xE6, 0xE6, 0xFA));
		colorList.add(new ColorDomain("LavenderBlush", 0xFF, 0xF0, 0xF5));
		colorList.add(new ColorDomain("LawnGreen", 0x7C, 0xFC, 0x00));
		colorList.add(new ColorDomain("LemonChiffon", 0xFF, 0xFA, 0xCD));
		colorList.add(new ColorDomain("LightBlue", 0xAD, 0xD8, 0xE6));
		colorList.add(new ColorDomain("LightCoral", 0xF0, 0x80, 0x80));
		colorList.add(new ColorDomain("LightCyan", 0xE0, 0xFF, 0xFF));
		colorList.add(new ColorDomain("LightGoldenRodYellow", 0xFA, 0xFA, 0xD2));
		colorList.add(new ColorDomain("LightGray", 0xD3, 0xD3, 0xD3));
		colorList.add(new ColorDomain("LightGreen", 0x90, 0xEE, 0x90));
		colorList.add(new ColorDomain("LightPink", 0xFF, 0xB6, 0xC1));
		colorList.add(new ColorDomain("LightSalmon", 0xFF, 0xA0, 0x7A));
		colorList.add(new ColorDomain("LightSeaGreen", 0x20, 0xB2, 0xAA));
		colorList.add(new ColorDomain("LightSkyBlue", 0x87, 0xCE, 0xFA));
		colorList.add(new ColorDomain("LightSlateGray", 0x77, 0x88, 0x99));
		colorList.add(new ColorDomain("LightSteelBlue", 0xB0, 0xC4, 0xDE));
		colorList.add(new ColorDomain("LightYellow", 0xFF, 0xFF, 0xE0));
		colorList.add(new ColorDomain("Lime", 0x00, 0xFF, 0x00));
		colorList.add(new ColorDomain("LimeGreen", 0x32, 0xCD, 0x32));
		colorList.add(new ColorDomain("Linen", 0xFA, 0xF0, 0xE6));
		colorList.add(new ColorDomain("Magenta", 0xFF, 0x00, 0xFF));
		colorList.add(new ColorDomain("Maroon", 0x80, 0x00, 0x00));
		colorList.add(new ColorDomain("MediumAquaMarine", 0x66, 0xCD, 0xAA));
		colorList.add(new ColorDomain("MediumBlue", 0x00, 0x00, 0xCD));
		colorList.add(new ColorDomain("MediumOrchid", 0xBA, 0x55, 0xD3));
		colorList.add(new ColorDomain("MediumPurple", 0x93, 0x70, 0xDB));
		colorList.add(new ColorDomain("MediumSeaGreen", 0x3C, 0xB3, 0x71));
		colorList.add(new ColorDomain("MediumSlateBlue", 0x7B, 0x68, 0xEE));
		colorList.add(new ColorDomain("MediumSpringGreen", 0x00, 0xFA, 0x9A));
		colorList.add(new ColorDomain("MediumTurquoise", 0x48, 0xD1, 0xCC));
		colorList.add(new ColorDomain("MediumVioletRed", 0xC7, 0x15, 0x85));
		colorList.add(new ColorDomain("MidnightBlue", 0x19, 0x19, 0x70));
		colorList.add(new ColorDomain("MintCream", 0xF5, 0xFF, 0xFA));
		colorList.add(new ColorDomain("MistyRose", 0xFF, 0xE4, 0xE1));
		colorList.add(new ColorDomain("Moccasin", 0xFF, 0xE4, 0xB5));
		colorList.add(new ColorDomain("NavajoWhite", 0xFF, 0xDE, 0xAD));
		colorList.add(new ColorDomain("Navy", 0x00, 0x00, 0x80));
		colorList.add(new ColorDomain("OldLace", 0xFD, 0xF5, 0xE6));
		colorList.add(new ColorDomain("Olive", 0x80, 0x80, 0x00));
		colorList.add(new ColorDomain("OliveDrab", 0x6B, 0x8E, 0x23));
		colorList.add(new ColorDomain("Orange", 0xFF, 0xA5, 0x00));
		colorList.add(new ColorDomain("OrangeRed", 0xFF, 0x45, 0x00));
		colorList.add(new ColorDomain("Orchid", 0xDA, 0x70, 0xD6));
		colorList.add(new ColorDomain("PaleGoldenRod", 0xEE, 0xE8, 0xAA));
		colorList.add(new ColorDomain("PaleGreen", 0x98, 0xFB, 0x98));
		colorList.add(new ColorDomain("PaleTurquoise", 0xAF, 0xEE, 0xEE));
		colorList.add(new ColorDomain("PaleVioletRed", 0xDB, 0x70, 0x93));
		colorList.add(new ColorDomain("PapayaWhip", 0xFF, 0xEF, 0xD5));
		colorList.add(new ColorDomain("PeachPuff", 0xFF, 0xDA, 0xB9));
		colorList.add(new ColorDomain("Peru", 0xCD, 0x85, 0x3F));
		colorList.add(new ColorDomain("Pink", 0xFF, 0xC0, 0xCB));
		colorList.add(new ColorDomain("Plum", 0xDD, 0xA0, 0xDD));
		colorList.add(new ColorDomain("PowderBlue", 0xB0, 0xE0, 0xE6));
		colorList.add(new ColorDomain("Purple", 0x80, 0x00, 0x80));
		colorList.add(new ColorDomain("Red", 0xFF, 0x00, 0x00));
		colorList.add(new ColorDomain("RosyBrown", 0xBC, 0x8F, 0x8F));
		colorList.add(new ColorDomain("RoyalBlue", 0x41, 0x69, 0xE1));
		colorList.add(new ColorDomain("SaddleBrown", 0x8B, 0x45, 0x13));
		colorList.add(new ColorDomain("Salmon", 0xFA, 0x80, 0x72));
		colorList.add(new ColorDomain("SandyBrown", 0xF4, 0xA4, 0x60));
		colorList.add(new ColorDomain("SeaGreen", 0x2E, 0x8B, 0x57));
		colorList.add(new ColorDomain("SeaShell", 0xFF, 0xF5, 0xEE));
		colorList.add(new ColorDomain("Sienna", 0xA0, 0x52, 0x2D));
		colorList.add(new ColorDomain("Silver", 0xC0, 0xC0, 0xC0));
		colorList.add(new ColorDomain("SkyBlue", 0x87, 0xCE, 0xEB));
		colorList.add(new ColorDomain("SlateBlue", 0x6A, 0x5A, 0xCD));
		colorList.add(new ColorDomain("SlateGray", 0x70, 0x80, 0x90));
		colorList.add(new ColorDomain("Snow", 0xFF, 0xFA, 0xFA));
		colorList.add(new ColorDomain("SpringGreen", 0x00, 0xFF, 0x7F));
		colorList.add(new ColorDomain("SteelBlue", 0x46, 0x82, 0xB4));
		colorList.add(new ColorDomain("Tan", 0xD2, 0xB4, 0x8C));
		colorList.add(new ColorDomain("Teal", 0x00, 0x80, 0x80));
		colorList.add(new ColorDomain("Thistle", 0xD8, 0xBF, 0xD8));
		colorList.add(new ColorDomain("Tomato", 0xFF, 0x63, 0x47));
		colorList.add(new ColorDomain("Turquoise", 0x40, 0xE0, 0xD0));
		colorList.add(new ColorDomain("Violet", 0xEE, 0x82, 0xEE));
		colorList.add(new ColorDomain("Wheat", 0xF5, 0xDE, 0xB3));
		colorList.add(new ColorDomain("White", 0xFF, 0xFF, 0xFF));
		colorList.add(new ColorDomain("WhiteSmoke", 0xF5, 0xF5, 0xF5));
		colorList.add(new ColorDomain("Yellow", 0xFF, 0xFF, 0x00));
		colorList.add(new ColorDomain("YellowGreen", 0x9A, 0xCD, 0x32));
		return colorList;
	}

	public String getColorName(int r, int g, int b)// Ritorno il nome del colore
													// medio
	{
		ArrayList<ColorDomain> colorList = initColorList();
		ColorDomain trovato = null;
		int minMSE = Integer.MAX_VALUE;
		int mse;
		for (ColorDomain c : colorList) {
			mse = c.computeMSE(r, g, b);
			if (mse < minMSE) {
				minMSE = mse;
				trovato = c;// Se colore trovato setto ColorName a il colore
			}
		}

		if (trovato != null) {
			return trovato.getName();
		} else {
			return "Colore non presente nella lista!";
		}
	}

	public int computeMSE(int pixR, int pixG, int pixB) {
		return ((pixR - r) * (pixR - r) + (pixG - g) * (pixG - g) + (pixB - b)
				* (pixB - b)) / 3;
	}
}
