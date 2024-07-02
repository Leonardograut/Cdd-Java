package repeticoes2;


public class exer07 {

	public static void main(String[] args) {
		//escreva um programa que calcule a soma dos multiplos de   3 e  5,  o intervalo entre 1 e 20.
		//no final , mostre a  soma  dos multiplos de  3 e  5  e  a soma total

	
	   int soma3 = 0;
        int soma5 = 0;
        int somaTotal = 0;

        for (int numero = 1; numero <= 20; numero++) {
            if (numero % 3 == 0) {
                soma3 += numero;
            }

            if (numero % 5 == 0) {
                soma5 += numero;
            }

            somaTotal = soma3+soma5;
        }

        System.out.println("Soma dos múltiplos de 3: " + soma3);
        System.out.println("Soma dos múltiplos de 5: " + soma5);
        System.out.println("Soma total: " + somaTotal);
	

}}
 