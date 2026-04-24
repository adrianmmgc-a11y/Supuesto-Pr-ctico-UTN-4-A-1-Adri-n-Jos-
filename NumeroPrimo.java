package ofuscado;

import java.util.Scanner;

/**
 * Numero Primo.
 * 
 * @author Adrián José Martínez Medina
 * @version 1.0
 */

public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int numero1, numero2;
		numero1 = introducirNumero(t);
		numero2 = introducirNumero(t);
		int mayor = 0, menor = 0;
		calcularMayor(numero1, numero2);
		calcularMenor(numero1, numero2);
		esPrimo(mayor, menor);
	}
	
	/**
	 * Metodo para mostrar primo.
	 */

	private static void esPrimo(int mayor, int menor) {
		boolean esPrimo;
		for (int i = menor; i <= mayor; i++) {
			esPrimo = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					esPrimo = false;
				}
			}
			if (esPrimo) {
				System.out.println(i + " ");
			}
		}
	}
	
	/**
	 * Metodo para introducir numero.
	 */

	private static int introducirNumero(Scanner t) {
		int numero1;
		System.out.print("Introduzca primer numero: ");
		numero1 = t.nextInt();
		return numero1;
	}
	
	/**
	 * Metodo para calcular el numero mayor.
	 */
	
	private static int calcularMayor(int numero1, int numero2) {
		int mayor, menor;
		if (numero1 > numero2) {
			mayor = numero1;
		} else {
			mayor = numero2;
		}
		return mayor;
	}
	
	/**
	 * Metodo para calcular el numero menor.
	 */
	
	private static int calcularMenor(int numero1, int numero2) {
		int menor;
		if (numero1 > numero2) {
			menor = numero2;
		} else {
			menor = numero1;
		}
		return menor;
	}
}
