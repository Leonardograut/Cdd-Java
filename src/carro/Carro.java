package carro;

public class Carro extends  Veiculo {

	public static final int PORTAS = 4;

	private String modelo;
	private String cor;
	private int ano;
	private int velocidade = 0;
	private boolean ligado = false;
	


	public Carro(String modelo, String cor, int ano,int velocidade , boolean ligado) {
		super(velocidade);
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.velocidade = 0;
		this.ligado = false;
		
	}


	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	
	public  int   acelerar (int qtd) {
		return qtd;
	}
	
	public  int  freiar(int  qtd_f) {
		return qtd_f ;
	}

	
	
	public int getVelocidade() {
		return velocidade;
	}

	
	public void desligar() {
	  	ligado = false;
	  	velocidade =0;
	  	System.out.println("O Veiculo esta desligado");
	}
	
	public void pintar (String cor) {
		System.out.println(cor);
	}
	
	
	
}
