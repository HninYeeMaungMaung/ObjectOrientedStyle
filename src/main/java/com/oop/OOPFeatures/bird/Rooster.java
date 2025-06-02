package com.oop.OOPFeatures.bird;

/**
 * 
 * QE
 * 
 * Added Rooster for Question no: E
 *
 */
public class Rooster extends Chicken {
	@Override
	public void sing() {
		String singing = "Cock-a-doodle-doo";
		
		switch(secondLanguage) {
			case "Danish":
				singing = "kykyliky";
				break;
			case "Dutch":
				singing = "kukeleku";
				break;
			case "Finnish":
				singing = "kukko kiekuu";
				break;
			case "French":
				singing = "cocorico";
				break;
			case "German":
				singing = "kikeriki";
				break;
			case "Hebrew":
				singing = "kikiriki";
				break;
			case "Greek":
				singing = "coo-koo-ri-koo";
				break;
			case "Hungarian":
				singing = "kukuriku";
				break;
			case "Italian":
				singing = "chicchirich";
				break;
			case "Japanese":
				singing = "ko-ke-kok-ko-o";
				break;
			case "Portuguese":
				singing = "cucurucu";
				break;
			case "Russian":
				singing = "kukareku";
				break;
			case "Swedish":
				singing = "kuckeliku";
				break;
			case "Turkish":
				singing = "kuk-kurri-kuuu";
				break;
			case "Urdu":
				singing = "kuklooku";
				break;
		}
		
		System.out.print(singing);
	}

	@Override
	public String toString() {
		return "Rooster : male adult chicken";
	}	
}
