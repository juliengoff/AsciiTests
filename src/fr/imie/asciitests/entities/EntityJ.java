package fr.imie.asciitests.entities;

import java.util.ArrayList;

import fr.imie.asciitests.interfaces.EntityLetter;

public class EntityJ extends EntityBase implements EntityLetter{

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
		return result;
	}

	private void AleaReplace(String string) {
		if (this.patternNumber == 1){
			string.replace('#', super.getRandomChar());
		}else {
			string.replace('/', super.getRandomChar());
			string.replace('_', super.getRandomChar());
			string.replace('\\', super.getRandomChar());
			string.replace('|', super.getRandomChar());
		}
		
	}
	
	public ArrayList<String> generateRepresentation2() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(" .----------------. ");
		result.add("| .--------------. |");
		result.add("| |     _____    | |");
		result.add("| |    |_   _|   | |");
		result.add("| |      | |     | |");
		result.add("| |   _  | |     | |");
		result.add("| |  | |_' |     | |");
		result.add("| |  `.___.'     | |");
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
