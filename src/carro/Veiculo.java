package carro;

public class Veiculo {

	private int quantidadeVeiculos = 0;
	
	private int anoFabricacao;
	private int anoAtual;
	
	public Veiculo(int quantidadeVeiculos, int anoFabricacao, int anoAtual) {
		this.quantidadeVeiculos = quantidadeVeiculos;
		this.anoFabricacao = anoFabricacao;
		this.anoAtual = anoAtual;
	}

	
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}


	public int getAnoAtual() {
		return anoAtual;
	}


	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

	
	
	public int getQuantidadeVeiculos() {
		return quantidadeVeiculos;
	}

	
	public void setQuantidadeVeiculos(int quantidadeVeiculos) {
		this.quantidadeVeiculos = quantidadeVeiculos;
	}

	public int  km_litro( int qtd_km, int  qtd_gasolina) {
		
		return qtd_km * qtd_gasolina;
	}
	
	public Veiculo(int anoFabricacao) {
		 this.anoFabricacao = anoFabricacao;
		 this.anoAtual = 2023; 
		quantidadeVeiculos++;
	  }

	public int  idade (int anoFabricacao , int anoAtual) {
		
		return anoFabricacao - anoAtual;
	}
	
	
}
