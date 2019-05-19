package testerClasses;

import java.util.ArrayList;

import strategiesClasses.BubbleSort;

public class BubbleSortTester1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> data = TestingUtils.generateListOfIntegers(500); 
		
		TestingUtils.displayListElements("Original Data", data);
		
		BubbleSort<Integer> sorter = new BubbleSort<>(new IntegerComparator2()); 
		 

		sorter.sortList(data);
		
		TestingUtils.displayListElements("Sorted", data);
	}

}
