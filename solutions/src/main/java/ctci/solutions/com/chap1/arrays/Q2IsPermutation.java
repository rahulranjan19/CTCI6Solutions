package ctci.solutions.com.chap1.arrays;

public class Q2IsPermutation {
	private static final String str1 = "abcdefghijklmnopqrstuvwxyz";
	private static final String str2 = "bcdefghijklmnopqrstuvwxyza";
	private static final String str3 = "eefdfgwergefgsfgsbxzdgghdd";

	public static void runSolution() {
		System.out.println("Checking for permutation in a string.");
		System.out.println(" With correct string: " + Q2IsPermutation.hasPermutationStringFunction(str1, str2));
		System.out.println(" With incorrect string: " + Q2IsPermutation.hasPermutationStringFunction(str1, str3));
		System.out.println(" With incorrect string: " + Q2IsPermutation.hasPermutationStringFunction(str2, str3));

		System.out.println(" With correct string: " + Q2IsPermutation.hasPermutationString(str1, str2));
		System.out.println(" With incorrect string: " + Q2IsPermutation.hasPermutationString(str1, str3));
		System.out.println(" With incorrect string: " + Q2IsPermutation.hasPermutationString(str2, str3));
	}

	private static boolean hasPermutationStringFunction(String str1, String str2) {
		boolean isPermutation = true;

		for (Character chr : str1.toCharArray()) {
			if (str2.indexOf(chr) < 0) {
				isPermutation = false;
				break;
			}
		}
		return isPermutation;
	}

	private static boolean hasPermutationString(String str1, String str2) {

		if (str2.length() > str1.length()) {
			return false;
		}

		boolean isPermutation = true;
		char[] charArr = new char[256];

		for (char temp : str1.toCharArray()) {
			charArr[temp] = 1;
		}

		for (char temp : str2.toCharArray()) {
			if (charArr[temp] != 1) {
				isPermutation = false;
				break;
			}
		}

		return isPermutation;
	}
}
