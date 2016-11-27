package ctci.solutions.com.chap1.arrays;

public class Q3Urlify {
	private static String url = "aa bbb cccc d ee ff ggg hh iii j kkkk          ";

	public static void runSolution() {
		System.out.println("Changing string to url.");
		System.out.println(" With correct string: " + Q3Urlify.changeToURL(url));
	}

	private static String changeToURL(String url) {

		StringBuilder sbuilder = new StringBuilder();

		for (char temp : url.trim().toCharArray()) {
			if (temp == ' ') {
				sbuilder.append("%20");
			} else {
				sbuilder.append(temp);
			}
		}

		return sbuilder.toString();
	}
}
