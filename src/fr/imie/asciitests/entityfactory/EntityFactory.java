package fr.imie.asciitests.entityfactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import fr.imie.asciitests.entities.*;

public class EntityFactory {
	/**
	 * Get entity of letter
	 * @param char letter
	 * @return letter Entity
	 */
	public  Object getLetter(char c){
		
		switch (c){
			case 'A' :
				return new EntityA();
				
			case 'B' :
				return new EntityB();
				
			case 'C' :
				return new EntityC();
				
			case 'D' :
				return new EntityD();
				
			case 'E' :
				return new EntityE();
				
			case 'F' :
				return new EntityF();
				
			case 'G' :
				return new EntityG();
				
			case 'H' :
				return new EntityH();
				
			case 'I' :
				return new EntityI();
				
			case 'J' :
				return new EntityJ();
				
			case 'K' :
				return new EntityK();
				
			case 'L' :
				return new EntityL();
				
			case 'M' :
				return new EntityM();
				
			case 'N' :
				return new EntityN();
				
			case 'O' :
				return new EntityO();
				
			case 'P' :
				return new EntityP();
				
			case 'Q' :
				return new EntityQ();
				
			case 'R' :
				return new EntityR();
				
			case 'S' :
				return new EntityS();
				
			case 'T' :
				return new EntityT();
				
			case 'U' :
				return new EntityU();
				
			case 'V' :
				return new EntityV();
				
			case 'W' :
				return new EntityW();
				
			case 'X' :
				return new EntityX();
				
			case 'Y' :
				return new EntityY();
				
			case 'Z' :
				return new EntityZ();
				
			default :
				return new EntityQuestion();
		}
		
	}
}