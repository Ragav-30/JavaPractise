package array.test;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, -4, 3, -1 };
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {

			if (sum + arr[i] < 0) {
				sum = 0;
				continue;
			} else {
				sum += arr[i];
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);

	}

}
