package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ValorFab = new Scanner(System.in);
		double precFab,dist,imposto,valorFinal;
		
		System.out.println("Custo de fábrica --> Custo ao consumidor");
		System.out.println("Digite o valor de fábrica do veículo");
		
		precFab = ValorFab.nextDouble();
		
		if (precFab <= 12000) {
			dist = precFab * 0.05;
			valorFinal = precFab + dist;
			System.out.println("O preço final do veículo será de " + valorFinal);
			
		}else if (12000 < precFab & precFab <= 25000) {
			dist = precFab * 0.10;
			imposto = precFab * 0.15;
			valorFinal = precFab + dist;
			System.out.println("O preço final do veículo será de " + valorFinal);
			
		}else if (precFab > 25000) {
			dist = precFab * 0.15;
			imposto = precFab * 0.20;
			valorFinal = precFab + dist;
			System.out.println("O preço final do veículo será de " + valorFinal);
		}

	}

}
