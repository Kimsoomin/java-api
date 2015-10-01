package sort;

import java.util.Vector;

public class AscSort {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		Vector<Integer> vec2 = new Vector<Integer>();
		
		int[] arr = { 2, 5, 68, 79, 123, 4, 9 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		for (int i : arr) {
			vec.add(i);

		}
		System.out.println(vec.toString());
		System.out.println("=======내림차순=======");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		for (int i : arr) {
			vec2.add(i);

		}
		System.out.println(vec2.toString());

	}
}
