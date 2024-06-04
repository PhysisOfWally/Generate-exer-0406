package main;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//Exercicio 1
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		//Declaração das variáveis
		float salario, abono, novoSalario;
		
		//Entrada de dados
		System.out.println("Entre com o salário: ");
		salario = sc.nextFloat();
		
		System.out.println("Entre com o abono: ");
		abono = sc.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("O novo salário é: %.2f", novoSalario);
		 
		sc.close();
	}
}	
