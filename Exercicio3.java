package main;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Exercicio 3
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		//Declaração das variáveis
		float salario, adicionalNoturno, horasExtras, descontos, novoSalario;
		
		//Entrada de dados
		System.out.println("Entre com o salário: ");
		salario = sc.nextFloat();
		
		System.out.println("Entre com o Adicional Noturno: ");
		adicionalNoturno = sc.nextFloat();
		
		System.out.println("Entre com as Horas Extras: ");
		horasExtras = sc.nextFloat();
		
		System.out.println("Entre com o Desconto: ");
		descontos = sc.nextFloat();
		
		novoSalario = (salario + adicionalNoturno + horasExtras) - descontos;
		
		System.out.println("O salário líquido é: " + novoSalario);
		 
		sc.close();
	}

}
