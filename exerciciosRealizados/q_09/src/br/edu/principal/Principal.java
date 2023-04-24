package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		double nota_trab, aval, examf, media;
		
		System.out.println("Digite a nota do trabalho em laboratório: ");
		nota_trab = sc.nextDouble();
		
		System.out.println("Digite a nota da avaliação: ");
		aval = sc.nextDouble();
		
		System.out.println("Digite a nota do exame final: ");
		examf = sc.nextDouble();
		media = (nota_trab*2 + aval*3 + examf*5)/10;
		
		System.out.println("Sua media ponderada é: "+media);
		if(media >= 8 && media <= 10) {
			System.out.println("Você obteve conceito A");
		}
		else if(media >= 7 && media <= 8) {
			System.out.println("Você obteve conceito B");
		}
		else if(media >= 6 && media <= 7) {
			System.out.println("Você obteve conceito C");
		}
		else if(media >= 5 && media <= 6) {
			System.out.println("Você obteve conceito D");
		}
		else if(media >= 0 && media <= 5) {
			System.out.println("Você obteve conceito E");
		}
	}
}
