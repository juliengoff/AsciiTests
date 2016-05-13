package fr.imie.asciitests.main;

import java.util.ArrayList;
import java.util.Scanner;

import fr.imie.asciitests.entities.EntityBase;
import fr.imie.asciitests.entityfactory.EntityFactory;
import fr.imie.asciitests.interfaces.EntityLetter;
import fr.imie.asciitests.process.Solution;

public class Game {
	
	public static void main(String[] args) {
		Solution soluce = new Solution();
		
        int L = 4;
        int H = 5;
        int pattern = 2;
        String T = "AA";
        
        EntityBase eb = new EntityBase();
        
        ArrayList<EntityLetter> entityTab = eb.getEntityTab(T);
        for (EntityLetter entityLetter : entityTab) {
        	String t = entityLetter.getCorrespond();
        	System.out.print(t);
		}
        
//        for (char c : T.toCharArray()) {
//        	getOutput((EntityLetter) ef.getLetter(c), pattern);
//		}
//        System.gc();
		
	}
	
	public static void getOutput(EntityLetter letter, int pattern){
		ArrayList<String> letterArray;
		if (pattern == 1){
			letterArray = letter.generateRepresentation1();
		}
		else{
			letterArray = letter.generateRepresentation2();
		}
			
		for (String string : letterArray) {
			System.out.println(string);
		}
	}
}
