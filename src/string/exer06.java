package string;


public class exer06 {

	public static void main(String[] args) {
        
		/* Refaça o exercício anterior, usando a 
           maneira como o Mestre yoda falaria..
           BELA É VIDA 
		 */
		
		
		String array [ ] = {"a", "vida", "é", "bela"};
		
    	
		String resultado1 = "";
		
		
		for (int i = array.length -1 ; i >=0; i--) {
			resultado1 = resultado1 + array[i] + " ";
			
		}
		
		String resultadof = resultado1.trim().toUpperCase();
		
		System.out.println(resultadof);
		
	}

}
