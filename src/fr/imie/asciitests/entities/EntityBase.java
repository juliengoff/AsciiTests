package fr.imie.asciitests.entities;

import java.util.ArrayList;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class EntityBase {
	String correspond;
	Integer L;
	Integer H;
	ArrayList<String> Representation1;
	ArrayList<String> Representation2;
	
	public char getRandomChar(){
		String allChars = "!#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
		char[] charal = allChars.toCharArray();
		return charal[this.randomizer(0, charal.length)];
	}
	
	public  int randomizer(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
	
}
