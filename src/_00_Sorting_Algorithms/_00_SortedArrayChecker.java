package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
public static boolean intArraySorted(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]<arr[i]) {
			return true;
		}
		else if(arr[i]>arr[i]) {
			return false;
		}
		
	}
	return false;

	
}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
static boolean doubleArraySorted(Double[] dub) {
	for (int i = 0; i < dub.length; i++) {
		if(dub[i]-1<dub[i]) {
			return true;
		}
		else if(dub[i-1]>dub[i]) {
			return false;
		}
	}
	return false;
}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
static boolean charArraySorted(char[] c) {
	for (int i = 0; i < c.length; i++) {
		if(c[i-1]<c[i]) {
			return true;
		}
		else if(c[i-1]>c[i]) {
		
	
	return false;
		}}
	return false;
}
	










	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
static boolean stringArraySorted(String[] s) {
	for (int i = 0; i < s.length; i++) {

		
	}
			
		
	return false;	
	
}
}
