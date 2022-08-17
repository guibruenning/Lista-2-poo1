package com.listas.ListasPOO.lista02;

import java.util.Scanner;

public class exer08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        
        

        System.out.print("Digite a primeira nota:  ");
        float n1 = entrada.nextFloat();

        System.out.print("Digite a segunda nota:  ");
        float n2 = entrada.nextFloat();

        float media = (n1 + n2) / 2;

        if(media >= 7 ) { 
            System.out.println("Aprovado");

        }else { 
                System.out.println("Reprovado");
        }
        entrada.close();
	}
}
