package repeticoes;

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
        int  B,H;
        
        int result;
        
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        System.out.println();
        H = sc.nextInt();
        
        System.out.println();
        
        result = B * H;
        
        if (B<=0 && H<=0) {
        	 System.out.println(result);
        } else {
           
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        

	}

}
