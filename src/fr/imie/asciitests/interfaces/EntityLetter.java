package fr.imie.asciitests.interfaces;

import java.util.ArrayList;
/**
 * Interface to be used by any Entity letter
 * @author Benjamin & Julien
 *
 */
public interface EntityLetter {

	public ArrayList<String> generateRepresentation1();
	public ArrayList<String> generateRepresentation2();
	public String getCorrespond();
}
