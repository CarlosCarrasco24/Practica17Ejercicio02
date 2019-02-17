package Practica17Ejercicio03;

import Utilidades.Entrada;

public class DevolverLetraDni {
	public static char letra(int num) {
		String array = "TRWAGMYFPDXBNJZSQVHLCKE";
		for (int i = 0; i < array.length(); i++)
			if (i == num % 23)
				return array.charAt(i);
		return 0;
	}

	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println("Escriba los numeros de su DNI");
			num = Entrada.entero();
		} while (num < 10000000 || num > 99999999);
		System.out.println("Dni: " + num + ", letra " + DevolverLetraDni.letra(num));
	}

}
