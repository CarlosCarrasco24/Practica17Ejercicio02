package Practica17Ejercicio04;

import Utilidades.Entrada;

public class NumeroRomano {

	public static void main(String[] args) {
		int num = 0;
		int unidad=0;
		int decena=0;
		String cadena="";
		String cadena2="";
		do {
			System.out.println("Introduzca un numero para convertir a romano");
			num = Entrada.entero();
		}while (num < 0 || num > 100);
		if (num==0)
			System.out.println("El numero "+num+" en romano no existe");
		else 
			if (num==100)
				System.out.println("El numero "+num+" en romano es :"+"C");
		unidad=num%10;
		decena=num/10;
		switch (unidad) {
		case 1:
			cadena="I";
			break;
		case 2:
			cadena="II";
			break;
		case 3:
			cadena="III";
			break;
		case 4:
			cadena="IV";
			break;
		case 5:
			cadena="V";
			break;
		case 6:
			cadena="VI";
			break;
		case 7:
			cadena="VII";
			break;
		case 8:
			cadena="VIII";
			break;
		case 9:
			cadena="IX";
			break;
		}
		switch (decena) {
		case 1:
			cadena2="X";
			break;
		case 2:
			cadena2="XX";
			break;
		case 3:
			cadena2="XXX";
			break;
		case 4:
			cadena2="XL";
			break;
		case 5:
			cadena2="L";
			break;
		case 6:
			cadena2="LX";
			break;
		case 7:
			cadena2="LXX";
			break;
		case 8:
			cadena2="LXXX";
			break;
		case 9:
			cadena2="XC";
			break;
	}
		System.out.println("El "+num+" transformado en romano es :"+cadena2+cadena);

}
}
