package recursion;

public class PotenciaAB {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		
		System.out.print("pow(" + a + "," + b + ") = ");
		int result = pow(a,b);			
		System.out.print(" = " + result);
		
	}
	
	public static int pow(int a, int b) {
		
		if(b == 1) {				
			System.out.print(a);
			return a;
		}
		
		System.out.print(a + "*");
		
		return a * pow(a, b-1);			
	}

}
