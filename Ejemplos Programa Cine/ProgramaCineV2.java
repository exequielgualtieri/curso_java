// Fichero: ProgramaCineV2.java

public class ProgramaCineV2{
	public static void main(String[] args){
		
		int numCompadres = 0;
		
	
		System.out.println("");
		System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*");
		System.out.println("+Version 2 Programa Cine+");
		System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+*");
		System.out.println("");

		System.out.println("");
		System.out.println("	METODO WHILE");
		System.out.println("");
		
		while (numCompadres <= 5) {
			
			System.out.println("Numero de Compadres: " + numCompadres);
			numCompadres = numCompadres + 1;
		}
		
		numCompadres = 0;

		System.out.println("");
		System.out.println("	METODO DO");
		System.out.println("");
		
		do {
			System.out.println("Numero de Compadres: " + numCompadres);
			numCompadres = numCompadres + 1;
		} while (numCompadres <= 5);
		
		
		numCompadres = 0;
		System.out.println("");
		System.out.println("	METODO FOR");
		System.out.println("");
		
		
		for (numCompadres =0; numCompadres <= 5; numCompadres ++){
			System.out.println("Numero de Compadres:" + numCompadres);			
		}
	}
}