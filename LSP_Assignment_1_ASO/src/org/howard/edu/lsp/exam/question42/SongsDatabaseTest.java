package org.howard.edu.lsp.exam.question42; //Implementation & Test Code Package

import org.howard.edu.lsp.exam.question42.SongsDatabase;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Class of JUnit test cases to test implementation of the SongsDatabase
 * Class. A HashMap is created below as a SongsDatabase Class object. 
 * @author shaneoliver
 */
class SongsDatabaseTest {
	SongsDatabase songmap = new SongsDatabase();
	
	/**
	 * Main method, prints a title stating the purpose of this class.
	 * @param args, is not used.
	 */
	public static void main(String[] args) {
		System.out.println("JUnit test cases for SongsDatabase Class");
	}
	
	/**
	 * Initializes the HashMap with at least one key, value pair.
	 * @throws Exception, is not used.
	 */
	@BeforeEach
	void setUp() throws Exception { 
		songmap.addSong("Rap", "Gin and Juice");
		
	}

	/**
	 * Prints "Tests Executed Successfully" after each JUnit test class.
	 * @throws Exception, is not used.
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Tests Executed Successfully");
	}
	
	/**
	 * Tests the addSong() method by adding key, value pairs to the HashMap, then
	 * comparing the HashMap to an expected output using the toString() method. 
	 */
	@Test
	@DisplayName("addSong method test cases")
	public void testAddSong() {
		assertEquals(songmap.toString(),"{Rap=[Gin and Juice]}");
		assertNotEquals(songmap.toString(), "{Rap=[Gin and Juice], Rap=[Savage]}");
		songmap.addSong("Jazz", "Always There");
		assertEquals(songmap.toString(), "{Rap=[Gin and Juice], Jazz=[Always There]}");
		assertNotEquals(songmap.toString(), "{Jazz=[Always There]}");
		songmap.addSong("R&B", "U Remind Me");
		assertEquals(songmap.toString(), "{Rap=[Gin and Juice], Jazz=[Always There], R&B=[U Remind Me]}");
		assertNotEquals(songmap.toString(), "{}");
	}
	
	/**
	 * Tests the GetSongs() method by fetching the value for a given key, and
	 * comparing the value to an expected output using the toString() method.
	 */
	@Test 
	@DisplayName("getSongs method test cases")
	public void testGetSongs() {
		assertEquals(songmap.getSongs("Rap").toString(), "[Gin and Juice]");
		assertNotEquals(songmap.getSongs("Rap"), "[Always There]");
		songmap.addSong("Jazz", "Always There");
		assertEquals(songmap.getSongs("Jazz").toString(), "[Always There]");
		assertNotEquals(songmap.getSongs("Jazz").toString(), "[Always there]");
		songmap.addSong("R&B", "U Remind Me");
		assertEquals(songmap.getSongs("R&B").toString(), "[U Remind Me]");
		assertNotEquals(songmap.getSongs("R&B").toString(), "[]");
	}
	
	/**
	 * Tests the getGenreOfSong() method by fetching the key for a given value, 
	 * then comparing the key to an expected output using the toString() method.
	 */
	@Test
	@DisplayName("getGenreOfSong method test cases")
	public void testGetGenreOfSong() {
		assertNotEquals(songmap.getGenreOfSong("[Gin and Juice]"), "Rap");
		assertNotEquals(songmap.getGenreOfSong("[Gin and Juice]"), "null");
		songmap.addSong("Jazz", "Always There");
		assertNotEquals(songmap.getGenreOfSong("[Always There]"), "Jazz");
		assertNotEquals(songmap.getGenreOfSong("[Always There]"), "null");
		songmap.addSong("R&B", "U Remind Me");
		assertNotEquals(songmap.getGenreOfSong("[U Remind Me]"), "R&B");
		assertNotEquals(songmap.getGenreOfSong("[U Remind Me]"), "null");
	}
}
