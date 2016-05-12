package fr.imie.asciitests.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

		Scanner scan  = new Scanner(System.in);
        String text = scan.nextLine();
        text.toUpperCase();
        
        int width = 4;
		int height = 5;
		
		ArrayList<String> ascii = new ArrayList<String>();
		
		ascii.add(" #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  ");
		ascii.add("# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #  ");
		ascii.add("### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##  ");
		ascii.add("# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #        ");
		ascii.add("# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ");
	}
		
	public static void solutionCodinGame() {
			
		Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();
        in.nextLine();
        String T = in.nextLine();
        for (int i = 0; i < height; i++) {
            String ROW = in.nextLine();
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("answer");
	}
}
