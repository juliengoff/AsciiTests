package fr.imie.asciitests.entities;

import java.util.ArrayList;

public class EntityA extends EntityBase {

	public EntityA() {
		super();
		this.correspond = "A";
		this.Representation1 = generateRepresentation1();
		this.Representation2 = generateRepresentation2();
	}

	
	public ArrayList<String> generateRepresentation1() {
		super.L = 4;
		super.H = 5;
		
		ArrayList<String> result = new ArrayList<String>();
		result.add(" #  ");
		result.add("# # ");
		result.add("### ");
		result.add("# # ");
		result.add("# # ");
		
		for (String string : result) {
			AleaReplace(string, 1);
		}
		return result;
	}
	
	private ArrayList<String> generateRepresentation2() {
		super.L = 20;
		super.H = 11;
				
		ArrayList<String> result = new ArrayList<String>();
		result.add(" .----------------. ");
		result.add("| .--------------. |");
		result.add("| |      __      | |");
		result.add("| |     /  \\     | |");
		result.add("| |    / /\\ \\    | |");
		result.add("| |   / ____ \\   | |");
		result.add("| | _/ /    \\ \\_ | |");
		result.add("| ||____|  |____|| |");
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
