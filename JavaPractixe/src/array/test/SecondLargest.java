package array.test;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {10,1000,30,60};
int i=0;
int max=0,secondMax=0;
while(i<arr.length) {
	if(arr[i]>max) {
		secondMax = max;
		max=arr[i];
		
	}
	else if(arr[i]>secondMax) {
		secondMax = arr[i];
	}
	i++;
}

System.out.println(max);
System.out.println(secondMax);
	}

}
