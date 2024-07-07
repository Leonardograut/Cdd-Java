package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class exer05 {

	public static void main(String[] args) {
		
		
		int[] num = {81, 32, 17, 8, 20,91,43};
		
	
		int[] num2 = new int[num.length];

		Arrays.sort(num);
				
		System.out.print("Array em ordem crescente: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
            
        }
        
        System.out.println();
        System.out.println();
		
        
        
		System.out.print("Array invertido :" + " ");
		for (int i = num.length -1; i >= 0; i--) {
			
			System.out.print(num[i]+ " ");
			
			
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("Guardar em outro array" + " ");
		for (int y = num.length -1; y >= 0; y--) {
            num2[y] = num[y];
            
            System.out.print(num2[y] + " ");
        }
       
		
		
		
         
	}

}
