package array.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RearrangeElementsBySign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr = { 1, -2, -3, 4, 5, -6 };
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, -2, -3, 4, 5, -6));
		int n = a.size();
		ArrayList<Integer> b = new ArrayList<>(Collections.nCopies(n, 0));

		int pos = 0, neg = 1;
		for (int i = 0; i < n; i++) {
			if (a.get(i) < 0) {
				b.set(neg, a.get(i));
				neg += 2;
			}
			if (a.get(i) > 0) {
				b.set(pos, a.get(i));
				pos += 2;
			}

		}
		System.out.println(b);

	}

}
