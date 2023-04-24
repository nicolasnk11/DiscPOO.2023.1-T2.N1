package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	double num1,num2;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o 1° número: ");
	num1 = sc.nextDouble();
	System.out.println("Digite o 2° número: ");
	num2 = sc.nextDouble();
	
	if (num1 > num2) {
	    System.out.println("O maior número é: " + num1);
    } else if (num1 < num2) {
    	System.out.println("O maior número é: " + num2);
    } else if (num1 == num2) {
    	System.out.println("Os números são iguais");
    }

	}

}