package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//variaveis
		double salario, SalAtt = 0;
		String nome = "";
	    
	    Scanner sc = new Scanner(System.in);
	    DecimalFormat DecF = new DecimalFormat("#.00"); 
	    
	    System.out.print("Por favor, digite seu nome: ");
	    nome = sc.nextLine();
	    System.out.print("Digite o valor do seu salário: \nR$ ");
	    salario = sc.nextDouble();
	    
	    if ((salario < 500) & (salario > 0)){
	     SalAtt = salario * 1.3;
	      System.out.println("ola sr. "+ nome + ". Seu aumento foi verificado e concedido, Seu novo salario é de: " + DecF.format(SalAtt));
	    }
	    if (salario >= 500){
	      System.out.println("ola sr. " + nome + ". Nós verificamos e você não tem direito ao aumento");
	    }
	    if (salario <= 0){
	      System.out.println("Valor Inválido. Digite novamente.");

	    }
	}
}
