package recursion;

public class Multiplicacion {
	public static void main(String[] args) {
		int x = multiplicar(5,3);
		System.out.println("resultado: " + x);
	}
	
	public static int multiplicar(int a, int b) {
		if(b == 1) {
			return a;
		}
		
		return a + multiplicar(a, b-1);				
	}
}