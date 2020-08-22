package recursion;

public class BusquedaElemEnArreglo {

	public static void main(String[] args) {		
		int[] arreglo = new int[] {3, 8, 7, 2, 5, 7, 14};
		int elemento = 7;
		boolean resultadoBusqueda = buscar(arreglo, elemento, 0);
		System.out.println("Encontrado (" + elemento + ")? " + resultadoBusqueda);
	}
	
	public static boolean buscar(int[] arr, int elm, int desde) {
		
		//1. Caso base
		if(desde == arr.length) {
			return false;
		}
		
		//2. Resolver parte del problema
		if(arr[desde] == elm) {
			return true;
		}
		
		//3. Hacer el problema más pequeño
		return buscar(arr, elm, desde + 1);
	}

}
