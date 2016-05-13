package fr.imie.asciitests.entities;

import java.util.ArrayList;

import fr.imie.asciitests.interfaces.EntityLetter;

public class EntityL extends EntityBase implements EntityLetter{

	public EntityL() {
		super();
		this.correspond = "L";
		this.Representation1 = generateRepresentation1();
	}

	public ArrayList<String> generateRepresentation1() {
		
		ArrayList<String> result = new ArrayList<String>();
		result.add("#   ");
		result.add("#   ");
		result.add("#   ");
		result.add("#   ");
		result.add("### ");
		
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
		result.add("| |   _____      | |");
		result.add("| |  |_   _|     | |");
		result.add("| |    | |       | |");
		result.add("| |    | |   _   | |");
		result.add("| |   _| |__/ |  | |");
		result.add("| |  |________|  | |");
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
