package Pergunta_02;
import java.util.Scanner;

public class Desafio2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String senha;
			
		System.out.println("Digite uma nova senha: ");
		senha = entrada.next();
			
		if(senha.length() <=5) {
			System.out.println(6 - senha.length());
			}
			else {
				System.out.println("Senha segura!");
			}
			
			entrada.close();
		}
	}



