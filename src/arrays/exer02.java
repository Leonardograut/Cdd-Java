package arrays;

import java.util.Scanner;

/*Escreva um código que 
receba uma nota de 5 alunos, 
guarde todas  num array notas.
 Depois calcule a média da turma. 
 */

public class exer02 {

	public static void main(String[] args) {
		int[] notas = new int[5];
		double soma =0;

		double media;

		Scanner sc = new Scanner(System.in);


		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota  do aluno");
			notas[i] = sc.nextInt();
			soma = soma + notas[i];

		}		 
		media = soma /notas.length;

		System.out.println("A media entre os alunos e "+ media);



		sc.close();
	}


}
