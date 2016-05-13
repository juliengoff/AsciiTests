package fr.imie.asciitests.entities;

import java.util.ArrayList;

import fr.imie.asciitests.interfaces.EntityLetter;

public class EntityG extends EntityBase implements EntityLetter{
	
	public EntityG() {
		super();
		this.correspond = "G";
		this.Representation1 = generateRepresentation1();
		this.Representation2 = generateRepresentation2();
	}

	
	public ArrayList<String> generateRepresentation1() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(" ## ");
		result.add("#   ");
		result.add("# # ");
		result.add("# # ");
		result.add(" ## ");
		
		for (String string : result) {
			AleaReplace(string, 1);
		}
		return result;
	}
	
	public ArrayList<String> generateRepresentation2() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(" .----------------. ");
		result.add("| .--------------. |");
		result.add("| |    ______    | |");
		result.add("| |  .' ___  |   | |");
		result.add("| | / .'   \\_|   | |");
		result.add("| | | |    ____  | |");
		result.add("| | \\ `.___]  _| | |");
		result.add("| |  `._____.'   | |");
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
