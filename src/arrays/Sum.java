package arrays;

import java.util.stream.IntStream;

public class Sum {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		sum(array);
		System.out.println(IntStream.of(array).reduce(Integer::sum));

	}

	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i <= array.length; i++) {
			if (i > 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		return sum;
	}
}
