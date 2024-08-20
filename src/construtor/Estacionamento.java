package construtor;

public class Estacionamento {

	public static void main(String[] args) {
		
		System.out.println();
		
		Carro c4 = new Carro("Preto","Fusca",20000);
		c4.verificar();
		c4.ligar();
		c4.status();
		
		
		System.out.println(c4.toString());
		
		System.out.println();
		System.out.println();
		
		
		Carro c3 = new Carro("Amarelo","Honda",10000);
		c3.verificar();
		c3.desligar();
		c3.status();
		
		System.out.println(c3.toString());
		
		
		
		
		
		
		
         
	}

}
