package fr.imie.asciitests.main;

import java.util.ArrayList;
import java.util.Collections;

import fr.imie.asciitests.entities.EntityBase;
import fr.imie.asciitests.interfaces.EntityLetter;

public class Game {
	public static int width, height, pattern;
	public static String text, alphabet;
	
	/**
	 * Entry of the program
	 * @param args
	 */
	public static void main(String[] args) {

		Game.setPattern();
		Game.setDim();
		Game.setText();
		
		ArrayList<String> output = new ArrayList<String>();
        
        EntityBase eb = new EntityBase();
        ArrayList<EntityLetter> entityTab = eb.getEntityTab(alphabet);
        entityTab.removeAll(Collections.singleton(null));
        
        System.out.println(Game.height);
        System.out.println(Game.width);
        
        System.out.println(Game.text);
        
        output = Game.getLines(entityTab);
        
        for (String str : output) {
			System.out.println(str);
		}
	}
	
	/**
	 * Control the entries as the CodinGame WebSite requires
	 * @param width
	 * @param height
	 * @param text
	 * @return
	 */
	public static boolean controlFields(int width, int height, String text){
		boolean result = true;
		if (width < 0 || width > 30){
			System.err.println("Width is too long or too short");
			result = false;
		}
		if (height < 0 || height > 30){
			System.err.println("Height is too long or too short");
			result = false;
		}
		if (text.length() < 0 || text.length() > 200){
			System.err.println("Text is too long or too short");
			result = false;
		}
		return result;
	}
	
	/**
	 * Initialize the entries
	 */
	public static void init(){
		Game.setPattern();
		Game.setDim();
		Game.setText();
	}
	
	/**
	 * Define which pattern to use with a random method
	 */
	public static void setPattern(){
		Game.pattern = EntityBase.randomizer(1, 2);
	}
	
	/**
	 * Set a text to return as ACSII characters
	 */
	public static void setText(){
		Game.text = "MANHATTAN";
		Game.alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
	}
	
	/**
	 * Define entries depending of the selected pattern
	 */
	public static void setDim(){
		if (Game.pattern == 1){
			Game.width = 4;
			Game.height = 5;
		}else {
			Game.width = 20;
			Game.height = 11;
		}
	}
	
	/**
	 * Get the entities to display, line by line
	 * @param entityTab
	 * @return
	 */
	public static ArrayList<String> getLines(ArrayList<EntityLetter> entityTab){
		boolean test = Game.controlFields(Game.width,Game.height,Game.text);
		if (!test){
			System.exit(0);
		}
		ArrayList<String> output = new ArrayList<String>();
		 // Column
        for (int i = 0; i < Game.height; i++){
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