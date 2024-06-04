package main;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//Exercicio 3
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		//Declaração das variáveis
		float n1, n2, n3, n4, dif;
		
		//Entrada de dados
		System.out.println("Entre com o produto 1: ");
		n1 = sc.nextFloat();
		
		System.out.println("Entre com o produto 2: ");
		n2 = sc.nextFloat();
		
		System.out.println("Entre com o produto 3: ");
		n3 = sc.nextFloat();
		
		System.out.println("Entre com o produto 4: ");
		n4 = sc.nextFloat();
		
		dif = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença: " + dif);
		
		sc.close();
	}

}
