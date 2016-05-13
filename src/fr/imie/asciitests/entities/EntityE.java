package fr.imie.asciitests.entities;

import java.util.ArrayList;

import fr.imie.asciitests.interfaces.EntityLetter;

public class EntityE extends EntityBase implements EntityLetter{
	
	public EntityE() {
		super();
		this.correspond = "E";
		this.Representation1 = generateRepresentation1();
		this.Representation2 = generateRepresentation2();
	}

	
	public ArrayList<String> generateRepresentation1() {
		super.L = 4;
		super.H = 5;
		ArrayList<String> result = new ArrayList<String>();
		result.add("### ");
		result.add("#   ");
		result.add("##  ");
		result.add("#   ");
		result.add("### ");
		
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
		result.add("| |   |  _|  _   | |");
		result.add("| |  _| |___/ |  | |");
		result.add("| | |_________|  | |");
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


	@Override
	public String getCorrespond() {
		// TODO Auto-generated method stub
		return null;
	}
}
