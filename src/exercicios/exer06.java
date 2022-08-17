package com.listas.ListasPOO.lista02;

import java.util.Scanner;

public class exer06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("digite um número: ");
		int n1 = Integer.parseInt(entrada.nextLine());

		if (n1 % 2 == 0) {
			System.out.println(n1 - 1);
		} else {
			System.out.println(n1 + 1);
		}

		entrada.close();
	}
}
