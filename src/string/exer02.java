package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class exer02 {

	public static void main(String[] args) {
		/* Faça um programa que, a partir de um texto 
           digitado pelo usuário, conte o número de  
           palavras (palavra é definida por qualquer 
           sequência de caracteres delimitada por espaços em branco) e exiba o resultado.*/
		
		   
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um texto");
		String texto = sc.nextLine();
		
		
		
		StringTokenizer result = new StringTokenizer(texto);
		
		System.out.println(result.countTokens());

		
		sc.close();
	}

}
