package fr.imie.asciitests.process;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
	
    ArrayList<String> ascii = new ArrayList<String>();
    for (int i = 0; i < H; i++) {
        String ROW = in.nextLine();
        ascii.add(ROW);
    }
    
    ArrayList<Integer> indexTab = new ArrayList<Integer>();
	for(char c : T.toCharArray()) {
		if(c < 'A' || c > 'Z') indexTab.add(26); 
		else { 
			for(char letter : alphabet.toCharArray()) {
				if(c == letter) {
					indexTab.add(alphabet.indexOf(letter));
				}
			}
		}
	}
    
	String message = "";
	for(int j = 0; j < H; j++) { // Colonnes
		for(int k = 0; k < indexTab.size(); k++) { // Lignes
			message += ascii.get(j).substring(indexTab.get(k)*L, indexTab.get(k)*L + L);
		}
		message += "\n";
	}
	
	// Write an action using System.out.println()
    // To debug: System.err.println("Debug messages...");
    System.out.println(message);

}
