package ctci.solutions.com.chap1.arrays;

public class Q5IsOneAway {
	private static String str1 = "ababc";
	private static String str2 = "ababd";
	private static String str3 = "abab";
	private static String str4 = "abacc";
	private static String str5 = "abcc";

	public static void runSolution() {
		System.out.println("Checking if combination has palindrome");
		System.out.println(" With correct string: " + Q5IsOneAway.checkOneAway(str1, str2));
		System.out.println(" With correct string: " + Q5IsOneAway.checkOneAway(str1, str3));
		System.out.println(" With correct string: " + Q5IsOneAway.checkOneAway(str1, str4));
		System.out.println(" With incorrect string: " + Q5IsOneAway.checkOneAway(str1, str5));
	}

	private static boolean checkOneAway(String str1, String str2) {
		int distance = 1;
		boolean isOnwAway = true;

		if (Math.abs(str1.length() - str2.length()) > distance) {
			return false;
		}

		int strMaxLength = str1.length() > str2.length() ? -1 : (str1.length() == str2.length() ? 0 : 1);
		int minLength = strMaxLength < 0 ? str2.length() : str1.length();
		int indexLeft = 0;
		int indexRight = 0;
		for (int index = 0; index < minLength; index++, indexLeft++, indexRight++) {
			if (str1.charAt(indexLeft) != str2.charAt(indexRight)) {
				if (distance == 0) {
					isOnwAway = false;
					break;
				}
				distance--;
				if (strMaxLength > 0) {
					indexLeft--;
				} else if (strMaxLength < 0) {
					indexRight--;
				}
			}
		}

		return isOnwAway;
	}

}
