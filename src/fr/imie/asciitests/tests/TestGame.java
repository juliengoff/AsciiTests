package fr.imie.asciitests.tests;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.javafaker.Faker;

import org.junit.Assert;
import fr.imie.asciitests.entities.*;
import fr.imie.asciitests.interfaces.EntityLetter;
import fr.imie.asciitests.main.Game;
import fr.imie.asciitests.main.User;

/**
 * Junit tests for Game class
 * @author Benjamin & Julien
 *
 */
public class TestGame {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Game.init();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Control the values of the entry Text
	 */
	@Test
	public void testControlFields() {
		boolean expected = false;
		int sampleWidth = 50;
		Assert.assertEquals(Game.controlFields(sampleWidth, Game.height, Game.text), expected);
	}
	
	/**
	 * Test the initialization of the Game.java variables
	 */
	@Test
	public void testInit() {
		Assert.assertNotNull(Game.pattern);
		Assert.assertNotNull(Game.alphabet);
		Assert.assertNotNull(Game.width);
		Assert.assertNotNull(Game.height);
	}
	
	/**
	 * Test if the selected pattern correspond to the desired pattern
	 */
	@Test
	public void testSetPattern() {
		Game.setPattern();
		Assert.assertNotNull("Setting pattern", Game.pattern);
		
	}
	
	/**
	 * Test if the text displayed correspond to the expected text
	 */
	@Test
	public void testSetText() {
		Game.setText();
		String espectedText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
		Assert.assertEquals(espectedText, Game.alphabet);
	}
	
	/**
	 * Test if the height and with correspond to the expected values
	 */
	@Test
	public void testSetDim() {
		Game.setDim();
		Assert.assertNotNull(Game.width);
		Assert.assertNotNull(Game.height);
	}
	
	/**
	 * Test if the program recovers the entity line by line
	 */
	@Test
	public void testGetLines() {
		String sample = "T";
		
		ArrayList<EntityLetter> sampleTab = new ArrayList<EntityLetter>();
		sampleTab.add(new EntityT());
		
		ArrayList<String> espectedTab = Game.getLines(sampleTab);
		
		
		EntityBase eb = new EntityBase();
        ArrayList<EntityLetter> entityTab = eb.getEntityTab(sample);
        
        ArrayList<String> response = Game.getLines(entityTab);
		
		for (int i = 0; i < response.size(); i++){
			Assert.assertEquals(espectedTab.get(i), response.get(i));
		}
	}
	
	/**
	 * Verify if the EntityTab generation is working
	 */
	@Test
	public void testEntityTab(){
		String sample = "T";
		EntityBase eb = new EntityBase();
        ArrayList<EntityLetter> entityTab = eb.getEntityTab(sample);
        
        ArrayList<EntityLetter> sampleTab = new ArrayList<EntityLetter>();
		sampleTab.add(new EntityT());
		
		for (int i = 0; i < entityTab.size(); i++) {
			Assert.assertEquals(sampleTab.get(i).getCorrespond(), entityTab.get(i).getCorrespond());
		}
	}
	

	/**
	 * Verify if all the entities get the Ascii representation1 working
	 */
	@Test
    public void testAllEntityPattern1(){
        Game.pattern = 1;
        Game.setDim();
       
        ArrayList<EntityLetter> expectedTab = new ArrayList<EntityLetter>();
        expectedTab.add(new EntityA());
        expectedTab.add(new EntityB());
        expectedTab.add(new EntityC());
        expectedTab.add(new EntityD());
        expectedTab.add(new EntityE());
        expectedTab.add(new EntityF());
        expectedTab.add(new EntityG());
        expectedTab.add(new EntityH());
        expectedTab.add(new EntityI());
        expectedTab.add(new EntityJ());
        expectedTab.add(new EntityK());
        expectedTab.add(new EntityL());
        expectedTab.add(new EntityM());
        expectedTab.add(new EntityN());
        expectedTab.add(new EntityO());
        expectedTab.add(new EntityP());
        expectedTab.add(new EntityQ());
        expectedTab.add(new EntityR());
        expectedTab.add(new EntityS());
        expectedTab.add(new EntityT());
        expectedTab.add(new EntityU());
        expectedTab.add(new EntityV());
        expectedTab.add(new EntityW());
        expectedTab.add(new EntityX());
        expectedTab.add(new EntityY());
        expectedTab.add(new EntityZ());
        expectedTab.add(new EntityQuestion());
       
       
        EntityBase eb = new EntityBase();
        ArrayList<EntityLetter> entityTab = eb.getEntityTab(Game.alphabet);
       
        ArrayList<String> response = Game.getLines(entityTab);
        ArrayList<String> expectedOut = Game.getLines(expectedTab);
       
        for (int i = 0; i < response.size(); i++) {
            Assert.assertEquals(expectedOut.get(i), response.get(i));
        } 
    }
   
	/**
	 * Verify if all the entities get the Ascii representation2 working
	 */
    @Test
    public void testAllEntityPattern2(){
        Game.pattern = 2;
        Game.setDim();
       
        ArrayList<EntityLetter> expectedTab = new ArrayList<EntityLetter>();
        expectedTab.add(new EntityA());
        expectedTab.add(new EntityB());
        expectedTab.add(new EntityC());
        expectedTab.add(new EntityD());
        expectedTab.add(new EntityE());
        expectedTab.add(new EntityF());
        expectedTab.add(new EntityG());
        expectedTab.add(new EntityH());
        expectedTab.add(new EntityI());
        expectedTab.add(new EntityJ());
        expectedTab.add(new EntityK());
        expectedTab.add(new EntityL());
        expectedTab.add(new EntityM());
        expectedTab.add(new EntityN());
        expectedTab.add(new EntityO());
        expectedTab.add(new EntityP());
        expectedTab.add(new EntityQ());
        expectedTab.add(new EntityR());
        expectedTab.add(new EntityS());
        expectedTab.add(new EntityT());
        expectedTab.add(new EntityU());
        expectedTab.add(new EntityV());
        expectedTab.add(new EntityW());
        expectedTab.add(new EntityX());
        expectedTab.add(new EntityY());
        expectedTab.add(new EntityZ());
        expectedTab.add(new EntityQuestion());
       
       
        EntityBase eb = new EntityBase();
        ArrayList<EntityLetter> entityTab = eb.getEntityTab(Game.alphabet);
       
        ArrayList<String> response = Game.getLines(entityTab);
        ArrayList<String> expectedOut = Game.getLines(expectedTab);
       
        for (int i = 0; i < response.size(); i++) {
            Assert.assertEquals(expectedOut.get(i), response.get(i));
        }
    }
}
