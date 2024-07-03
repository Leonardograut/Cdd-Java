package arrays;

import java.util.Arrays;


public class exer05 {

	public static void main(String[] args) {
		
		
		int[] num = {81, 32, 17, 8, 20,91,43};
		
	
		int[] num2 = new int[num.length];

		
		
		System.out.print("Array em ordem crescente: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
            Arrays.sort(num);
        }
        
        
        System.out.println();
		
        
        
		System.out.println("Array invertido");
		for (int i = num.length -1; i >= 0; i--) {
			
			System.out.print(num[i]+ " ");
			
			
		}
		
		System.out.print("Guardar em outro array");
		System.out.println();
		for (int y = num.length -1; y >= 0; y--) {
            num2[y] = num[y];
            
            System.out.print(num2[y] + " ");
        }
       
		
         
	}

}
