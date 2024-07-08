package string;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		
		/*Faça um programa que receba de um 
          usuário, um texto e exiba esse texto em letras 
          maiúsculas.*/

		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um texto");
		String texto = sc.nextLine();
		
		
		System.out.println(texto.toUpperCase());
		
		
		sc.close();
	}

}
