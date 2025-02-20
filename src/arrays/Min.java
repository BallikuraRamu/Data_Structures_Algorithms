package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Min {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		min(array);
		System.out.println(Arrays.toString(array));
		
		System.out.println(IntStream.of(array).skip(1).reduce(Integer::min));
	}

	public static int min(int[] array) {
		int min = array.length;
		int secMin = array.length;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min || array[i] < secMin) {
				secMin = (array[i] > min) ? array[i] : min;
				min = Math.min(min, array[i]);
			}
		}
		System.out.println(secMin);
		return secMin;
	}
}
