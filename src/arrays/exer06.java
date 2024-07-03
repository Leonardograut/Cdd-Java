package arrays;

import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
		
		
		//escreva um codigo que receba uma nota de  5 alunos,
		//guarde todas num array notas e depois calcule a media  da turma
		
		double media;
		int[] notas = new int[5];
		int sum =0;
		
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite as notas dos alunos ");
			notas[i] = sc.nextInt();
			sum = sum + notas[i];
      
		}
		
         media = sum /5;

        
        System.out.println("A média da turma é: " + media);

	
       sc.close();

	}

}
