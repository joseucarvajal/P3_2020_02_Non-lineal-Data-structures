package recursion;

public class Multiplicacion {
	public static void main(String[] args) {
		int x = multiplicar(5,3);
		System.out.println("resultado: " + x);
	}
	
	public static int multiplicar(int a, int b) {
		
		//1. caso base
		if(b == 1) {
			return a;
		}
		
		//2 y 3 resolver parte del problema y hacerlo más pequeño.
		return a + multiplicar(a, b-1);				
	}
}