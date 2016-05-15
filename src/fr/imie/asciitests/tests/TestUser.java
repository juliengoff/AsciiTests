package fr.imie.asciitests.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.imie.asciitests.entities.*;
import fr.imie.asciitests.interfaces.EntityLetter;
import fr.imie.asciitests.main.Game;
import fr.imie.asciitests.main.User;

public class TestUser {
	
	/*
	 * First test from codinggame.com
	 * Display letter e as ASCII representation 1
	 */
	@Test
	public void testLetterE() throws Exception {
		Game.pattern = 1;
		Game.text = "e";
		Game.setDim();
		ArrayList<String> expected = new EntityE().Representation1;
		ArrayList<String> response = User.getFormattedText();
		  
		for (int i = 0; i < response.size(); i++) {
		   Assert.assertEquals(expected.get(i), response.get(i));
		}
	}
	
	/*
	 * Second test from codinggame.com
	 * Display the word MANHATTAN as ASCII representation 1
	 */
	@Test
	public void testLetterManhattan1() {
	    Game.pattern = 1;
	    Game.text = "MANHATTAN";
	    Game.setDim();
	    ArrayList<EntityLetter> expectedTab = new ArrayList<EntityLetter>();
	    expectedTab.add(new EntityM());
	    expectedTab.add(new EntityA());
	    expectedTab.add(new EntityN());
	    expectedTab.add(new EntityH());
	    expectedTab.add(new EntityA());
	    expectedTab.add(new EntityT());
	    expectedTab.add(new EntityT());
	    expectedTab.add(new EntityA());
	    expectedTab.add(new EntityN());
	  
	    EntityBase eb = new EntityBase();
	    ArrayList<EntityLetter> entityTab = eb.getEntityTab(Game.text);
	   
	    ArrayList<String> response = Game.getLines(entityTab);
	    ArrayList<String> expectedOut = Game.getLines(expectedTab);
	  
	    //System.out.println(response);
	    //System.out.println(expectedOut);
	    
	    for (int i = 0; i < response.size(); i++) {
	    	Assert.assertEquals(expectedOut.get(i), response.get(i));
	    }
	}
	
	@Test
	 public void testLetterManhattan2(){
	  Game.pattern = 1;
	  Game.text = "ManhAtTan";
	  Game.setDim();
	  ArrayList<EntityLetter> expectedTab = new ArrayList<EntityLetter>();
	  expectedTab.add(new EntityM());
	  expectedTab.add(new EntityA());
	  expectedTab.add(new EntityN());
	  expectedTab.add(new EntityH());
	  expectedTab.add(new EntityA());
	  expectedTab.add(new EntityT());
	  expectedTab.add(new EntityT());
	  expectedTab.add(new EntityA());
	  expectedTab.add(new EntityN());
	  
	  EntityBase eb = new EntityBase();
	  ArrayList<EntityLetter> entityTab = eb.getEntityTab(Game.text);
	  
	  ArrayList<String> response = User.getLines(entityTab);
	  ArrayList<String> expectedOut = Game.getLines(expectedTab);
	  
	  for (int i = 0; i < response.size(); i++) {
	   Assert.assertEquals(expectedOut.get(i), response.get(i));
	  }
	  
	 }
	 
	 @Test
	 public void testLetterManhattan3(){
	  Game.pattern = 1;
	  Game.text = "M@NH@TT@N";
	  Game.setDim();
	  ArrayList<EntityLetter> expectedTab = new ArrayList<EntityLetter>();
	  expectedTab.add(new EntityM());
	  expectedTab.add(new EntityQuestion());
	  expectedTab.add(new EntityN());
	  expectedTab.add(new EntityH());
	  expectedTab.add(new EntityQuestion());
	  expectedTab.add(new EntityT());
	  expectedTab.add(new EntityT());
	  expectedTab.add(new EntityQuestion());
	  expectedTab.add(new EntityN());
	  
	  EntityBase eb = new EntityBase();
	  ArrayList<EntityLetter> entityTab = eb.getEntityTab(Game.text);
	  
	  ArrayList<String> response = User.getLines(entityTab);
	  ArrayList<String> expectedOut = Game.getLines(expectedTab);
	  
	  for (int i = 0; i < response.size(); i++) {
	   Assert.assertEquals(expectedOut.get(i), response.get(i));
	  }
	  
	 }
	 
	 @Test
	 public void testLetterManhattan4(){
	  Game.pattern = 2;
	  Game.text = "MANHATTAN";
	  Game.setDim();
	  ArrayList<EntityLetter> expectedTab = new ArrayList<EntityLetter>();
	  expectedTab.add(new EntityM());
	  expectedTab.add(new EntityA());
	  expectedTab.add(new EntityN());
	  expectedTab.add(new EntityH());
	  expectedTab.add(new EntityA());
	  expectedTab.add(new EntityT());
	  expectedTab.add(new EntityT());
	  expectedTab.add(new EntityA());
	  expectedTab.add(new EntityN());
	  
	  EntityBase eb = new EntityBase();
	  ArrayList<EntityLetter> entityTab = eb.getEntityTab(Game.text);
	  
	  ArrayList<String> response = User.getLines(entityTab);
	  ArrayList<String> expectedOut = Game.getLines(expectedTab);
	  
	  for (int i = 0; i < response.size(); i++) {
	   Assert.assertEquals(expectedOut.get(i), response.get(i));
	  }
	  
	 }

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
	public void testMain() {
		fail("Not yet implemented");
	}

}
