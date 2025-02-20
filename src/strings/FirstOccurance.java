package strings;

public class FirstOccurance {

	public static void main(String[] args) {
		String str = "Hello";
		firstOccurance(str);
	}

	public static void firstOccurance(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length - 1; i++) {
			if (chars[i] == chars[i + 1]) {
				System.out.println(chars[i]);
			}
		}
	}
}
