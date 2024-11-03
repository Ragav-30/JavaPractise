package array.test;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 122, 1220, 2939 };
		int frst = 0;
		int last = a.length - 1;

		int key = 90;

		while (frst <= last) {
			int mid = (frst + last) / 2;
			if (a[mid] == key) {
				System.out.println("The key is present in " + mid);
				break;
			} else if (a[mid] < key) {
				frst = mid + 1;
			} else if (a[mid] > key) {
				last = mid - 1;
			}

		}

	}

}
