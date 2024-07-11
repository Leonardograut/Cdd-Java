package metodos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		
		CalcularMetodos sc = new CalcularMetodos();
		
		int somar2parametros = sc.somar(2, 2);
		int somar3parametros = sc.somar(4, 5, 9);
		
		System.out.println("Resultado com 2 parametros " + somar2parametros);
		System.out.println("Resultado com 3 parametros " + somar3parametros);
		
		

       
		
		
		
	}

}
