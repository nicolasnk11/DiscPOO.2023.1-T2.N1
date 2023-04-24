package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Digite um numero abaixo:");
		num1 = sc.nextDouble();
		System.out.println("Digite outro numero:");
		num2 = sc.nextDouble();
		
		if(num1 < num2){
			System.out.println("entre "+ num1 + " e " + num2 + ", o numero " + num1 + " é menor");
		}else {
			System.out.println("entre "+ num1 + " e " + num2 + ", o numero " + num2 + " é menor");
		}
		

	}

}
