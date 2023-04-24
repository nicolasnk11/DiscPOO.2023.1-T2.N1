package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double num1, num2, soma, raiz;
		int op;
		
		System.out.println("Menu: ");
		System.out.println("1 - Somar dois números");
		System.out.println("2 - raiz quadrada de um número");
		System.out.println("Digite uma das opções acima: ");
		op = sc.nextInt();
		if(op == 1) {
			System.out.println("Digite o valor do primeiro número: ");
			num1 = sc.nextDouble();
			System.out.println("Digite o valor do segundo número: ");
			num2 = sc.nextDouble();
			soma = num1+num2;
			System.out.println("A soma dos números é: "+soma);
		}
		else if (op == 2) {
			System.out.println("Digite um valor: ");
			num1 = sc.nextDouble();
			raiz = Math. sqrt(num1);
			System.out.println("A raiz do número digitado é: "+raiz);
		}
		else if(op != 1 || op != 2) {
			System.out.println("Opção Inválida");
		}
	}
}