package pattern.test;

public class ZohoPattern {
	public static void main(String args[]) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			int p = i - 1;
			for (int j = 1; j < i; j++) {
				System.out.print(p--);

			}
			int l = 0;
			for (int j = 1; j <= i; j++) {
				System.out.print(l++);
			}

			System.out.println();
		}

	}
}
