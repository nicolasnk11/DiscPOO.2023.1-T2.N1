package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//variaveis
		 byte codigo, precU = 0;
		    int qtd, precNota = 0;
		    double precF = 0;
		    
		    //importados
		    Scanner sc = new Scanner(System.in);
		    DecimalFormat df = new DecimalFormat("#.00");
		    
		    // parte 1 do codigo
		    System.out.println("Digite o código do produto");
		    System.out.println(" ___________________________");
		    System.out.println("|     tabela de codigos     |");
		    System.out.println("|   1 a 10   ->   R$ 10,00  |");
		    System.out.println("|   11 a 20  ->   R$ 15,00  |");
		    System.out.println("|   21 a 30  ->   R$ 20,00  |");
		    System.out.println("|   31 a 40  ->   R$ 30,00  |");
		    System.out.println("|___________________________|");
		    codigo = sc.nextByte();
		  
		    if ((codigo >= 1) & (codigo <=10)){
		      precU = 10;
		      System.out.println("O preço do produto é de R$10.00");
		    }if ((codigo >= 11) & (codigo <=20)){
		      precU = 15;
		      System.out.println("O preço do produto é de R$15.00");
		    }if ((codigo >= 21) & (codigo <=30)){
		    	precU = 20;
		      System.out.println("O preço do produto é de R$20.00");
		    }if ((codigo >= 31) & (codigo <=40)){
		    	precU = 30;
		      System.out.println("O preço do produto é de R$30.00");
		    }if ((codigo < 1) | (codigo > 40)){
		      System.out.println("Código Inválido.");
		    }
		    
		    // parte 2 do codigo
		    if ((codigo >= 1) & (codigo <= 40)){
		     System.out.println("\nInsira quantos produtos foram comprados");
		     qtd = sc.nextInt();
		     precNota = qtd * precU;
		     System.out.println("O preço total é de R$" + df.format(precNota));
		    
		    
		     if (precNota <= 250){
		      precF = precNota * 0.95;
		     }
		     if ((precNota > 250) & (precNota < 500)){
		      precF = precNota * 0.9;
		     }
		     if (precNota >= 500){
		      precF = precNota * 0.85;
		     }
		    
		     System.out.println("\nHouve " + (100 * (precNota - precF)/precNota) + "% de desconto, que gerou um desconto de R$ " + df.format((precNota - precF)) + ". O novo valor é de R$ " + df.format(precF) + ".");
		    }
		    
		    
		   }
		 }

