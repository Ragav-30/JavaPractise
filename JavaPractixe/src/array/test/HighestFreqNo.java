package array.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestFreqNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 2, 1, 1, 2, 3, 4, 3, 3 };

		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!m.containsKey(arr[i])) {
				m.put(arr[i], 0);
			}
			m.put(arr[i], m.get(arr[i]) + 1);

		}
		Map<Integer, List<Integer>> n = new HashMap<Integer, List<Integer>>();
		for (int i : m.keySet()) {
			int count = m.get(i);
			if (!n.containsKey(count)) {
				n.put(count, new ArrayList<Integer>());
			}
			n.get(count).add(i);
		}
		System.out.println(m);
		int max = Collections.max(n.keySet());
		System.out.println(n.get(max));
	}

}
