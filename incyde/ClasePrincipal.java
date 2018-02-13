package com.incyde;

import java.util.Scanner;

public class ClasePrincipal {
	// VARIABLES 
	static float capital;
	static float precio = 7.5f;
	static float horaPuedo, hora1 = 19, hora2 = 21, hora3 = 16, horaR;
	static String diaP, dia1 = "Lunes", dia2 = "Martes", dia3 = "Domingo";
	static String vsi;
	static String wsi;
	static String xsi;
	static Scanner teclado;
	
	public static void main(String[] args) {

		boolean resultadoCine;
		String siContinuar;
		System.out.println("Programa Cine V4");
		
		do {
			pedirDatos();
			resultadoCine = comprobarSiVamosAlCine();
			mostrarResultado(resultadoCine);
			System.out.println("¿Desea Continuar? (S/N)");
			teclado.nextLine();
			siContinuar = teclado.nextLine();
		} while (siContinuar.equals("s")|| siContinuar.equals("S"));
		
		teclado.close();
		System.out.println("Fin del programa.");
	}

	public static void pedirDatos() {

		System.out.println("Introduzca capital");
		teclado = new Scanner(System.in);
		capital = teclado.nextFloat();
		System.out.println("Introduzca hora, (se recomienda de 19Hs a 21Hs)");
		horaPuedo = teclado.nextFloat();
		System.out.println("Introduzca día, de Lunes a Domingo");
		teclado.nextLine();
		diaP = teclado.nextLine();
		System.out.println("¿Tienes acompañante?");
		vsi = teclado.nextLine();
		System.out.println("¿Se dispone de medio de transporte?");
		wsi = teclado.nextLine();
		System.out.println("¿Kinepolis, Cinesa, o Yelmocines?");
		xsi = teclado.nextLine();


		return;

	}

	public static boolean comprobarSiVamosAlCine() {
		if ((capital >= precio) && ((horaPuedo >= hora1 && horaPuedo <= hora2) && (horaPuedo == hora3))
				&& (diaP.equals(dia1) || diaP.equals(dia2) || diaP.equals(dia3))
				&& (vsi.equals("SI") || vsi.equals("si") || vsi.equals("Si"))
				&& (wsi.equals("SI") || wsi.equals("si") || wsi.equals("Si"))
				&& (xsi.equals("Kinepolis") || xsi.equals("Cinesa") || xsi.equals("Yelmocines"))) {
			return true;
		} else {
			return false;
		}
	}

	public static void mostrarResultado(boolean resultado) {
		if (resultado == true) {
			//RESPUESTA POSITIVA
			System.out.println("Si puedes ir al Cine");
		} else {
			//RESPUESTAS NEGATIVA
			System.out.print("No puedes ir al Cine");
			if (!(capital >= precio)) {
				System.out.print("por que se dispone de dinero suficiente.");
			}
			if (!(diaP.equals(dia1) || diaP.equals(dia2) || diaP.equals(dia3))) {
				System.out.print("por que la pelicula solo está ");
			}
			if (!(horaPuedo >= hora1 && horaPuedo <= hora2)) {
				System.out.print(",por que la hora disponible es de 19hs a 21hs ");
			}
			if (!(vsi.equals("SI") || vsi.equals("si") || vsi.equals("Si"))) {
				System.out.print(",por que no existe acompañante y no puedes ir solo ");
			}
			if (!(wsi.equals("SI") || wsi.equals("si") || wsi.equals("Si"))) {
				System.out.print(",por que no se dispone de medio de transporte ");
			}
			if (!(xsi.equals("Kinepolis") || xsi.equals("Cinesa") || xsi.equals("Yelmocines"))) {
				System.out.print(",por que la película no está disponible en: " + xsi);
			}
		}
	}
}
