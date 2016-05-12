package fr.imie.asciitests.process;

import java.util.ArrayList;

public class Solution {
	
	
	public ArrayList<Integer> getIndexTab(String alphabet, String text){
		ArrayList<Integer> indexTab = new ArrayList<Integer>();
		for(char c : text.toCharArray()) {
			if(c < 'A' || c > 'Z') indexTab.add(26); // Si la lettre n'est pas entre A et Z, on remplace par "?"
			else { // Sinon on récupère l'index du charactère dans un tableau
				for(char letter : alphabet.toCharArray()) {
					if(c == letter) {
						indexTab.add(alphabet.indexOf(letter));
					}
				}
			}
		}
		return indexTab;
	}
	
	public String getFinalMessage(int width, int height, ArrayList<String> ascii, ArrayList<Integer> indexTab){
		String message = "";
		for(int j = 0; j < height; j++) { // Colonnes
			for(int k = 0; k < indexTab.size(); k++) { // Lignes
				// On récupère le caractère à l'index * longueur pour obtenir le début + la longueur pour la fin du caractère en cours
				message += ascii.get(j).substring(indexTab.get(k)*width, indexTab.get(k)*width + width);
			}
			message += "\n";
		}
		return message;
	}
	
}
