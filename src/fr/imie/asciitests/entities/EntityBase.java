package fr.imie.asciitests.entities;

import java.util.ArrayList;


public class EntityBase {
	public String correspond;
	public Integer L;
	public Integer H;
	public ArrayList<String> Representation1;
	public ArrayList<String> Representation2;
	
	public char getRandomChar(){
		String allChars = "!#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
		char[] charal = allChars.toCharArray();
		return charal[this.randomizer(0, charal.length)];
	}
	
	public  int randomizer(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
	
}
