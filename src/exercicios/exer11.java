package com.listas.ListasPOO.lista02;

import java.util.Scanner;

public class exer11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite que turno estudas(M - matutino, V - vespertino, N - noturno): ");
		String turno = entrada.nextLine();
		
		switch (turno) {
		case "M":
			System.out.println("Bom dia");
			break;
		case "V":
			System.out.println("boa Tarde");
			break;
		case "N":
			System.out.println("Boa noite");
			break;
		default:
			System.out.println("digitou errado");
		}
		
		entrada.close();
	}
}
