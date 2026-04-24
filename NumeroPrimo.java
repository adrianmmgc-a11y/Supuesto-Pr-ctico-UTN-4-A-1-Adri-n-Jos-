package ofuscado;

import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int numero1, numero2;
		boolean esPrimo;
		numero1 = introducirNumero(t);
		System.out.print("Introduzca segundo numero: ");
		numero2 = t.nextInt();
		int mayor, menor;
		if (numero1 > numero2) {
			mayor = numero1;
			menor = numero2;
		} else {
			mayor = numero2;
			menor = numero1;
		}
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

	private static int introducirNumero(Scanner t) {
		int numero1;
		System.out.print("Introduzca primer numero: ");
		numero1 = t.nextInt();
		return numero1;
	}
}
