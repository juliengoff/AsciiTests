package fr.imie.asciitests.entities;

import java.util.ArrayList;

import fr.imie.asciitests.interfaces.EntityLetter;

public class EntityC extends EntityBase implements EntityLetter{
	
	public EntityC() {
		super();
		this.correspond = "C";
		this.Representation1 = generateRepresentation1();
		this.Representation2 = generateRepresentation2();
	}

	/**
	 * Generate representation for pattern 1
	 * @return ArrayList
	 */
	public ArrayList<String> generateRepresentation1() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(" ## ");
		result.add("#   ");
		result.add("#   ");
		result.add("#   ");
		result.add(" ## ");
		
		for (String string : result) {
			AleaReplace(string, 1);
		}
		return result;
	}
	/**
	 * Generate representation for pattern 2
	 * @return ArrayList
	 */
	public ArrayList<String> generateRepresentation2() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(" .----------------. ");
		result.add("| .--------------. |");
		result.add("| |     ______   | |");
		result.add("| |   .' ___  |  | |");
		result.add("| |  / .'   \\_|  | |");
		result.add("| |  | |         | |");
		result.add("| |  \\ `.___.'\\  | |");
		result.add("| |   `._____.'  | |");
		result.add("| |              | |");
		result.add("| '--------------' |");
		result.add(" '----------------' ");
		
		for (String string : result) {
			AleaReplace(string,2);
		}
		return result;
	}

	/**
	 * Random replace of the char
	 * TODO : Add faker to replace char (only for '#' char)
	 * @param string
	 * @param pattern
	 */
	private void AleaReplace(String string, int pattern) {
		if (pattern == 1){
			string.replace('#', super.getRandomChar());
		}else {
			string.replace('/', super.getRandomChar());
			string.replace('_', super.getRandomChar());
			string.replace('\\', super.getRandomChar());
			string.replace('|', super.getRandomChar());
		}
		
	}


	@Override
	public String getCorrespond() {
		return this.correspond;
	}
	
}
