package ej1;

public class Operaciones {

	//variables que represenrtan los dos numeros a los que le introducimos el valor
	public static double n1;
	public static double n2;
	

	/**
	 * 
	 */
	public Operaciones() {
	}
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 */
	public Operaciones(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	



	public static double suma() {
		// Calcula la suma de num1 y num2 y la devuelve
		
		return n1+n2;
	}
	
	public static double resta() {
		// Calcula la resta de num1 y num2 y la devuelve
		
		return n1-n2;
	}
	
	public static double multiplicacion() {
		// Calcula la multiplicación de num1 y num2 y la devuelve
		
		return n1*n2;
		
	}
	
	public static double division() {
		// Calcula la division de num1 y num2 y la devuelve
		
		
		return n1/n2;
	}
	
	public static double max() {
		// Calcula el máximo de num1 y num2 y lo devuelve
		double max;
		
		if(n1>n2) {
			max=n1;
			
		}
		else {
			max=n2;
		}
		
		
		return max;
	}
	
	public static double min() {
		// Calcula el mínimo de num1 y num2 y lo devuelve
		double min;

		if(n1<n2) {
			min=n1;
			
		}
		else {
			min=n2;
		}
		
		
		return min;
	}
}
