package array.test;

public class ConsecutiveMax1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 };
		int max = 0, count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			}
			if (arr[i] != 1) {
				max = Math.max(max, count);
				count = 0;

			}

		}
		max = Math.max(max, count);
		System.out.println(max);
	}

}
