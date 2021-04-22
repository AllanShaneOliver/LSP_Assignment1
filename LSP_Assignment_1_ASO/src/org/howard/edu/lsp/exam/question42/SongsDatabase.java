package org.howard.edu.lsp.exam.question42; //Implementation & Test Code Package

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Collections;

/**
 * Implementation class, tested by a JUnit test file. Uses a HashMap,
 * so any object of the class SongsDatabase will be a HashMap.
 * @author shaneoliver
 */
public class SongsDatabase {
	
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
	
	/**
	 * Adds a song title to the SongsDatabase HashMap.
	 * @param genre is a String representing the key.
	 * @param songTitle is a Set of Strings representing 
	 * the values associated with a given key (genre). 
	 */
	public void addSong(String genre, String songTitle) {
		Set<String> songs = new HashSet<String>();
		songs.add(songTitle);
		map.put(genre, songs);
	}
	
	/**		    
	 * Returns a Set of Strings when given a key representing the Genre.
	 * @param genre is a String, which represents the key.  
	 * @return Set of Strings, representing the values associated with a key.
	 */
	public Set<String> getSongs(String genre) {
		return map.get(genre);
	}
	
	/**
	 * Returns a String when given a value of String Set songTitle. 
	 * @param songTitle, which is a Set of Strings representing the value.
	 * @return a String, which represents the key associated with a value.
	 */
	public String getGenreOfSong(String songTitle) {
		String returnstr = null;
		for (Map.Entry entrymap: map.entrySet()) {
			if(songTitle.equals(entrymap.getValue())) {
				returnstr = entrymap.getKey().toString();
				return returnstr;
			}
		}
		return null;
	}
	
	/**
	 * Converts the HashMap to a String. Used
	 * for JUnit testing assertEquals statements.
	 */
	public String toString() {
		return(map.toString());
	}
}
