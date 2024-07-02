package repeticoes;



public class exer002 {
	
	
	//escreva um aplicativo em java que mostre todos os numeros
	//impares de 1 ate 100,usando a definicao de  numeros impares

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner (System.in);
		
        int limite = 0;
       
        
        while (limite<=100) {
            
            if (limite % 2 != 0) {
                
                System.out.print(limite + " ");
            }
            limite++;
        }
		

	}

}
