/*
 * In this code the N is determined by length of int array
 * 
 * The first for loop will start at the tail of array (index of -1) -- using int i toward the index of 0
 * once the numbers[i] has been taken we can use it as comparator
 * 
 * The second for loop, is checking whether numbers[i] is the biggest number 
 * The loop will compare numbers[i] with each number list-- using int j starting from index of 0
 * If numbers[i] isn't the biggest, numbers[j] will be the biggest.
 * 
 * Then the biggest number will be placed at numbers[i]
 * 
 * As the iteration goes from first loop and then performing another loop inside it, the time complexity will fall at O(N^2).
 * there isn't any difference of time complexity when starting to sort from the head (small number first) or from the tail (big number first)
 */

import java.util.Arrays;

public class question18 {

	public static void main(String[] args) {
		int[] intArray = { 2, 9, 16, 38, 85, 4, 49, 48, 47 };
		tailSelectionSort(intArray);
		System.out.println(Arrays.toString(intArray));
	}

	public static int[] tailSelectionSort(int[] numbers) {
		int maxLength = numbers.length;
		for (int i = maxLength - 1; i >= 0; i--) {
			int biggestIndex = i; // find the biggest index #
			int biggestNumber = numbers[i]; // start at index -1 (right to left)

			for (int j = 0; j <= i; j++) {
				// comparing another number from index 0
				if (numbers[j] > biggestNumber) { // comparing the index of i with index of J
					biggestNumber = numbers[j]; // what is the biggest number?
					biggestIndex = j; // what is the biggest number index location?
				}

			}
			int temporary = numbers[i]; // saving temporarily the number in index[i] before being changed
			numbers[i] = numbers[biggestIndex]; // placing the biggest number in index [i]
			numbers[biggestIndex] = temporary; // placing the temporarily the number at where numbers[biggestIndex] was

		}
		return numbers;
	}
}
