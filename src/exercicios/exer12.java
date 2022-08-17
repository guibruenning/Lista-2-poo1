package exercicios;

import java.util.Scanner;

public class exer12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Salário atual: ");
		float sala = (float) (Float.parseFloat(entrada.nextLine()));
		
		float aumentos = 0f;
		
		System.out.println("Salário anterior");
		
		if(sala<= 280) {
			System.out.println("Aumento de 20%");
			aumentos =(float) (sala*0.20);
		}
		else if(sala>280 && sala>=700) {
			System.out.println("Aumento de 15%");
			aumentos = (float) (sala*0.15);
		}
		else if(sala>700 && sala<=1500) {
			System.out.println("Aumento de 10%");
			aumentos = (float) (sala*0.10);
		}
		else {
			System.out.println("Aumento de 5%");
			aumentos = (float) (sala*0.05);
		}
		
		System.out.println("Valor aumentado "+aumentos+
						   "\nSalário após o aumento "+(sala+aumentos));
		entrada.close();
	}
}
