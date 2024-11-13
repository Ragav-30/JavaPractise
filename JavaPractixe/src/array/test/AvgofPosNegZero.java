package array.test;

import java.util.Arrays;

public class AvgofPosNegZero {

	public static void main(String[] args) {
		int arr[] = { -1, -3, 1, -4, 2, -6, 3 };
		int copy[] = new int[arr.length];
		int size = arr.length - 1;
		int n = 0;
		for (int i = 0; i < arr.length; i++) { // -1 1 2 3 0 0
			if (arr[i] < 0) { // 0 1 2 3 4 5
				copy[n] = arr[i];
				n++;

			} /*
				 * else { copy[n] = arr[i]; n++; }
				 */
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				copy[n] = arr[i];
				n++;
			}
		}
		System.out.println(Arrays.toString(copy));
	}

}
