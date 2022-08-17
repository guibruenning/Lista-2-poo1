package com.listas.ListasPOO.lista02;

import java.util.Scanner;

public class exer13 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);


		System.out.print("Informe quanto você recebe por hora trabalhado: ");
		float valor = Float.parseFloat(entrada.nextLine());

		System.out.print("Informe quantas horas você trabalhou neste mês: ");
		float horas = Float.parseFloat(entrada.nextLine());
		float ir =0f;
		float sala = horas * valor;
		
		System.out.println("O seu salário bruto será: R$" + sala + " no respectivo mês.");
		if(sala<=900) {
			ir = 0;
			System.out.println("IR(Iseto) = "+ ir);
		}
		else if(sala<=1500) {
			ir = (float)(sala*0.05);
			System.out.println("IR(5%) = "+ ir);
		}
		else if(sala<=2500){
			ir = (float)(sala*0.10);
			System.out.println("IR(10%) = "+ ir);
		}
		else {
			ir = (float)(sala*0.20);
			System.out.println("IR(20%) = "+ ir);
		}
		
		float inss = (float) (sala*0.10);	
		float liquido = ((sala - ir) - inss);

		System.out.println("Desconto INSS: R$"+inss);
		System.out.println("FGTS "+sala*0.11);
		System.out.println("Total desconto "+ (ir + inss));
		System.out.println("O salário liquido será: R$"+liquido);
		
		entrada.close();
	}
}
