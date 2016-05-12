package fr.imie.asciitests.entities;

import java.util.ArrayList;

public class EntityJ extends EntityBase {

	public EntityJ() {
		super();
		this.correspond = "J";
		this.Representation1 = generateRepresentation1();
	}

	public ArrayList<String> generateRepresentation1() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(" ## ");
		result.add("  # ");
		result.add("  # ");
		result.add("# # ");
		result.add(" #  ");
		
		for (String string : result) {
			AleaReplace(string);
		}
		return null;
	}

	private void AleaReplace(String string) {
		string.replace('#', genAleaChar());
	}

	private char genAleaChar() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public ArrayList<String> generateRepresentation2() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(".----------------.  ");
		result.add("| .--------------. |");
		result.add("| |     _____    | |");
		result.add("| |    |_   _|   | |");
		result.add("| |      | |     | |");
		result.add("| |   _  | |     | |");
		result.add("| |  | |_' |     | |");
		result.add("| |  `.___.'     | |");
		result.add("| |              | |");
		result.add("| '--------------' |");
		result.add("'----------------' ");
	
		for (String string : result) {
			AleaReplace(string);
		}
		return null;
	}
	
	
}
