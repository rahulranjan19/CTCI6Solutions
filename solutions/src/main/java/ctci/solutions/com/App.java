package ctci.solutions.com;

import ctci.solutions.com.chap1.arrays.Q1IsUnique;
import ctci.solutions.com.chap1.arrays.Q2IsPermutation;
import ctci.solutions.com.chap1.arrays.Q3Urlify;
import ctci.solutions.com.chap1.arrays.Q4PermutationP;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		runChap1();
	}

	private static void runChap1() {
		System.out.println("calling chap1 solns");
		Q1IsUnique.runSolution();
		Q2IsPermutation.runSolution();
		Q3Urlify.runSolution();
		Q4PermutationP.runSolution();
	}
}
