package fr.imie.asciitests.main;

import java.util.ArrayList;
import java.util.Collections;
import fr.imie.asciitests.entities.EntityBase;
import fr.imie.asciitests.interfaces.EntityLetter;

public class Game {
	
	public static void main(String[] args) {

		int pattern = EntityBase.randomizer(1, 2);
		int width, height;
		ArrayList<String> output = new ArrayList<String>();
		
		if (pattern == 1){
			width = 4;
	        height = 5;
		}else {
			width = 20;
	        height = 11;
		}
		
        
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
        
        EntityBase eb = new EntityBase();
        
        ArrayList<EntityLetter> entityTab = eb.getEntityTab(alphabet);
        entityTab.removeAll(Collections.singleton(null));
        
        System.out.println(height);
        System.out.println(width);
        
        System.out.println("MANHATTAN");
        
        // Column
        for (int i = 0; i < height; i++){
        	output.add("");
        	ArrayList<String> line = new ArrayList<String>();
        	System.gc();
        	if (pattern == 1){ // Concat lines
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
        
        for (String str : output) {
			System.out.println(str);
		}
	}
}