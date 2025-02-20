package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 1, 4, 2, 3, 5 };
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(IntStream.of(array).boxed().sorted().collect(Collectors.toList()));
		System.out.println(IntStream.of(array).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
	}

	public static void bubbleSort(int[] array) {
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

}
