package arrays;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
			
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int[] d = new int[10];
		int[] e = new int[10];
		
		
		Scanner sc = new Scanner(System.in);

		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite os numeros de a");
			 a[i] = sc.nextInt();
			
			
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("Digite os numeros de b");
			 b[i] = sc.nextInt();
			
			
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println("Digite os numeros de c");
			 c[i] = sc.nextInt();
			
			
		}
		for (int i = 0; i < d.length; i++) {
			System.out.println("Digite os numeros de d");
			 d[i] = sc.nextInt();
			
			
		}
		
		for (int i = 0; i < e.length; i++) {
			System.out.println("Digite os numeros de e");
			 e[i] = sc.nextInt();
			
			
		}
		
	
		
		System.out.print("Elementos no array da posicao a : ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " "); 
			
				
		}
		
		System.out.print("Elementos no array da posicao b : ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i] + " "); 
			
				
		}
		System.out.print("Elementos no array da posicao c : ");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i] + " "); 
			
				
		}
		
		System.out.print("Elementos no array da posicao d : ");
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i] + " "); 
			
				
		}
		
		System.out.print("Elementos no array da posicao e : ");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i] + " "); 
			
				
		}
		
		
		sc.close();

	}

}
