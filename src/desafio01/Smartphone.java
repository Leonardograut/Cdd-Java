package desafio01;

public class Smartphone extends Produto {

	
	private String marca;
	
	
	public Smartphone (int codigo,double preco, int estoque, String marca) {
		
		super(codigo,preco,estoque);
		this.marca = marca;
	}
	
	
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}


	
	public  void  Apresentar() {
		System.out.println("Codigo : " + this.codigo);
	    System.out.println("Preco : " + this.preco);
	    System.out.println("Estoque : " + this.estoque);
	    System.out.println("Marca : " + this.marca);
	}


	@Override
	public double aplicarDesconto(double desconto)  throws ProductNotFoundException {
	    // Validação do desconto
	    if (desconto <= 0 || desconto >= 100) {
	        throw new ProductNotFoundException ("O desconto deve estar entre 0% e 100%.");
	    }

	    // Validação da marca
	    if (marca == null || marca.isEmpty()) {
	        throw new ProductNotFoundException("A marca não pode ser nula ou vazia.");
	    }

	    // Verificar se a marca é aplicável
	    if (marca.equals("ABC")) {
	        this.preco -= this.preco * (desconto / 100); // Aplicar desconto
	    } else {
	        throw new ProductNotFoundException("Marca não aplicável para desconto.");
	    }

	    return this.preco;
	}

}
