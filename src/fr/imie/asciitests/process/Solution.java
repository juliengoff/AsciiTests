package fr.imie.asciitests.process;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
	
	/**
	 * Get array indexes
	 * @param text
	 * @return ArrayList : indexes needed for print message
	 */
	public ArrayList<Integer> getIndexTab(String text){
		ArrayList<Integer> indexTab = new ArrayList<Integer>();
		for(char c : text.toCharArray()) {
			if(c < 'A' || c > 'Z') indexTab.add(26); 
			else {
				for(char letter : alphabet.toCharArray()) {
					if(c == letter) {
						indexTab.add(alphabet.indexOf(letter));
					}
				}
			}
		}
		return indexTab;
	}
	/**
	 * Get final output from parameters
	 * @param int width
	 * @param int height
	 * @param ArrayList ascii : ascii pattern
	 * @param ArrayList indexTab : index of letter pattern
	 * @return String
	 */
	public String getFinalMessage(int width, int height, ArrayList<String> ascii, ArrayList<Integer> indexTab){
		String message = "";
		for(int j = 0; j < height; j++) { 
			for(int k = 0; k < indexTab.size(); k++) { 
				message += ascii.get(j).substring(indexTab.get(k)*width, indexTab.get(k)*width + width);
			}
			message += "\n";
		}
		return message;
	}
	
	/**
	 * Print final output from parameters
	 * @param int width
	 * @param int height
	 * @param ArrayList ascii : ascii pattern
	 * @param ArrayList indexTab : index of letter pattern
	 */
	public void printFinalMessage(int width, int height, ArrayList<String> ascii, ArrayList<Integer> indexTab){
		for(int j = 0; j < height; j++) { 
			for(int k = 0; k < indexTab.size(); k++) { 
				System.out.print(ascii.get(j).substring(indexTab.get(k)*width, indexTab.get(k)*width + width));
			}
			System.out.println("");
		}
	}
	/**
	 * @deprecated Static pattern. Removed for final version
	 * @param number
	 * @return ArrayList indexes
	 */
	public ArrayList<String> getPattern(int number){
		ArrayList<String> asciiPattern = new ArrayList<String>();
		
		switch (number){
			default : case 1 : 
				asciiPattern.add(" #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  ");
				asciiPattern.add("# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #  ");
				asciiPattern.add("### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##  ");
				asciiPattern.add("# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #        ");
				asciiPattern.add("# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ");
				break;
			case 2 :
				asciiPattern.add(" .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .-----------------. .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------. ");
				asciiPattern.add("| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |");
				asciiPattern.add("| |      __      | || |   ______     | || |     ______   | || |  ________    | || |  _________   | || |  _________   | || |    ______    | || |  ____  ____  | || |     _____    | || |     _____    | || |  ___  ____   | || |   _____      | || | ____    ____ | || | ____  _____  | || |     ____     | || |   ______     | || |    ___       | || |  _______     | || |    _______   | || |  _________   | || | _____  _____ | || | ____   ____  | || | _____  _____ | || |  ____  ____  | || |  ____  ____  | || |   ________   | || |    ______    | |");
				asciiPattern.add("| |     /  \\     | || |  |_   _ \\    | || |   .' ___  |  | || | |_   ___ `.  | || | |_   ___  |  | || | |_   ___  |  | || |  .' ___  |   | || | |_   ||   _| | || |    |_   _|   | || |    |_   _|   | || | |_  ||_  _|  | || |  |_   _|     | || ||_   \\  /   _|| || ||_   \\|_   _| | || |   .'    `.   | || |  |_   __ \\   | || |  .'   '.     | || | |_   __ \\    | || |   /  ___  |  | || | |  _   _  |  | || ||_   _||_   _|| || ||_  _| |_  _| | || ||_   _||_   _|| || | |_  _||_  _| | || | |_  _||_  _| | || |  |  __   _|  | || |   / _ __ `.  | |");
				asciiPattern.add("| |    / /\\ \\    | || |    | |_) |   | || |  / .'   \\_|  | || |   | |   `. \\ | || |   | |_  \\_|  | || |   | |_  \\_|  | || | / .'   \\_|   | || |   | |__| |   | || |      | |     | || |      | |     | || |   | |_/ /    | || |    | |       | || |  |   \\/   |  | || |  |   \\ | |   | || |  /  .--.  \\  | || |    | |__) |  | || | /  .-.  \\    | || |   | |__) |   | || |  |  (__ \\_|  | || | |_/ | | \\_|  | || |  | |    | |  | || |  \\ \\   / /   | || |  | | /\\ | |  | || |   \\ \\  / /   | || |   \\ \\  / /   | || |  |_/  / /    | || |  |_/____) |  | |");
				asciiPattern.add("| |   / ____ \\   | || |    |  __'.   | || |  | |         | || |   | |    | | | || |   |  _|  _   | || |   |  _|      | || | | |    ____  | || |   |  __  |   | || |      | |     | || |   _  | |     | || |   |  __'.    | || |    | |   _   | || |  | |\\  /| |  | || |  | |\\ \\| |   | || |  | |    | |  | || |    |  ___/   | || | | |   | |    | || |   |  __ /    | || |   '.___`-.   | || |     | |      | || |  | '    ' |  | || |   \\ \\ / /    | || |  | |/  \\| |  | || |    > `' <    | || |    \\ \\/ /    | || |     .'.' _   | || |    /  ___.'  | |");
				asciiPattern.add("| | _/ /    \\ \\_ | || |   _| |__) |  | || |  \\ `.___.'\\  | || |  _| |___.' / | || |  _| |___/ |  | || |  _| |_       | || | \\ `.___]  _| | || |  _| |  | |_  | || |     _| |_    | || |  | |_' |     | || |  _| |  \\ \\_  | || |   _| |__/ |  | || | _| |_\\/_| |_ | || | _| |_\\   |_  | || |  \\  `--'  /  | || |   _| |_      | || | \\  `-'  \\_   | || |  _| |  \\ \\_  | || |  |`\\____) |  | || |    _| |_     | || |   \\ `--' /   | || |    \\ ' /     | || |  |   /\\   |  | || |  _/ /'`\\ \\_  | || |    _|  |_    | || |   _/ /__/ |  | || |    |_|       | |");
				asciiPattern.add("| ||____|  |____|| || |  |_______/   | || |   `._____.'  | || | |________.'  | || | |_________|  | || | |_____|      | || |  `._____.'   | || | |____||____| | || |    |_____|   | || |  `.___.'     | || | |____||____| | || |  |________|  | || ||_____||_____|| || ||_____|\\____| | || |   `.____.'   | || |  |_____|     | || |  `.___.\\__|  | || | |____| |___| | || |  |_______.'  | || |   |_____|    | || |    `.__.'    | || |     \\_/      | || |  |__/  \\__|  | || | |____||____| | || |   |______|   | || |  |________|  | || |    (_)       | |");
				asciiPattern.add("| |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | || |              | |");
				asciiPattern.add("| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |");
				asciiPattern.add(" '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------' ");
				break;
		}
		return asciiPattern;
	}
	
	/**
	 * Initial solution for codingame
	 */
	public static void solutionCodinGame(){
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
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
	
}
