package metodos;



public class Calculadora {

	public static void main(String[] args) {
		
		
		CalcularMetodos sc = new CalcularMetodos();
		
		int somar2parametros = sc.somar(2, 2);
		int somar3parametros = sc.somar(4, 5, 9);
		
		
		double dividir3parametros = sc.dividir(1, 20, 30);
		double dividir2parametros =  sc.dividir(54, 45);
		
		int multiplicar3parametros = sc.multiplicar(3, 9, 6);
		int multiplicar2parametros = sc.multiplicar(2, 4);
		
		int subtrair2parmetros= sc.subtrair(2,2);
		int subtrair3parmetros= sc.subtrair(2,2,1);
		
			
		
		System.out.println("Somar com 2 parametros " + somar2parametros);
		
		System.out.println("Somar com 3 parametros " + somar3parametros);
		
		
		System.out.println("Dividir com 3 parametros  " + dividir3parametros);
		
		System.out.println("Dividir com 2 parametros " + dividir2parametros);
		
		System.out.println("Multiplicar com 2 parametros " + multiplicar2parametros);
		
		System.out.println("Multiplicar com 3 parametros " + multiplicar3parametros);
		
		System.out.println("Subtrair com 3 parametros " + subtrair3parmetros);
		
		System.out.println("Subitrair com 2 parametros " + subtrair2parmetros);
		
		
		
		
		
		

       
		
		
		
	}

}
