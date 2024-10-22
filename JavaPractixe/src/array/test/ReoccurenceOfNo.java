package array.test;

public class ReoccurenceOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 2 };
		int arrcopy[] = new int[arr.length];
		int detected = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arrcopy[j] = detected;
				}
			}
			if (arrcopy[i] != detected) {
				arrcopy[i] = count;
			}
		}
		for (int k = 0; k < arr.length; k++) {
			if (arrcopy[k] != detected) {
				System.out.println("Frequency of " + arr[k] + " is " + arrcopy[k]);
			}
		}
		for (int i = 0; i < arrcopy.length; i++) {
			if (arrcopy[i] > (arr.length / 2)) {
				System.out.println(arr[i]);
			}
		}
	}

}
