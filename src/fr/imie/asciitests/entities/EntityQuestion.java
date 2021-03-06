package fr.imie.asciitests.entities;

import java.util.ArrayList;

import fr.imie.asciitests.interfaces.EntityLetter;

public class EntityQuestion extends EntityBase implements EntityLetter{

	public EntityQuestion() {
		super();
		this.correspond = "?";
		this.Representation1 = generateRepresentation1();
		this.Representation2 = generateRepresentation2();
	}
	/**
	 * Generate representation for pattern 1
	 * @return ArrayList
	 */
	public ArrayList<String> generateRepresentation1() {
		ArrayList<String> result = new ArrayList<String>();
		result.add("### ");
		result.add("  # ");
		result.add(" ## ");
		result.add("    ");
		result.add(" #  ");
		
		for (String string : result) {
			AleaReplace(string);
		}
		return result;
	}
	/**
	 * Random replace of the char
	 * TODO : Add faker to replace char (only for '#' char)
	 * @param string
	 */
	private void AleaReplace(String string) {
		string.replace('#', genAleaChar());
	}

	private char genAleaChar() {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * Generate representation for pattern 2
	 * @return ArrayList
	 */
	public ArrayList<String> generateRepresentation2() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(" .----------------. ");
		result.add("| .--------------. |");
		result.add("| |    ______    | |");
		result.add("| |   / _ __ `.  | |");
		result.add("| |  |_/____) |  | |");
		result.add("| |    /  ___.'  | |");
		result.add("| |    |_|       | |");
		result.add("| |    (_)       | |");
		result.add("| |              | |");
		result.add("| '--------------' |");
		result.add(" '----------------' ");
	
		for (String string : result) {
			AleaReplace(string);
		}
		return result;
	}


	@Override
	public String getCorrespond() {
		return this.correspond;
	}
	
}
