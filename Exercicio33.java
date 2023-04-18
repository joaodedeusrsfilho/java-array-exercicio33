package aula19_Arrays;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima
		 * cada elemento do vetor A e uma mensagem indicando se o respectivo elemento é
		 * um número primo ou não. o conceito de numero primo é: um numero que é
		 * divisivel por 1 ou por ele mesmo.
		 */
		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[10];

		boolean numeroPrimo = true;
		String mensagem = "";

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao " + (i + 1));
			vetorA[i] = ler.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			numeroPrimo = true;
			for (int j = 2; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					numeroPrimo = false;
					break;
				}
			}
			if (numeroPrimo) {
				mensagem = "E PRIMO";
			} else {
				mensagem = "NAO E PRIMO";
			}
			System.out.println("O numero: " + vetorA[i] + " " + mensagem);
		}
	}
}
