package exercicios;

import java.util.Scanner;

public class exer07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("digite um número: ");
		int n1 = Integer.parseInt(entrada.nextLine());
		System.out.print("digite um número: ");
		int n2 = Integer.parseInt(entrada.nextLine());
		System.out.print("digite um número: ");
		int n3 = Integer.parseInt(entrada.nextLine());

		System.out.println("ordem crescente");
		if (n1 >= n2 && n2 >= n3) {
			System.out.println("1º" + n1 + " | 2º" + n2 + " | 3º" + n3);
		} else if (n1 >= n3 && n3 >= n2) {
			System.out.println("1º" + n1 + " | 2º" + n3 + " | 3º" + n2);
		} else if (n2 >= n1 && n1 >= n3) {
			System.out.println("1º" + n2 + " | 2º" + n1 + " | 3º" + n3);
		} else if (n2 >= n3 && n3 >= n1) {
			System.out.println("1º" + n2 + " | 2º" + n3 + " | 3º" + n1);
		} else if (n3 >= n1 && n1 >= n2) {
			System.out.println("1º" + n3 + " | 2º" + n1 + " | 3º" + n2);
		} else {
			System.out.println("1º" + n3 + " | 2º" + n2 + " | 3º" + n1);
		}
		entrada.close();
	}
}
