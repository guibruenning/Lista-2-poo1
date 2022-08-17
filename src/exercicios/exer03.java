package exercicios;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("digite seu sexo(F ou M): ");
		String sexo = entrada.nextLine();

		switch (sexo) {
		case "F":
			System.out.println(sexo + " - Feminino");
			break;
		case "M":
			System.out.println(sexo + " - Masculino");
			break;
		default:
			System.out.println("Diitado errado");

		}

		entrada.close();

	}

}
