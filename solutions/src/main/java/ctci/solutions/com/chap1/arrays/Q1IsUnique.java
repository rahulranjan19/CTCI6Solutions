package ctci.solutions.com.chap1.arrays;

import java.util.HashSet;
import java.util.Set;

public class Q1IsUnique {

	private static final String correct = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String wrong = "ABCDEFGHIJKKLMNOPQRSTUVWXYZ";

	public static void runSolution() {
		System.out.println("Checking for unique chars in a string.");
		System.out.println(" With correct string: " + Q1IsUnique.hasUniqueCharDS(correct));
		System.out.println(" With incorrect string: " + Q1IsUnique.hasUniqueCharDS(wrong));
		System.out.println(" With correct string: " + Q1IsUnique.hasUniqueChar(correct));
		System.out.println(" With incorrect string: " + Q1IsUnique.hasUniqueChar(wrong));
	}

	private static boolean hasUniqueCharDS(String string) {
		boolean hasUniqueChar = true;
		Set<Character> uniqueChar = new HashSet<>();

		for (Character charArr : string.toCharArray()) {
			if (!uniqueChar.add(charArr)) {
				hasUniqueChar = false;
				break;
			}
		}

		return hasUniqueChar;
	}

	private static boolean hasUniqueChar(String string) {
		boolean hasUniqueChar = true;
		char[] charArr = new char[256];

		for (char temp : string.toCharArray()) {
			if (charArr[temp] != 0) {
				hasUniqueChar = false;
				break;
			}
			charArr[temp] = 1;
		}

		return hasUniqueChar;
	}
}
