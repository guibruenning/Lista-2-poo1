package com.listas.ListasPOO.lista02;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("digite um ano: ");
		int n1 = Integer.parseInt(entrada.nextLine());

		if (n1 % 100 != 0 && (n1 % 4 == 0 || n1 % 400 == 0))
			System.out.println(n1 + " é um ano bissexto");
		else
			System.out.println(n1 + " não é ano bissexto");

		entrada.close();

	}

}
