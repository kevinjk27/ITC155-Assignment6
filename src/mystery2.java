import java.util.Arrays;

/*
 * Based on code below we can determine it has 0(N) complexity.
 * This is because the for loop on line 15 is the worst case scenario
 * As the length of the index increases, it takes longer time to run this code.
 * The remaining codes are only variable assignment as it will have the same processing time as the size of input rises
 */

public class mystery2 {

	public static void main(String[] args) {
		int[] intArray = new int[] { 6, 9, 62, 56, 15, 9, 10 };
		mystery2(intArray);
		System.out.println(Arrays.toString(intArray));

	}

	public static void mystery2(int[] list) {
		for (int i = 0; i < list.length / 2; i++) { // O(N) => time complexity is dependent on the length of list
			int j = list.length - 1 - i; // O(1) => the time takes to complete this task will be constant
			int temp = list[i]; // O(1) => variable assignment
			list[i] = list[j]; // O(1) => variable assignment
			list[j] = temp; // O(1) => variable assignment
		} 

	}
}

