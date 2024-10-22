package array.test;

import java.util.HashSet;

public class MissingNoInAArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 6 };
		int max = 6;
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		System.out.println(s);
		for (int n = 1; n <= max; n++) {
			if (!s.contains(n)) {
				System.out.println(n);
			}
		}

	}

}
