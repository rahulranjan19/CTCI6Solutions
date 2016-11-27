package ctci.solutions.com.chap1.arrays;

public class Q4PermutationP {
	private static String wrong = "asdk kjsdh kjkakf";
	private static String correct = "tatc o ct at";

	public static void runSolution() {
		System.out.println("Checking if combination has palindrome");
		System.out.println(" With correct string: " + Q4PermutationP.checkForPermutationPalindrome(correct));
		System.out.println(" With incorrect string: " + Q4PermutationP.checkForPermutationPalindrome(wrong));
	}

	private static boolean checkForPermutationPalindrome(String string) {

		char[] charArr = new char[256];

		int length = 0;
		for (char temp : string.toCharArray()) {
			if (temp != ' ') {
				charArr[temp]++;
				length++;
			}
		}

		boolean permutationP = true;
		int oddDigitCount = length % 2;
		for (int temp : charArr) {
			if (temp % 2 == 1) {
				if (oddDigitCount > 0) {
					oddDigitCount--;
				} else {
					permutationP = false;
					break;
				}
			}
		}

		return permutationP;
	}

}
