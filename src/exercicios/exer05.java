package com.listas.ListasPOO.lista02;

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("digite um caracter(minúscula): ");
		String vogal = entrada.nextLine();

		if (vogal.equals("a") || vogal.equals("e") || vogal.equals("i") || vogal.equals("o") || vogal.equals("u")) {
			System.out.println(vogal + " é uma vogal");
		} else {
			System.out.println(vogal + " é uma consoante");
		}

		entrada.close();
	}

}
