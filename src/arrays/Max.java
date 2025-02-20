package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Max {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		max(array);
		System.out.println(Arrays.toString(array));
		System.out.println(IntStream.of(array).boxed().sorted(Comparator.reverseOrder()).skip(1).reduce(Integer::max));
	}

	public static int max(int[] array) {
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max || array[i] > secMax) {
				secMax = (array[i] < max) ? array[i] : max;
				max = array[i];
			}
		}
		System.out.println(secMax);
		return secMax;
	}
}
