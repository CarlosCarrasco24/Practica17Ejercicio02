package Practica17Ejercicio02;

import Utilidades.Entrada;

public class TransformacionCadenas {
	public static String extraer(String cadena, int posicion) {
		String apoyo = "";
		for (int i = 0; i < posicion; i++)
			if (i != posicion)
				apoyo = apoyo + cadena.charAt(i);
		return apoyo;
	}

	public static String invertir(String cadena) {
		String apoyo = "";
		for (int i = cadena.length() - 1; i >= 0; i--)
			apoyo = apoyo + cadena.charAt(i);
		return apoyo;
	}

	public static void primera(String cadena, String cadena2) {
		cadena.replaceFirst(cadena2, "");
	}

	public static String eliminarCaracteres(int caracteres, int puesto, String cadena) {
		String apoyo = cadena.substring(0, puesto) + cadena.substring(puesto + caracteres, cadena.length());
		return apoyo;
	}

	public static String ingresoCaracteres(int pos, String ingreso, String cadena) {
		String apoyo = cadena.substring(0, pos) + ingreso + cadena.substring(pos + ingreso.length(), cadena.length());
		return apoyo;
	}

	public static void apariciones(String cadena, String buscar) {
		int contador = 0;
		for (int i = 0; i < cadena.length();) {
			if (cadena.regionMatches(true, i, buscar, 0, buscar.length())) {
				contador++;
				i += buscar.length();
			} else
				i++;
		}

		System.out.println("El numero de apariciones de " + buscar + " dentro de " + cadena + " es de " + contador);
	}
	public static String borrar(String cadena,String borrar) {
		return cadena.replaceAll(borrar, "");
	}
	public static void palindroma(String cadena) {
		String apoyo="";
		for(int i=cadena.length()-1;i>=0;i--) {
			apoyo+=cadena.charAt(i);
		}
		if(cadena.compareTo(apoyo)==0)
			System.out.println("Polindroma");
		
			else 
			System.out.println( "No polindroma");
			
	}
	public static void main(String[] args) {
		String cadena = "";
		String reemplazo="";
		String sustituir="";
		int posicion = 0;
		int pos = 0;
		int puesto = 0;
		String ingreso = "";
		String borrar = "";
		int caracteres = 0;
		String buscar = "";
		System.out.println("Introduzca la cadena");
		cadena = Entrada.cadena();
		do {
			System.out.println("Introduzca la posicion hasta la que quiere extraer");
			posicion = Entrada.entero();
		} while (posicion < 0 || posicion > cadena.length() - 1);
		cadena = cadena.trim();
		// A
		System.out.println("Posicion extraida desde el principio");
		System.out.println(TransformacionCadenas.extraer(cadena, posicion));
		// B
		System.out.println("Posicion extraida desde el final");
		System.out.println(cadena.substring(cadena.length() - posicion, cadena.length()));
		// E
		do {
			System.out.println("Introduzca cuantos caracteres quiere eliminar");
			caracteres = Entrada.entero();
		} while (caracteres < 0 || caracteres > cadena.length());
		do {
			System.out.println("Introduzca desde que puesto");
			puesto = Entrada.entero();
		} while (puesto < 0 || puesto > cadena.length());
		System.out.println(TransformacionCadenas.eliminarCaracteres(caracteres, puesto, cadena));
		// F
		System.out.println("Introduzca la cadena a borrar");
		String cadena2 = Entrada.cadena();
		TransformacionCadenas.primera(cadena, cadena2);
		// G
		System.out.println("introduzca la cadena a ingresar");
		ingreso = Entrada.cadena();
		do {
			System.out.println("Introduzca a partir de que posicion");
			pos = Entrada.entero();
		} while (pos < 0 || pos > cadena.length());
		System.out.println(TransformacionCadenas.ingresoCaracteres(pos, ingreso, cadena));
		// H
		System.out.println("Introduzca la cadena a buscar");
		buscar = Entrada.cadena();
		TransformacionCadenas.apariciones(cadena, buscar);
		// I
		System.out.println(cadena);
		System.out.println("Introduzca la cadena a borrar");
		borrar = Entrada.cadena();
		System.out.println(TransformacionCadenas.borrar(cadena, borrar));
		//J
		System.out.println(cadena);
		System.out.println("Introduzca la cadena que desea reemplazar");
		reemplazo=Entrada.cadena();
		System.out.println("Introduzca la cadena que desea insertar");
		sustituir=Entrada.cadena();
		System.out.println(cadena.replaceAll(reemplazo, sustituir));
		// K
		System.out.println(TransformacionCadenas.invertir(cadena));
		//L
		System.out.println(cadena);
		TransformacionCadenas.palindroma(cadena);

	}
}
