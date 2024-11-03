package array.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KthElementOfHighFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 1, 1, 4, 4, 4, 3, 3, 3, 3, 3, 4, 6, 7 };
		int k = 3;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			if (!m.containsKey(a[i])) {
				m.put(a[i], 1);
			} else {
				m.put(a[i], m.get(a[i]) + 1);
			}
		}
		System.out.println(m);

		Map<Integer, ArrayList<Integer>> n = new HashMap<>();

		for (int i : m.keySet()) {
			int count = m.get(i);
			if (!n.containsKey(count)) {
				n.put(count, new ArrayList<Integer>());
			}
			n.get(count).add(i);

		}
		System.out.println(n);
		int[] o = new int[k];
		int index = 0;
		for (int j = a.length; j >= 1; j--) {
			if (n.containsKey(j)) {
				for (int i : n.get(j)) {
					if (index < k) {
						o[index++] = i;

					} else
						break;
				}
			}
			if (index > k)
				break;

		}
		System.out.println(Arrays.toString(o));
		;

	}

}
