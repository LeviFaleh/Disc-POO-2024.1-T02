package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		System.out.println("Digite o primeiro número:");
		num1 = sc.nextInt();
		System.out.println( "o segundo número: ");
		num2 = sc.nextInt();
		System.out.println( "o terceiro número: ");
		num3 = sc.nextInt();
		
		if (num1 < num2 && num1 < num3) {
			if(num2 < num3) {
			System.out.printf("A ordem crescente é: %d-%d-%d%n", num1, num2, num3 );
			}else {
				System.out.printf("A ordem crescente é: %d-%d-%d%n", num1, num3, num2 );
			}
		} if(num2 < num1 && num2 < num3) {
			if(num1 < num3) {
				System.out.printf("A ordem crescente é: %d-%d-%d%n", num2, num1, num3 );
			} else {
				System.out.printf("A ordem crescente é: %d-%d-%d%n", num2, num3, num1 );
			}
		} if(num3 < num1 && num3 < num2) {
			if(num1 < num2) {
				System.out.printf("A ordem crescente é: %d-%d-%d%n", num3, num1, num2 );
			} else {
				System.out.printf("A ordem crescente é: %d-%d-%d%n", num3, num2, num1 );
			}
	}

}}