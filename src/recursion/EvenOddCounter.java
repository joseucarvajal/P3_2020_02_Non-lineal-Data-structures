package recursion;

public class EvenOddCounter {

	public static void main(String[] args) {
		
		int[] array = new int[] { 3, 15, 8, 7, 4 };
		eoc(array, 0, 0, 0);
	}
	
	public static void eoc(int[] arr, int i, int ec, int oc) {
		
		//Base case
		if(i == arr.length) {
			System.out.println("even count: " + ec);
			System.out.println("odd count: " + oc);
			return;
		}
		
		//r function
		if(r(arr[i]) == true) {
			ec++;
		}
		else {
			oc++;
		}
		
		eoc(arr, i+1, ec, oc);		
	}
	
	public static boolean r(int number) {
		if(number % 2 == 0) {
			return true;
		}
		return false;
	}

}
