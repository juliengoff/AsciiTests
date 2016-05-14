package fr.imie.asciitests.entities;

import java.util.ArrayList;

import fr.imie.asciitests.interfaces.EntityLetter;

public class EntityA extends EntityBase implements EntityLetter {

	public EntityA() {
		super();
		this.correspond = "A";
		this.Representation1 = generateRepresentation1();
		this.Representation2 = generateRepresentation2();
	}

	/**
	 * Generate representation for pattern 1
	 * @return ArrayList
	 */
	public ArrayList<String> generateRepresentation1() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(" #  ");
		result.add("# # ");
		result.add("### ");
		result.add("# # ");
		result.add("# # ");
		
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
		result.add("| |      __      | |");
		result.add("| |     /  \\     | |");
		result.add("| |    / /\\ \\    | |");
		result.add("| |   / ____ \\   | |");
		result.add("| | _/ /    \\ \\_ | |");
		result.add("| ||____|  |____|| |");
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

	/**
	 * Get width of the pattern
	 * @param Integer pattern
	 * @return Integer
	 */
	public Integer getWidth(int pattern){
		ArrayList<String> rep;
		if (pattern == 1){
			rep = this.Representation1;
		}else {
			rep = this.Representation2;
		}
		return rep.get(0).length();
	}
	
	/**
	 * Get height of the pattern
	 * @param Integer pattern
	 * @return Integer
	 */
	public Integer getHeight(int pattern){
		ArrayList<String> rep;
		if (pattern == 1){
			rep = this.Representation1;
		}else {
			rep = this.Representation2;
		}
		return rep.size();
	}

	/**
	 * Get corresondence ascii char
	 * @return String
	 */
	public String getCorrespond() {
		// TODO Auto-generated method stub
		return this.correspond;
	}
	
}
