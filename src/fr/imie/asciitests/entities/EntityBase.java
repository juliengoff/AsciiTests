package fr.imie.asciitests.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

import com.github.javafaker.Faker;

import fr.imie.asciitests.entityfactory.EntityFactory;
import fr.imie.asciitests.interfaces.EntityLetter;

/**
 * Provides methods to work with Letters entities
 * @author Benjamin & Julien
 */
public class EntityBase {

	public String correspond;
	public Integer patternNumber = 1;
	public Integer width;
	public Integer height;
	public ArrayList<String> Representation1;
	public ArrayList<String> Representation2;
	
	/**
	 * Get a random ascii char
	 * @return char
	 */
	public char getRandomChar(){
		String allChars = "!#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^_`abcdefghijklmnopqrstuvwxyz{|}~";
	    char[] charal = allChars.toCharArray();
	    int random = randomizer(0, charal.length - 1);
		//return charal[random];
	    return '#';
	}
	
	
	/**
	 * Return a random number between start and end numbers
	 */
	public static int randomizer(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
	
	/**
	 * Get entity letter array of the requested text
	 * @param text
	 * @return ArrayList<EntityLetter>
	 */
	public ArrayList<EntityLetter> getEntityTab (String text){
		ArrayList<EntityLetter> entityTab = new ArrayList<EntityLetter>();
		
		for (char c : text.toCharArray()) {
			entityTab.add((EntityLetter) EntityFactory.getLetter(c));
		}
		entityTab.removeAll(Collections.singleton(null));
		return entityTab;
	}
	
}