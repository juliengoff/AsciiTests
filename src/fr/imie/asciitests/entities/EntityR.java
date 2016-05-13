package fr.imie.asciitests.entities;

import java.util.ArrayList;

import fr.imie.asciitests.interfaces.EntityLetter;

public class EntityR extends EntityBase implements EntityLetter{

	public EntityR() {
		super();
		this.correspond = "R";
		this.Representation1 = generateRepresentation1();
		this.Representation2 = generateRepresentation2();
	}

	public ArrayList<String> generateRepresentation1() {
		ArrayList<String> result = new ArrayList<String>();
		result.add("##  ");
		result.add("# # ");
		result.add("##  ");
		result.add("# # ");
		result.add("# # ");
		
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
		result.add("| |  _______     | |");
		result.add("| | |_   __ \\    | |");
		result.add("| |   | |__) |   | |");
		result.add("| |   |  __ /    | |");
		result.add("| |  _| |  \\ \\_  | |");
		result.add("| | |____| |___| | |");
		result.add("| |              | |");
		result.add("| '--------------' |");
		result.add("'----------------' ");
	
		for (String string : result) {
			AleaReplace(string);
		}
		return null;
	}
}
