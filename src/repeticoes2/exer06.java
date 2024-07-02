package repeticoes2;

import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
		
		//escreva um programa que solicite a quantidade de 
		//aluinos de uma sala  e depois solicite uma nota para cada aluno, imprimindo no final a media da  sala
		
		double soma = 0;
	    double num = 0;
	    double media = 0;

	    int alunos = 0;

	    Scanner sc = new Scanner(System.in);

	    System.out.println(" Quantos alunos tem na sala? ");
	    alunos = sc.nextInt();
	    int qtd = alunos;

	    
	    for (int i = 0; i < qtd; i++) {
	        System.out.println(" Digite a nota do aluno " + (i + 1) + ": ");
	        num = sc.nextDouble();
	        soma = soma + num;
	    }

	    media = soma / qtd;
	    System.out.println(" A média entre os alunos é: " + media);

	}

	}


