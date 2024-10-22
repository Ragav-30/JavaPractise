package array.test;

import java.util.Arrays;

public class ArrayShiftLeftRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int shift = 2;
		String a = "right";

		int len = arr.length;
		if (a.equalsIgnoreCase("right")) {
			Shifttymesright(arr, shift, len);
		} else {
			Shifttymes(arr, shift, len);
		}

		System.out.println(Arrays.toString(arr));
	}

	private static void Shifttymesright(int arr[], int shift, int len) {
		// TODO Auto-generated method stub
		for (int i = 0; i < shift; i++) {

			rotateright(arr, len);
		}

	}

	private static void Shifttymes(int arr[], int shift, int len) {
		// TODO Auto-generated method stub
		for (int i = 0; i < shift; i++) {
			rotateleft(arr, len);

		}

	}

	private static void rotateright(int[] arr, int len) {
		// TODO Auto-generated method stub
		int temp = arr[len - 1];

		for (int i = len - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
	}

	private static void rotateleft(int[] arr, int len) {
		// TODO Auto-generated method stub
		int temp = arr[0];

		for (int i = 0; i < len - 1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[len - 1] = temp;
	}

}
