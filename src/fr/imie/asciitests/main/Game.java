package fr.imie.asciitests.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine();
        T = T.toUpperCase();
        ArrayList<String> ascii = new ArrayList<String>();
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            ascii.add(ROW);
        }
	}
}