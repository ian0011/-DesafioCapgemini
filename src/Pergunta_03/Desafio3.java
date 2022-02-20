package Pergunta_03;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Desafio3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma palavra:\n");

		
		String sentrada = entrada.nextLine();

		
		HashMap<String, Integer> map = new HashMap<>();

		
		for (int i = 0; i < sentrada.length(); i++) {
			
			for (int j = i; j < sentrada.length(); j++) {
				char[] valC = sentrada.substring(i, j + 1).toCharArray();
				Arrays.sort(valC);
				String val = new String(valC);
				if (map.containsKey(val))
					map.put(val, map.get(val) + 1);
				else
					map.put(val, 1);
			}
		}

		
		int cont_Anagramas = 0;
		for (String key : map.keySet()) {
			int n = map.get(key);
			cont_Anagramas += (n * (n - 1)) / 2;
		}
		System.out.println("Existem " + cont_Anagramas + " anagramas na palavra " + sentrada + ".");
	}
}