package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int i = 0; i < array.length; i++) {
			if(array[0]>array[1]) {
				int s = array[0];
				array[0] = array[1];
				array[1] = s;
		System.out.println(array[i]);
		
			}
		}
	}
		
	
}
