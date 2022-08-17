package com.listas.ListasPOO.lista02;

import java.util.Scanner;

public class exer01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n1 = Integer.parseInt(entrada.nextLine());
		System.out.print("Digite um número: ");
		int n2 = Integer.parseInt(entrada.nextLine());

		if (n1 > n2) {
			System.out.println(n1 + " é maior que " + n2);
		} else {
			System.out.println(n2 + " é maior que " + n1);
		}

		entrada.close();

	}

}
