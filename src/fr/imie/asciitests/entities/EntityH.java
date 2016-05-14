package fr.imie.asciitests.entities;

import java.util.ArrayList;

import fr.imie.asciitests.interfaces.EntityLetter;

public class EntityH extends EntityBase implements EntityLetter{

	public EntityH() {
		super();
		this.correspond = "H";
		this.Representation1 = generateRepresentation1();
		this.Representation2 = generateRepresentation2();
	}
	/**
	 * Generate representation for pattern 1
	 * @return ArrayList
	 */
	public ArrayList<String> generateRepresentation1() {
		ArrayList<String> result = new ArrayList<String>();
		result.add("# # ");
		result.add("# # ");
		result.add("### ");
		result.add("# # ");
		result.add("# # ");
		
		for (String string : result) {
			AleaReplace(string);
		}
		return result;
	}
	/**
	 * Random replace of the char
	 * TODO : Add faker to replace char (only for '#' char)
	 * @param string
	 */
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

	/**
	 * Generate representation for pattern 2
	 * @return ArrayList
	 */
	public ArrayList<String> generateRepresentation2() {
		ArrayList<String> result = new ArrayList<String>();
		result.add(" .----------------. ");
		result.add("| .--------------. |");
		result.add("| |  ____  ____  | |");
		result.add("| | |_   ||   _| | |");
		result.add("| |   | |__| |   | |");
		result.add("| |   |  __  |   | |");
		result.add("| |  _| |  | |_  | |");
		result.add("| | |____||____| | |");
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
