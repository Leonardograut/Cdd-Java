package string;

public class exer05 {

	public static void main(String[] args) {
		
		/*
		 dado o Array a seguir,  {"a", "vida", "é", "bela"}
		 faça um programa que crie um string o com 
         texto retirado do Array e imprima. no seguinteformato. A VIDA É BELA  

		 */
		
		String array [ ] = {"a", "vida", "é", "bela"};
		
		String resultado = String.join(" ", array).toUpperCase();
		
		System.out.println(resultado);
				
		
//      usando o for \/
		
//		String resultado1 = "";
//		
//		
//	    for (String string : array) {
//			resultado1 = resultado1 + string + " ";
//		}		
//		
//		String textoFinal = resultado1.trim().toUpperCase();
//		
//		System.out.println(textoFinal);
		

	}

}
