package fr.imie.asciitests.main;

import java.util.ArrayList;
import java.util.Scanner;

import fr.imie.asciitests.process.Solution;

public class Game {
	
	public static void main(String[] args) {
		Solution soluce = new Solution();
		
        int L = 4;
        int H = 5;
        String T = "G";
        
        ArrayList<String> ascii = soluce.getPattern(1);
        ArrayList<Integer> indexTab = soluce.getIndexTab(T);
        System.out.println(soluce.getFinalMessage(L, H, ascii, indexTab));
		
	}
	
	

}
