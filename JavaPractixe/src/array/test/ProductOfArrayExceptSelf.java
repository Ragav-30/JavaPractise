package array.test;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int a[] = { 2, 3, 0, 4 };

		int result[] = new int[a.length];
		int pre = 1, post = 1;
		// logic is pre is used to count the product of left side values frst time we
		// consider as 1 before a[0] same for post we used to count product of right
		// hand side

		for (int i = 0; i < a.length; i++) {
			result[i] = pre;
			pre *= a[i];
		}
		for (int j = a.length - 1; j >= 0; j--) {
			result[j] *= post;
			post *= a[j];
		}
		System.out.println(Arrays.toString(result));
		// TODO Auto-generated method stub

	}

}
