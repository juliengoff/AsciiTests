package fr.imie.asciitests.entities;

import java.util.ArrayList;

import fr.imie.asciitests.interfaces.EntityLetter;

public class EntityI extends EntityBase implements EntityLetter{

	public EntityI() {
		super();
		this.correspond = "I";
		this.Representation1 = generateRepresentation1();
		this.Representation2 = generateRepresentation2();
	}

	public ArrayList<String> generateRepresentation1() {
		ArrayList<String> result = new ArrayList<String>();
		result.add("### ");
		result.add(" #  ");
		result.add(" #  ");
		result.add(" #  ");
		result.add("### ");
		
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
		result.add("| |      | |     | |");
		result.add("| |     _| |_    | |");
		result.add("| |    |_____|   | |");
		result.add("| |              | |");
		result.add("| '--------------' |");
		result.add("'----------------'  ");
	
		for (String string : result) {
			AleaReplace(string);
		}
		return null;
	}

	@Override
	public String getCorrespond() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
