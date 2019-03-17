package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		_00_LinearSearch linearSearch = new _00_LinearSearch();
		String[] words  = {
				"hi","bye","whats up"
		};
		//1. use the assertEquals method to test your linear search method.
	assertEquals(linearSearch.linearSearch(words, "hi"),0);
	
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		_01_BinarySearch binarySearch = new _01_BinarySearch();
		int[] array = {1,2,3,4};
		assertEquals(binarySearch.binarySearch(array, 1, 4, 1),0);
		assertEquals(binarySearch.binarySearch(array, 1, 4, 2),-1);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		_02_InterpolationSearch interpolationSearch = new _02_InterpolationSearch();
		int[] array = {1,2,3,4};
		
		assertEquals(interpolationSearch.interpolationSearch(array, 1),0);
		assertEquals(interpolationSearch.interpolationSearch(array, 2),1);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		_03_ExponentialSearch exponentialSearch = new _03_ExponentialSearch();
		int[] array = {1,2,3,4,};
		assertEquals(exponentialSearch.exponentialSearch(array, 1),0);
	}
}
