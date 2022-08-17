package exercicios;

import java.util.Scanner;

public class exer09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite sua altura(em metros): ");
		float h = (float) Float.parseFloat(entrada.nextLine());
		System.out.print("Digite sua Peso: ");
		float peso = (float) Float.parseFloat(entrada.nextLine());
		System.out.print("Digite seu sexo('M','F', maiúsculo): ");
		String s = entrada.nextLine();
		switch (s) {
		case "M":
			float ideal = (float) ((72.7 * h) - 58);
			System.out.println(
					"Sua Altura " + h + "metros, Peso " + peso + ", sexo " + s + "\nSeu peso ideal é: " + ideal + "Kg");
			if (peso > ideal) {
				System.out.println("Você está " + (peso - ideal) + "Kg cima do peso ideal");
			} else if (peso < ideal) {
				System.out.println("Você está " + (ideal - peso) + "Kg abaixo do peso ideal");
			} else {
				System.out.println("Você está no peso ideal");
			}

			entrada.close();
			break;
		case "F":
			ideal = (float) ((62.1 * h) - 44.7);
			System.out.println(
					"Sua Altura " + h + "metros, Peso " + peso + ", sexo " + s + "\nSeu peso ideal é: " + ideal + "Kg");
			if (peso > ideal) {
				System.out.println("Você está " + (peso - ideal) + "Kg cima do peso ideal");
			} else if (peso < ideal) {
				System.out.println("Você está " + (ideal - peso) + "Kg abaixo do peso ideal");
			} else {
				System.out.println("Você está no peso ideal");
			}

			break;
		}
		entrada.close();
	}
}
