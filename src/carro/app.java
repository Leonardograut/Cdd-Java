package carro;

public class app {

	public static void main(String[] args) {
		
		Veiculo sc = new Veiculo(2015);
		System.out.println("Quantidade de veiculos " + sc.getQuantidadeVeiculos());
        System.out.println(sc.idade(10, 5));
        System.out.println(sc.km_litro(5, 10));
        
        
        
        
        
       
        
        Carro carro = new Carro("fiat","branca",2010,20,true);
        carro.acelerar(10);
        carro.desligar();
        carro.pintar("BRANCO");
      
        
        
        Caminhao cam = new Caminhao(10);
        
        cam.getAnoAtual();
        cam.getAnoFabricacao();
        cam.getQuantidadeVeiculos();
        
        
        
        
        
        
	}

}
