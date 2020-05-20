/*
 * Based on code below we can determine it has 0(N) complexity.
 * This is because the for loop one line 16 is the worst case scenario
 * As the length of the index increases, it takes longer time to run this code.
 * The remaining codes are only variable assignment as it will have the same processing time as the size of input rises
 */

public class mystery1 {

	public static void main(String[] args) {

	}

	public static int[] mystery1(int[] list) {
		int[] result = new int[2 * list.length]; // O(1) => variable assignment
		for (int i = 0; i < list.length; i++) { // O(N) => time complexity is dependent on the length of list
			result[2 * 1] = list[1] / 2 + list[i] % 2; // O(1) => accessing the value of index
			result[2 * i + 1] = list[i] / 2; // O(1) => accessing the value of index
		}
		return result; // O(1) => variable assignment

	}
}
