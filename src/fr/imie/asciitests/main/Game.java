package fr.imie.asciitests.main;

import java.util.ArrayList;

import fr.imie.asciitests.entities.EntityBase;
import fr.imie.asciitests.interfaces.EntityLetter;

public class Game {
	
	public static void main(String[] args) {
<<<<<<< HEAD
		
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
        	
=======
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
        
        System.out.println(height);
        System.out.println(width);
        
        System.out.println("MANHATTAN");
        
        int state;
        
        for (int i = 0; i < height; i++){
        	output.add("");
        	ArrayList<String> line = new ArrayList<String>();
        	System.gc();
        	if (pattern == 1){
            	state = 0;
            	for (EntityLetter entityLetter : entityTab) {
            		line =  entityLetter.generateRepresentation1();
            		output.set(i, output.get(i) + line.get(i));
        		}
        	}else {
            	state = 0;
            	for (EntityLetter entityLetter : entityTab) {
            		line =  entityLetter.generateRepresentation2();
            		output.set(i, output.get(i) + line.get(i));
        		}
        	}
        }
        
        for (String str : output) {
			System.out.println(str);
		}
        
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
>>>>>>> e39b6e083329fea791f311066b9aa412a9eafea7
		}
	}
}