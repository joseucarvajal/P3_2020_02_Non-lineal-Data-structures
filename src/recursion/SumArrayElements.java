package recursion;

public class SumArrayElements {
	
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 5, 6 } ;
		int total = sum(arr, 0);
		System.out.println("The sum is: " + total);
	}

	public static int sum(int[] a, int i) {
		if(i == a.length) {
			return 0;
		}
		
		return a[i] + sum(a, i+1);
	}
	
}
