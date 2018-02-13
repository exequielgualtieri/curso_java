package com.mipaquete;


public class EjemplosFunciones {

	public static void main(String[] args) {
		System.out.println("V3 - Programa Cine");
		
		// Variables...
		int x = 8;
		int y = 10;
		int cuadrado = 5;
		int cubo = 5;
		int Tubo = 5;
		int resultadoSuma = sumarNumeros(x, y);
		int resultadoResta = restarNumeros(x, y);
		int Cuadrado = cuadrado(cuadrado);
		int Cubo = cubo(cubo);
		//Cuadrado y cuadrado, no son lo mismo.
		
		System.out.println("ResultadoSuma= " + resultadoSuma);
		System.out.println("ResultadoResta = " + resultadoResta);
		System.out.println("Resultado de: ("+ cuadrado +") al cuadrado es: [" + Cuadrado +"]");
		System.out.println("Resultado de: ("+ cubo + ") al cubo es: [" + Cubo + "]" );
		System.out.println("Resultado de MatchPow: al cubo es: [" + Tubo(5)+ "]" );
		}
		public static int sumarNumeros(int valor_1, int valor_2) {
			return valor_1 + valor_2;
		
		}
		public static int restarNumeros(int valor_1, int valor_2) {
			return valor_1 - valor_2;
			
		}
		public static int cuadrado(int valor_1) {
			return valor_1 * valor_1;
		}
		public static int cubo(int valor_1) {
			return valor_1 * valor_1 * valor_1;
		}
		public static double Tubo (int parametro) {
			double result = Math.pow (parametro, 3);
			return result; 
		}
}
