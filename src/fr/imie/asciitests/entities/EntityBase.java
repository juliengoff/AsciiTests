package fr.imie.asciitests.entities;

import java.util.ArrayList;
import java.util.Collections;

import fr.imie.asciitests.entityfactory.EntityFactory;
import fr.imie.asciitests.interfaces.EntityLetter;


public class EntityBase {

	public String correspond;
	public Integer patternNumber = 1;
	public Integer width;
	public Integer height;
	public ArrayList<String> Representation1;
	public ArrayList<String> Representation2;
	
	/*
	 * Get a random character between all the available ones
	 */
	public char getRandomChar() {
		  String allChars = "!#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^_`abcdefghijklmnopqrstuvwxyz{|}~";
		     char[] charal = allChars.toCharArray();
		     int random = randomizer(0, charal.length - 1);
		  
		  return charal[random];
		 }
	
	/*
	 * Return a random number between start and end numbers
	 */
	public static int randomizer(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
	
	public ArrayList<EntityLetter> getEntityTab (String text){
		ArrayList<EntityLetter> entityTab = new ArrayList<EntityLetter>();
		
		for (char c : text.toCharArray()) {
			entityTab.add((EntityLetter) EntityFactory.getLetter(c));
		}
		entityTab.removeAll(Collections.singleton(null));
		return entityTab;
	}
	
}