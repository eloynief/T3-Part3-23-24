package ej1;

import java.util.InputMismatchException;
import java.util.Scanner;
import ej1.Operaciones;

public class Main {

	public static void main(String[] args) {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		Operaciones op=new Operaciones();
		
		//
		double n1,n2;
		int opcion;
		
		opcion=menu();
		
		
		//
		n1=pideNumero();
		
		n2=pideNumero();

		op
		
		//
		switch(opcion) {
		
		case 1:{
			
		}
		
		case 2:{
			
		}
		
		case 3:{
			
		}
		
		case 4:{
			
		}
		
		case 5:{
			
		}
		
		case 6:{
			
		}
		
		case 0:{
			
		}
		
		
		
		}
		

		
		
		//cierre de scanner
		sc.close();
		
	}
	
	//
	public static int menu() {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
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
		

		

		//cierre de scanner
		sc.close();
		
		
		return opcion;
	}
	
	public static double pideNumero() {

		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		double n=0;
		
		

		do {
			try {

				

				n=sc.nextInt();
				
			}catch(InputMismatchException e){
				System.out.println("El valor introducido no con");
			}
			
		}while(n>=0);
		
		
		
		return n;
	}

	
	

}
