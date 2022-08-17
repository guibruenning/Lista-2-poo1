package com.listas.ListasPOO.lista02;

import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("digite um número: ");
		int n1 = Integer.parseInt(entrada.nextLine());

		if (n1 > 0) {
			System.out.println(n1 + " Positivo");
		} else if (n1 < 0) {
			System.out.println(n1 + " Negativo");
		} else {
			System.out.println(n1 + " = 0");
		}

		entrada.close();

	}

}
