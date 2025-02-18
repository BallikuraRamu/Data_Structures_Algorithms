package linear;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		int[] array = { 1, 3, 2, 5, 4, 7, 6, 8, 9 };
		System.out.println("Original Array : " + Arrays.toString(array));
		sorting(array);
		System.out.println("After  Sort    : " + Arrays.toString(array));
		System.out.print("Enter Your Number : ");
		try (Scanner scanner = new Scanner(System.in)) {
			int target = scanner.nextInt();
			System.out.println("Index at : "+binary(array, target));
			System.out.println("Time Complexity is (Log n)");
		}
	}

	public static void sorting(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static int binary(int[] array, int target) {
		int low = 0, high = array.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
