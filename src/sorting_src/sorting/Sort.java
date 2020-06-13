package sorting;

import java.util.ArrayList;

public class Sort {
	public void bubbleSortAscending(ArrayList<Integer> list) {
		int i, j, temp;
		int size = list.size();
		for (i = 0; i < size; i++) {
			for (j = 0; j < size - i - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					// swap the elements
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		
		System.out.println("Array after ascending 'Bubble' sorting : " + list.toString());
	}
	public void bubbleSortDescending(ArrayList<Integer> list) {
		int i, j, temp;
		int size = list.size();
		for (i = 0; i < size; i++) {
			for (j = 0; j < size - i - 1; j++) {
				if (list.get(j) < list.get(j + 1)) {
					// swap the elements
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		
		System.out.println("Array after descending 'Bubble' sorting : " + list.toString());
	}
}
