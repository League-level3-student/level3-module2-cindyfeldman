package _02_More_Algorithms;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
public class _01_SearchingAndSortingAlgorithms {

	/**
	 * Create the methods in the Algorithm class so that it will make the following tests pass. When you get a green bar, uncomment the next test until you have
	 * solved them all. Expand your vocabulary while you're at it.
	 **/

	/* 1. Create a method that will find and return the first index of a broken egg */
	int findBrokenEgg(List<String> eggs) {
	
	for (int i = 0; i < eggs.size(); i++) {
		if(eggs.get(i).equals("cracked")) {
			return i;
		}
		
	}
	return -1;
	}
	@Test
	public void testSearch() {
		List<String> eggs = Arrays.asList(new String[] { "whole", "whole", "whole", "whole", "cracked", "whole", "whole", "whole",
				"cracked", "whole", "whole", "whole" });
		assertEquals(4, findBrokenEgg(eggs));
	}

	//2. Count how many oysters contain pearls. 
	int countPearls(List<Boolean> oysters) {
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)==true) {
				return i;
			}
		}
		return -1;
	}
	@Test
	public void testSearchAndAccumulate() throws Exception {
		List<Boolean> oysters = Arrays.asList(new Boolean[] { false, false, true, false, false, false, false, false, false, false, false,
				false, false, false, false, false, false, false, false, false, false, false, false, true });
		assertEquals(2, countPearls(oysters));
	}

	
	/* 3. Create a method that will return the height of the tallest person. */
	double findTallest(List<Double> peeps) {
		for (int i = 0; i < peeps.size(); i++) {
		if(peeps.get(i).doubleValue()>peeps.get(i+1)) {
					return peeps.get(i);
		}}
		return -1;
	}
	@Test
	public void testFindMaxiumum() throws Exception {
		List<Double> peeps = Arrays.asList(new Double[] { 5.7, 6.2, 3.4, 6.2, 5.0, 5.5, 4.7, 6.2, 3.4, 4.2, 5.0, 4.5, 5.1, 6.2 });
		assertEquals(6.2, findTallest(peeps), 0.0);
	}

