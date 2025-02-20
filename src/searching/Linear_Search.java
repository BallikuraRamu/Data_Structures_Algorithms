package searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 5, 8, 7, 9 };
		System.out.println(Arrays.toString(array));
		System.out.print("Enter your number : ");
		try (Scanner scanner = new Scanner(System.in)) {
			int target = scanner.nextInt();
			System.out.println("Target is : " + target);
			linear(array, target);
			System.out.println("Time Complexity : O(n) ");
		}
	}

	public static int linear(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				System.out.println("Index at " + i);
				return i;
			}
		}
		return -1;
	}
}
