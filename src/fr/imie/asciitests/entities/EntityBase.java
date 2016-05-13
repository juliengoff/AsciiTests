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
	
	public char getRandomChar(){
		//String allChars = "!#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
		//char[] charal = allChars.toCharArray();
		return '#';
	}
	

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