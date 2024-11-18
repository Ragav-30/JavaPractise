package array.test;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 3, 2, 7 };
		int val = 4;
		int kthmax = max(a, val);
		System.out.println(kthmax);
	}

	private static int max(int[] a, int val) {
		// TODO Auto-generated method stub
		int kthmaxval = 0;
		for (int i = 0; i < val; i++) {
			kthmaxval = findMax(a);
		}
		return kthmaxval;
	}

	private static int findMax(int[] a) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE, n = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				n = i;
			}
		}
		a[n] = Integer.MIN_VALUE;
		return max;
	}

}
