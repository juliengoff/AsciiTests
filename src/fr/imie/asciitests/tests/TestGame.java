package fr.imie.asciitests.tests;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

import fr.imie.asciitests.entities.*;
import fr.imie.asciitests.interfaces.EntityLetter;
import fr.imie.asciitests.main.Game;

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

	@Test
	public void testControlFields() {
		boolean espected = false;
		int sampleWidth = 50;
		Assert.assertEquals(Game.controlFields(sampleWidth, Game.height, Game.text), espected);
	}

	@Test
	public void testInit() {
		Assert.assertNotNull(Game.pattern);
		Assert.assertNotNull(Game.alphabet);
		Assert.assertNotNull(Game.width);
		Assert.assertNotNull(Game.height);
	}

	@Test
	public void testSetPattern() {
		Game.setPattern();
		Assert.assertNotNull("Setting pattern", Game.pattern);
		
	}

	@Test
	public void testSetText() {
		Game.setText();
		String espectedText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
		Assert.assertEquals(espectedText, Game.alphabet);
	}

	@Test
	public void testSetDim() {
		Game.setDim();
		Assert.assertNotNull(Game.width);
		Assert.assertNotNull(Game.height);
	}

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

}
