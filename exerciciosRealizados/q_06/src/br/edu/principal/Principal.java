package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

	double num1 = 0,r;
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o número desejado: ");
	num1 = sc.nextDouble();
	r = (num1/2);
	
	if(num1 % 2 == 0){
		System.out.println("É par !");
		}

		else{
		System.out.println("É impar!");}
		}
		
	
	
	
	}
