package desafios;
import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		
		
		 int c1, c2, c3, c4, c5;
	        int respostas = 0;

	        Scanner sc = new Scanner(System.in);

	        System.out.println("----- Menu da Morte ------");

	        System.out.println("Telefonou para a vítima? sim [1] não [2]");
	        c1 = sc.nextInt();
	        if (c1 == 1) respostas++;

	        System.out.println("Esteve no local do crime? sim [1] não [2]");
	        c2 = sc.nextInt();
	        if (c2 == 1) respostas++;

	        System.out.println("Mora perto da vítima? sim [1] não [2]");
	        c3 = sc.nextInt();
	        if (c3 == 1) respostas++;

	        System.out.println("Devia para a vítima? sim [1] não [2]");
	        c4 = sc.nextInt();
	        if (c4 == 1) respostas++;

	        System.out.println("Já trabalhou com a vítima? sim [1] não [2]");
	        c5 = sc.nextInt();
	        if (c5 == 1) respostas++;

	        System.out.println("--------------------");

	       
	        String classificacao;
	        if (respostas == 2) {
	            classificacao = "Suspeita";
	        } else if (respostas >= 3 && respostas <= 4) {
	            classificacao = "Cúmplice";
	        } else if (respostas == 5) {
	            classificacao = "Assassino";
	        } else {
	            classificacao = "Inocente";
	        }

	    
	        System.out.println("Classificação: " + classificacao);

	        sc.close();
	    }

}
