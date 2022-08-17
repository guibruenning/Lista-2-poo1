package exercicios;

import java.util.Scanner;

public class exer10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n1 = Integer.parseInt(entrada.nextLine());
		System.out.print("Digite um número: ");
		int n2 = Integer.parseInt(entrada.nextLine());
		System.out.print("Digite um número: ");
		int n3 = Integer.parseInt(entrada.nextLine());

		if (n1 >= n2 && n2 >= n3) {
			System.out.println(n1 + " maoir " + n3 + " menor");
		} else if (n1 >= n3 && n3 >= n2) {
			System.out.println(n1 + " maoir " + n2 + " menor");
		} else if (n2 >= n1 && n1 >= n3) {
			System.out.println(n2 + " maoir " + n3 + " menor");
		} else if (n2 >= n3 && n3 >= n1) {
			System.out.println(n2 + " maoir " + n1 + " menor");
		} else if (n3 >= n1 && n1 >= n2) {
			System.out.println(n3 + " maoir " + n2 + " menor");
		} else {
			System.out.println(n3 + " maoir " + n1 + " menor");
		}
		entrada.close();
	}
}
