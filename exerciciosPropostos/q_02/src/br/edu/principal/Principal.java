package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, medArit ;
		System.out.println("Olá, digite sua 1° nota ");
		nota1 = sc.nextDouble();
		System.out.println("Digite sua 2°");
		nota2 = sc.nextDouble();
		
		medArit = (nota1 + nota2)/2;
		
		if(medArit >= 0 & medArit <= 4){
			System.out.println("voce tirou: " + medArit + " E está Reprovado");
		}else if(medArit >= 4 & medArit <= 7) {
			System.out.println("voce tirou: " + medArit + "E vai ter que fazer o Exame");
		}else if(medArit >= 7 & medArit <= 10) {
			System.out.println("voce tirou: " +medArit + " E está Aprovado");
		}
		
		

	}

}
