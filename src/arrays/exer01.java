package arrays;


//crie um array de inteiros com 5 elementos inicialize com valores  e imprima  esses  valores
//exiba uma condiçao para  saber qual e impar e par ,  e depois some todos os elementos  do array

public class exer01 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int sum =0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Elemento na posicao " + i + ": " + array[i]);
			if (array[i]%2==0) {
				System.out.println("Elemento da  posicao "+ i + " PAR\n");
			}else {

				System.out.println("Elemento da posicao " + i + " IMPAR\n");

			} 
			sum = sum +array[i];

		}
		
		System.out.println("A soma dos elementos do array e " + sum);



	}

}
