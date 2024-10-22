package math.test;

public class TrialingZeroesInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int temp = 1;
		int count = 0;
		for (int i = 2; i <= n; i++) {
			temp = i;
			if (temp % 5 == 0) {
				count++;
				temp = temp / 5;
			}

		}
		System.out.println(count);
	}

}
