package desafio01;

public class App {

	public static void main(String[] args)  {
		
		   Smartphone smartphone = new Smartphone(1, 2000.0, 10, "ABC");

	       
	        smartphone.Apresentar();
	        
	        try {
	            System.out.println("\nTentando aplicar desconto...");

	            // Aplica desconto e exibe o preço atualizado
	            smartphone.aplicarDesconto(100);
	            System.out.println("\nDesconto aplicado com sucesso!");
	            smartphone.Apresentar();

	        } catch (ProductNotFoundException e) {
	            // Tratamento de erro ao aplicar desconto
	            System.out.println("\nErro ao aplicar desconto: " + e.getMessage());
	        }
	    }

	        
	}


