package array.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int arr[] = { -1, 0, 1, 2, -1, -4 };
		Arrays.sort(arr);

		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			m.put(arr[i], i);
		}

		Set<String> used = new HashSet<String>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int currval = arr[i] + arr[j];
				if (m.containsKey(-1 * currval)) {
					int k = m.get(-1 * currval);
					if (!used.contains(arr[i] + ":" + arr[j] + ":" + arr[k]) && k > i && k > j) {
						result.add(Arrays.asList(arr[i], arr[j], arr[k]));
						used.add(arr[i] + ":" + arr[j] + ":" + arr[k]);

					}
				}
			}
		}
		System.out.println(result);

	}

}
