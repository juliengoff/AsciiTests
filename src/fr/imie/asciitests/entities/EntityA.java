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
		
		for (int i = 0; i < result.size(); i++) {
			result.set(i, AleaReplace(result.get(i)));
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
	
		return result;
	}

	/**
	 * Random replace of the char
	 * TODO : Add faker to replace char (only for '#' char)
	 * @param string
	 * @param pattern
	 */
	private String AleaReplace(String string) {
		return string.replace('#', super.getRandomChar());
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