// 4. Create a method that will find the longest word. */
	String findLongestWord(List<String> words) {
		String largest = "";
		for (int i = 0; i < words.size(); i++) {
	if(words.get(i).length()>largest.length()) {
		largest = words.get(i);
		
	}
		}
		return largest;
	}
	@Test
	public void testFindMaxiumumString() throws Exception {
		List<String> words = Arrays.asList(new String[] { "accoutrements", "acumen", "anomalistic", "auspicious", "bellwether",
				"callipygian", "circumlocution", "concupiscent", "conviviality", "coruscant", "cuddlesome", "cupidity", "cynosure",
				"ebullient", "equanimity", "excogitate", "gasconading", "idiosyncratic", "luminescent", "magnanimous", "nidificate",
				"osculator", "parsimonious", "penultimate", "perfidiousness", "perspicacious", "proficuous", "remunerative", "saxicolous",
				"sesquipedalian", "superabundant", "unencumbered", "unparagoned", "usufruct", });
		assertEquals("circumlocution", findLongestWord(words));
	}

	/*
	 * 5. The Morse code for SOS is "... --- ..."
	 * Create a method that can tell if SOS is contained in a message.
	 */
	Boolean containsSOS(List<String> message) {
		boolean contain = false;
		for (int i = 0; i < message.size(); i++) {
			if(message.get(i).contains("...---...")) {
				contain = true;
			}
			else {
				contain = false;
			}
			
		}
		return contain;
			
	}
	@Test
	public void testFindString() throws Exception {
		List<String> message1 = Arrays.asList(".... . .-. .-. --- / ... --- ... / -.-- .- .-.. .-.. ...".split("/"));
		assertEquals(false, containsSOS(message1));
		List<String> message2 = Arrays
			.asList(".-- .. - .... / - .... . / .-.. .. --. .... - ... / --- ..- - --..-- / ...---... / .-.. . ... ... / -.. .- -. --. . .-. --- ..- ... / .... . .-. . / .-- . / .- .-. . / -. --- .-- ? / . -. - . .-. - .- .. -. / ..- ... / .. / ..-. . . .-.. / ... - ..- .--. .. -.. / .- -. -.. / -.-. --- -. - .- --. .. --- ..- ... / .... . .-. . / .-- . / .- .-. . / -. --- .-- ? / . -. - . .-. - .- .. -. / ..- ... / .- / -- ..- .-.. .- - - --- --..-- / .- -. / .- .-.. -... .. -. --- --..-- / .- / -- --- ... --.- ..- .. - --- --..-- / -- -.-- / .-.. .. -... .. -.. --- / -.-- . .- .... --..-- / .... . -.-- / -.-- . .- ....".split("/"));
	assertEquals(false, containsSOS(message2));
	}

	/* 6. Write a morse code translator to read the messages. Just kidding! */

	/* 7. Sort the exam results from lowest to highest. */
	List<Double> sortScores(List<Double> results){
		ArrayList<Double> unsort = new ArrayList<Double>();
		for (int i = results.size()-1; i >=0 ; i--) {
			unsort.add(results.get(i));
		}
		List<Double> r = new ArrayList<Double>();
		for(int i = unsort.size()-1; i>=0;i--) {
			int index = 0;
			Double smallest = Double.MAX_VALUE;
			for (int j = 0; j < unsort.size(); j++) {
				if(unsort.get(j)<smallest) {
					smallest = unsort.get(j);
					index = j;
				}
			}r.add(smallest);
			unsort.remove(index);
			
		}
		return r;
	}
	@Test
	public void testSort() throws Exception {
		List<Double> results = Arrays.asList(new Double[] { 60.3, 60.2, 80.4, 67.2, 95.0, 85.5, 40.7, 68.2, 38.4, 94.2, 85.0, 84.5, 50.1,
				66.6 });
		assertEquals(38.4, sortScores(results).get(0), 0.0);
		assertEquals(40.7, sortScores(results).get(1), 0.0);
	assertEquals(95.0, sortScores(results).get(13), 0.0);
}
List<String> sortDNA(List<String> sortedSequences) {
	for (int i = 0; i < sortedSequences.size()-1; i++) {
		int index = i;
		for (int j = i+1; j < sortedSequences.size(); j++) {
			if(sortedSequences.get(j).compareTo(sortedSequences.get(index))<0) {
				String s = index;
				index = j;
				index = i;
				sortedSequences.set(index, s);
				
			}
		}
		

	}
	
return sortedSequences;
	 }
	/* 8. Sort the DNA sequences by length from shortest to longest. */
	@Test
	public void testSortStringLength() throws Exception {
		List<String> unsortedSequences = Arrays.asList(new String[] { "ATAGCTGATCGTAGCTACGTACGATCG", "CATCGTACATGC", "TATGTGT",
				"GCTGATCGTGACTGTAC", "ACTGT" });
		List<String> sortedSequences = Arrays.asList(new String[] { "ACTGT", "TATGTGT", "CATCGTACATGC", "GCTGATCGTGACTGTAC",
				"ATAGCTGATCGTAGCTACGTACGATCG" });
	assertEquals(sortedSequences, sortDNA(unsortedSequences));
	}

	/*
	 * 9. Sort the words in alphabetical order. Your teacher may need to explain compareTo.
	 */
//	@Test
//	public void testSortStringContents() throws Exception {
//		List<String> words = Arrays.asList(new String[] { "aby", "dap", "alt", "alb", "ama", "ard", "ana", "ala", "awn", "dah", "bar",
//				"bee", "bel", "bot", "bis", "cep", "alk", "cog", "col", "cwm", "dag", "ait", "dal", "daw" });
//		assertEquals("aby", Algorithms.sortWords(words).get(0));
//		assertEquals("bar", Algorithms.sortWords(words).get(10));
//		assertEquals("daw", Algorithms.sortWords(words).get(words.size() - 1));
//	}

}
