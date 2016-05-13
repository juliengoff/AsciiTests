package fr.imie.asciitests.main;

import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.Line;

import fr.imie.asciitests.entities.EntityBase;
import fr.imie.asciitests.interfaces.EntityLetter;
import fr.imie.asciitests.process.Solution;

public class Game {
	
	public static void main(String[] args) {
		
		int pattern = EntityBase.randomizer(1, 2);
        int width = 4;
        int height = 5;
        int state;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
        ArrayList<String> output = new ArrayList<String>();
        
        if (pattern == 1) {
			width = 4;
			height = 5;
		} else {
			width = 20;
			height = 11;
		}
        
        System.out.println(4);
        System.out.println(5);
        System.out.println("MANHATTAN");
        
        EntityBase eb = new EntityBase();
        ArrayList<EntityLetter> entityTab = eb.getEntityTab(alphabet);
        
        for (int i = 0; i < height; i++) {
			output.add("");
			ArrayList<String> Line = new ArrayList<String>();

        	if (pattern ==1) {
        		state = 0;
        		for (EntityLetter entityLetter : entityTab){
            		Line = entityLetter.generateRepresentation1();
            		output.set(i, output.get(i) + Line.get(i));
            	}	
			} else {
				state = 0;
				for (EntityLetter entityLetter : entityTab){
            		Line = entityLetter.generateRepresentation2();
            		output.set(i, output.get(i) + Line.get(i));
            	}
			}
        	
		}
	}
}