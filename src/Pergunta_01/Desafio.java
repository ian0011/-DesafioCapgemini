package Pergunta_01;

import java.util.ArrayList;
import java.util.Scanner;

//Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
//A base e altura da escada devem ser iguais ao valor de n.
//A última linha não deve conter nenhum espaço.

public class Desafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> escada = new ArrayList<>();

		System.out.print("Digite a quantidade de degraus da escada: ");
		int degraus = entrada.nextInt();

		//Adiciona os degraus da escada
		for (int i = 0; i < degraus; i++) {
			escada.add(" ".repeat(degraus - i) + "*".repeat(i + 1));
		}

		//Exibe a escada completa
		for (String d : escada ) {
			System.out.println(d);
		}
		
		entrada.close();
	}
}
