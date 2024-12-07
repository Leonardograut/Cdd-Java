package desafio01;

public  abstract class Produto {
	
	protected  int codigo;
	
	protected double preco;
	
	protected int  estoque;
	
	public Produto(int codigo, double preco, int estoque) {
		this.codigo = codigo;
		this.preco = preco;
		this.estoque = estoque;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	

	public abstract double aplicarDesconto(double desconto) throws ProductNotFoundException;
		
	

}
