package math.test;

public class NumberPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
		int copy = i;
		int copy1 = i;
		int num = 0;
		int mul = 0;
		int digit;
		int d = 0;
		while (copy > 0) {
			d++;
			copy /= 10;
		}
		System.out.println(d);

		while (copy > 0) {
			digit = copy % 10; // 2 7 2
			num = num * 10 + digit;// 2 27 272
			copy /= 10; // 27 2 0
		}
		while (copy1 > 0) {
			int digit1 = copy1 % 10;
			mul = mul + (digit1 * digit1 * digit1);
			copy1 /= 10;
		}
		if (num == i) {
			System.out.println("it is palindrome");

		} else {
			System.out.println("It is not a palindrome " + num + " " + mul);
		}
	}

}
