package com.mipaquete;

public class EjemplosBooleanos {

	public static void funcionPrincipal() {
		System.out.println("Ejemplos Booleanos. ");
		
		//Variables:
		int a = 1;
		int b = 9;
		operadoresComparacion(a, b);		
	}
	public static void operadoresComparacion(int a,int b) {
		//Funciones:
		if (a == b)
			System.out.println(a + " es Igual " + b);
		if (a > b)
			System.out.println(a + " es mayor que " + b);
		if (a < b)
			System.out.println(a +" es menor que " + b);
		if (a <= b)
			System.out.println(a + " es menor o igual que " + b);
		if (a >= b)
			System.out.println(a + " es mayor o igual que " + b);
		if (a != b)
			System.out.println(a + " No es lo mismo que " + b);
	}
}
