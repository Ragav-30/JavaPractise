package array.test;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {12,20,30,40,50};
int temp = arr[0];
arr[0]=arr[arr.length-1];
int i=1;
while(i<arr.length-1) {
	arr[i]=arr[i+1];
	i++;
}
arr[arr.length-1]=  temp;
for(int n: arr) {
System.out.println(n);}
	}

}
