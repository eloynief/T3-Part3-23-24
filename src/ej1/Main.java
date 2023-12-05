package ej1;

import java.util.InputMismatchException;
import java.util.Scanner;
import ej1.Operaciones;


//invocas a dios
import java.lang.Object;



public class Main {

	//creación de scanner
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {

		
		Operaciones op;
		
		//
		double n1,n2,resultado;
		int opcion;
		
		//
		opcion=menu();
		
		
		System.out.println("Introduce un numero");
		
		//
		n1=pideNumero();

		System.out.println("Introduce otro numero");
		
		n2=pideNumero();

		//op
		op=new Operaciones(n1,n2);
		
		if(opcion>0||opcion<=6) {
			
		}
		
		
		//
		switch(opcion) {
			
			case 1:{
				
				resultado=Operaciones.suma();
				//imprime la respuesta
				System.out.println(resultado);
				
			}//caso suma
			
			case 2:{
				
				resultado=Operaciones.resta();
				//imprime la respuesta
				System.out.println(resultado);
				
			}//caso resta
			
			case 3:{
				
				resultado=Operaciones.multiplicacion();
				//imprime la respuesta
				System.out.println(resultado);
			}
			
			case 4:{
				
				resultado=Operaciones.division();
				//imprime la respuesta
				System.out.println(resultado);
			}
			
			case 5:{
				
				resultado=Operaciones.max();
				//imprime la respuesta
				System.out.println(resultado);
			}
			
			case 6:{
				
				resultado=Operaciones.min();
				//imprime la respuesta
				System.out.println(resultado);
			}
		}//switch fin
		

		//cierre de scanner
		sc.close();
		
		
		
	}
	
	//
	public static int menu() {

		
		int opcion=-1;

		
		System.out.println("Menu:");
		System.out.println("Elige la opsion del menu: ");
		System.out.println("1: Suma");
		System.out.println("2: Resta");
		System.out.println("3: Multiplicacion");
		System.out.println("4: Division");
		System.out.println("5: Maximo");
		System.out.println("6: Minimo");
		System.out.println("0: Salir");
		System.out.println("");
		
		do {
			try {

				opcion=sc.nextInt();
				sc.nextLine();
				
			}catch(InputMismatchException e){
				System.out.println("El valor introducido es incorrecto");
			}
			
		}while(opcion<0||opcion>6);
		
		return opcion;
	}
	
	//funcion que te permite introducir un 
	public static double pideNumero() {

		
		double n=-1;
		
		

		do {
			try {

				

				n=sc.nextInt();
				
			}catch(InputMismatchException e){
				System.out.println("El valor introducido no es entero");
			}
			
		}while(n<=0);
		
		
		
		return n;
	}

	
	

}
