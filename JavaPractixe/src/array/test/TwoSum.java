package array.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 1, 2, 3, 4 };
		int target = 3;
		Map<Integer, Object> map = new HashMap<Integer, Object>();
		for (int i = 0; i < a.length; i++) {

			if (map.containsKey(target - a[i])) {
				System.out.println(Arrays.asList(i, map.get(target - a[i])));
				break;
			}
			map.put(a[i], i);
		}

	}

}
