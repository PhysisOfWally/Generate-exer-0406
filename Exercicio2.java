package main;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Exercicio 2
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		//declaração de variáveis
		float n1;
		float n2;
		float n3;
		float n4;
		float media;
		
		//captura de dados
		System.out.println("Digite nota 1: ");
		n1 = sc.nextFloat();
		
		System.out.println("Digite nota 2: ");
		n2 = sc.nextFloat();
		
		System.out.println("Digite nota 3: ");
		n3 = sc.nextFloat();
		
		System.out.println("Digite nota 4: ");
		n4 = sc.nextFloat();
		
		//parte lógica
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("media das notas: %.2f", media);
		
		 
		sc.close();
	}

}
