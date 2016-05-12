package fr.imie.asciitests.process;

import java.util.ArrayList;

public class Solution {
	
	
	public ArrayList<Integer> getIndexTab(String alphabet, String text){
		ArrayList<Integer> indexTab = new ArrayList<Integer>();
		for(char c : text.toCharArray()) {
			if(c < 'A' || c > 'Z') indexTab.add(26); // Si la lettre n'est pas entre A et Z, on remplace par "?"
			else { // Sinon on r�cup�re l'index du charact�re dans un tableau
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
				// On r�cup�re le caract�re � l'index * longueur pour obtenir le d�but + la longueur pour la fin du caract�re en cours
				message += ascii.get(j).substring(indexTab.get(k)*width, indexTab.get(k)*width + width);
			}
			message += "\n";
		}
		return message;
	}
	
}
