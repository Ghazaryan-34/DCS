package sorting;

import java.util.ArrayList;
import java.util.Random;

public class HomeWork {
	public static void showSwaping(int a, int b) {
		Swap swap = new Swap();
		swap.set(a, b);

		// before swaping
		System.out.println("Values before swaping.");
		swap.printValues();
		// swap
		swap.swapValues();
		// after swaping
		System.out.println("Values after swaping.");
		swap.printValues();
	}

	public static void main(String[] args) {
		Random rand = new Random();
		
		//swap without temporary variable
		showSwaping(rand.nextInt(50),rand.nextInt(50));
		
		//create and sort array of integers
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			list.add(rand.nextInt(100));    // Generate integers and add to list. Range 0 to 100.
		}
		System.out.println("Array before sorting : " + list.toString());
		
		Sort sort = new Sort();
		sort.bubbleSortAscending(list);
		sort.bubbleSortDescending(list);
	}

}
