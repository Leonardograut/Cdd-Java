package matrizes;

import java.util.Scanner;

public class exer01 {

	

	public static void main(String[] args) {
		
		int[][] Mat_Num = new int[3][3];
		int lin, col,soma=0;
		
		Scanner sc = new Scanner(System.in);
		
		for (lin  = 0;lin<=2; lin++) {
			for (col = 0; col<=2; col++) {
				System.out.print("Qual o elemento [" + (lin + 1) + "," + (col + 1) + "]? ");
				Mat_Num[lin][col] = sc.nextInt();
				
				if (lin == col) {
					soma +=Mat_Num[lin][col];
				}
				
			
			}
			
		}
		System.out.println("A soma da diagonal principal e "+ soma);
	}

}
