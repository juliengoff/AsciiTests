package fr.imie.asciitests.entities;

import java.util.ArrayList;

import fr.imie.asciitests.interfaces.EntityLetter;

public class EntityF extends EntityBase implements EntityLetter{
	
	public EntityF() {
		super();
		this.correspond = "F";
		this.Representation1 = generateRepresentation1();
		this.Representation2 = generateRepresentation2();
	}

	
	public ArrayList<String> generateRepresentation1() {
		ArrayList<String> result = new ArrayList<String>();
		result.add("### ");
		result.add("#   ");
		result.add("##  ");
		result.add("#   ");
		result.add("#   ");
		
		for (String string : result) {
			AleaReplace(string, 1);
		}
		return result;
	}
	
	public ArrayList<String> generateRepresentation2() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(" .----------------. ");
		result.add("| .--------------. |");
		result.add("| |  _________   | |");
		result.add("| | |_   ___  |  | |");
		result.add("| |   | |_  \\_|  | |");
		result.add("| |   |  _|      | |");
		result.add("| |  _| |_       | |");
		result.add("| | |_____|      | |");
		result.add("| |              | |");
		result.add("| '--------------' |");
		result.add(" '----------------' ");
		
		for (String string : result) {
			AleaReplace(string,2);
		}
		return result;
	}


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
}
