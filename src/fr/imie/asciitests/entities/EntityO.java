package fr.imie.asciitests.entities;

import java.util.ArrayList;

public class EntityO extends EntityBase {

	public EntityO() {
		super();
		this.correspond = "O";
		this.Representation1 = generateRepresentation1();
		this.Representation2 = generateRepresentation2();
	}

	public ArrayList<String> generateRepresentation1() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(" #  ");
		result.add("# # ");
		result.add("# # ");
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
		result.add("| |     ____     | |");
		result.add("| |   .'    `.   | |");
		result.add("| |  /  .--.  \\  | |");
		result.add("| |  | |    | |  | |");
		result.add("| |  \\  `--'  /  | |");
		result.add("| |   `.____.'   | |");
		result.add("| |              | |");
		result.add("| '--------------' |");
		result.add("'----------------' ");
	
		for (String string : result) {
			AleaReplace(string);
		}
		return null;
	}
	
}
