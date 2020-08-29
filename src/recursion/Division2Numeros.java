package recursion;

public class Division2Numeros {

	public static void main(String[] args) {
		int division = d(500, 10);
		System.out.println("Division result " + division);
	}
	
	public static int d(int n1, int n2) {
		if(n1 == n2) {
			return 1;
		}
		
		return d(n1-n2, n2) + 1;
	}

}
