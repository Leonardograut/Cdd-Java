package construtor;

public class Carro {


	public String cor;
	public double preco;
	public String modelo;
	public boolean status;



	public Carro(double preco) {
		this.preco = preco;
	}
	
	public Carro(String cor) {
		this.cor = cor;
	}
	
	

	public Carro(String cor,String modelo) {
		this.cor = cor;
		this.modelo = modelo;
		this.status = false;

	}
	

	public Carro(String cor, String modelo, double preco){
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;

	}
	

	public Carro() {

	}
	
	public void ligar() {
        if (!status) {
            System.out.println("Ligando motor do " + modelo + "...");
            status = true; 
            System.out.println("Motor ligado com sucesso!");
        } else {
            System.out.println("O motor do " + modelo + " já está ligado.");
        }
    }

    public void desligar() {
        if (status) {
            System.out.println("Desligando motor do " + modelo + "...");
            status = false; 
            System.out.println("Motor desligado com sucesso!");
        } else {
            System.out.println("O motor do " + modelo + " já está desligado.");
        }
    }

    public void status() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$" + preco);
        System.out.println("Status do motor: " + (status ? "Ligado" : "Desligado"));
    }
    
    public void verificar() {
    	if (status = true) {
			
    		System.out.println(modelo+ " Carro esta ligado");
		}
    	else{
    		System.out.println(modelo+ "Carro esta desligado");
    	}
    }

	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", preco=" + preco + ", modelo=" + modelo + ", status=" + status + "]";
	}
	
	
	
	
}

