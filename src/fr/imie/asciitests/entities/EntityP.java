package fr.imie.asciitests.entities;

import java.util.ArrayList;

import fr.imie.asciitests.interfaces.EntityLetter;

public class EntityP extends EntityBase implements EntityLetter{

	public EntityP() {
		super();
		this.correspond = "P";
		this.Representation1 = generateRepresentation1();
		this.Representation2 = generateRepresentation2();
	}

	public ArrayList<String> generateRepresentation1() {
		ArrayList<String> result = new ArrayList<String>();
		result.add("##  ");
		result.add("# # ");
		result.add("##  ");
		result.add("#   ");
		result.add("#   ");
		
		for (String string : result) {
			AleaReplace(string);
		}
		return result;
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
		result.add(" .----------------. ");
		result.add("| .--------------. |");
		result.add("| |   ______     | |");
		result.add("| |  |_   __ \\   | |");
		result.add("| |    | |__) |  | |");
		result.add("| |    |  ___/   | |");
		result.add("| |   _| |_      | |");
		result.add("| |  |_____|     | |");
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
