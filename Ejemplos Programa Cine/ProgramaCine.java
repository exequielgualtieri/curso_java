/*
Fichero: ProgramaCine.Java
Autor: Gustavo Exequiel Gualtieri
Programa que nos ayuda a saber si podemos ir al Cine o No.
*/

//INICIO DE LA CLASE
public class ProgramaCine {
	//Método Principal, que se llama al arrancar el programa.
  public static void main (String[] args){
	  //Instrucciones de salida por consola
	  
	int precioEntrada = 9;
	int nuestroCapital = 5;
	boolean varSiIrAlCine = false; // Lógica de la desición
	String titulo = "Torrente 8"; // Asignamos el valor al titulo de una variable de texto.
	
	System.out.println ("");
  	System.out.println("***********************");
	System.out.println("*_PODEMOS IR AL CINE?_*");
	System.out.println("***********************");

	// Imprimimos el titulo
	System.out.println ("");
	// Un salto de línea.
	System.out.println ("Titulo: " + titulo); 
	
	System.out.println ("");
	System.out.println ("Precio de la Pelicula: " + precioEntrada);
	// Lógica de la desición
	if (nuestroCapital > precioEntrada) 
		varSiIrAlCine = true;
	 else {
		varSiIrAlCine = false;
	}
	if (varSiIrAlCine == true) {
		System.out.println ("");
		System.out.println ("SI Podriamos ir al CINE");
		nuestroCapital = nuestroCapital - precioEntrada;
	} else {
		System.out.println ("");
		System.out.println ("NO Podriamos ir al CINE");
	}
	System.out.println ("Capital final: " + nuestroCapital);
  }
}
