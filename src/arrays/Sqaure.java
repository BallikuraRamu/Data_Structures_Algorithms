package arrays;

import java.util.Arrays;

public class Sqaure {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		sqaure(array);
		System.out.println(Arrays.toString(array));
	}

	public static void sqaure(int[] array) {
		int[] sqaure = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			sqaure[i] = array[i] * array[i];
		}
		System.out.println(Arrays.toString(sqaure));
	}
}
