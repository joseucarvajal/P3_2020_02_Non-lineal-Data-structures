package stack;

public class Calculadora {
	
	/*
	 * op = [+ OR -]
	 * */
	void calculate(float n1, float n2, String op) {
		float res = performOperation(n1, n2, op);
		displayResult(res, n1, n2, op);
	}
	
	float performOperation(float n1, float n2, String op) {
		float result = 0;
		
		if(op.equals("+" )) {
			result = add(n1, n2);
		}
		else if(op.equals("-")) {
			result = sub(n1, n2);
		}
		
		return result;
	}
	
	float add(float n1, float n2) {
		return n1 + n2;
	}
	
	float sub(float n1, float n2) {
		return n1 - n2;
	}
	
	void displayResult(float result, float n1, float n2, String op) {
		System.out.println(n1 + " " + op + " " + n2 + " = " + result);
	}
}
