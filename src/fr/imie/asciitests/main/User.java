package fr.imie.asciitests.main;

import java.util.ArrayList;
import java.util.Collections;

import fr.imie.asciitests.entities.EntityBase;
import fr.imie.asciitests.interfaces.EntityLetter;

/**
 * User entry point of the program
 * Use Game class to generate requested text
 * @author Benjamin & Julien
 *
 */
public class User {
	
	public static int width, height;
	public static String text;
	
	/**
	 * Entry point of the user class
	 * @param args
	 */
	public static void main(String[] args) {
		Game.init();
		EntityBase eb = new EntityBase();
        ArrayList<EntityLetter> entityTab = eb.getEntityTab(Game.alphabet);
        entityTab.removeAll(Collections.singleton(null));
		
		
        User.width = Game.width;
        User.height = Game.height;
        User.text = Game.text;
        
        ArrayList<String> ascii = Game.getLines(entityTab);
        
        
        ArrayList<Integer> indexTab = new ArrayList<Integer>();
		for(char c : User.text.toCharArray()) {
			if(c < 'A' || c > 'Z') indexTab.add(26); 
			else { 
				for(char letter : Game.alphabet.toCharArray()) {
					if(c == letter) {
						indexTab.add(Game.alphabet.indexOf(letter));
					}
				}
			}
		}
        
		String message = "";
		for(int j = 0; j < height; j++) { // Column
			for(int k = 0; k < indexTab.size(); k++) { // Lines
				message += ascii.get(j).substring(indexTab.get(k)*User.width, indexTab.get(k)*User.width + User.width);
			}
			message += "\n";
		}
		
       System.out.println(message);
	}
	
	/**
	 * Get main result by arrayList
	 * @return ArrayList<String>
	 */
	public static ArrayList<String> getFormattedText(){
		EntityBase eb = new EntityBase();
        ArrayList<EntityLetter> entityTab = eb.getEntityTab(Game.alphabet);
        entityTab.removeAll(Collections.singleton(null));
		
        User.width = Game.width;
        User.height = Game.height;
        User.text = Game.text;
        
        ArrayList<String> ascii = User.getLines(entityTab);
        
        ArrayList<Integer> indexTab = new ArrayList<Integer>();
        
		for(char c : User.text.toCharArray()) {
			if(c < 'A' || c > 'Z') indexTab.add(26); 
			else { 
				for(char letter : Game.alphabet.toCharArray()) {
					if(c == letter) {
						indexTab.add(Game.alphabet.indexOf(letter));
					}
				}
			}
		}
        
		ArrayList<String> output = new ArrayList<String>();
		for(int j = 0; j < height; j++) { // Column
			for(int k = 0; k < indexTab.size(); k++) { // Lines
				output.add(ascii.get(j).substring(indexTab.get(k) * User.width, indexTab.get(k) * User.width + User.width));
			}
		}
		
		return output;
	}
	
	/**
	 * Get the entities to display, line by line
	 * @param entityTab
	 * @return
	 */
	public static ArrayList<String> getLines(ArrayList<EntityLetter> entityTab){
		User.text = Game.text.toUpperCase();
		boolean test = Game.controlFields(User.width,User.height,User.text);
		if (!test){
			System.exit(0);
		}
		ArrayList<String> output = new ArrayList<String>();
		 // Column
        for (int i = 0; i < height; i++){
        	output.add("");
        	ArrayList<String> line = new ArrayList<String>();
        	System.gc();
        	if (Game.pattern == 1){ // Concat lines
            	for (EntityLetter entityLetter : entityTab) {
            		line =  entityLetter.generateRepresentation1();
            		try {
            			output.set(i, output.get(i) + line.get(i));
            		}catch (Exception e){
            			
            		}
        		}
        	}else { // Concat lines
            	for (EntityLetter entityLetter : entityTab) {
            		line =  entityLetter.generateRepresentation2();
            		try {
            			output.set(i, output.get(i) + line.get(i));
            		}catch (Exception e){
            			
            		}
        		}
        	}
        }
        return output;
	}
	
}


