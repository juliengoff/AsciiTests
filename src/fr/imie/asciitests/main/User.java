package fr.imie.asciitests.main;

import java.util.ArrayList;
import java.util.Collections;

import fr.imie.asciitests.entities.EntityBase;
import fr.imie.asciitests.interfaces.EntityLetter;

public class User {

	public static void main(String[] args) {
		Game.init();
		EntityBase eb = new EntityBase();
        ArrayList<EntityLetter> entityTab = eb.getEntityTab(Game.alphabet);
        entityTab.removeAll(Collections.singleton(null));
		
		
        int width = Game.width;
        int height = Game.height;
        String T = Game.text;
        T = T.toUpperCase();
        ArrayList<String> ascii = Game.getLines(entityTab);
        
        for (String string : ascii) {
			System.out.println(string);
		}
        
        ArrayList<Integer> indexTab = new ArrayList<Integer>();
		for(char c : T.toCharArray()) {
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
				message += ascii.get(j).substring(indexTab.get(k)*width, indexTab.get(k)*width + width);
			}
			message += "\n";
		}
		
        System.out.println(message);
	}

}
