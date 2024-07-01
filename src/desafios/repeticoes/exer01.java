package repeticoes;

import java.util.Scanner;

public class exer01 {

	public static void main(String[] args) {
		
		double soma =0;
		double num = 0;
		double media = 0;
		
		int alunos  =0;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println(" Quantos  alunos tem na sala");
		alunos = sc.nextInt();
		int qtd = alunos;
		
		while( alunos>0) {
			
			System.out.println(" Digite as notas dos aluno ");
			num = sc.nextDouble();
			soma = soma + num;
			alunos --;
			

		}
		media = soma /qtd;
		System.out.println(" a media  entre os  alunos " + media);
		
	}

}
