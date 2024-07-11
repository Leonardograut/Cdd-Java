package poo;

public class ClassePessoa {
String acao = "" ;
	
	
	String nome;
    
	
	public void pararDeandar() {
		if (acao.equals("andando")) {
			acao = "";
			
			System.out.println("Parou de andar");
		}else {
			System.out.println("Nao esta andando");
			
		} 
	}
	
	
	public void comer() {
        
		if (acao.equals("")) {
			System.out.println( nome  + " Esta Comendo "  );
			acao = "comendo";
		}else if (acao.equals("dormindo")) {
			System.out.println("Nao pode comer  pos esta dormindo");
		}else if (acao.equals("andando")) {
			System.out.println("nao pode comer pois esta andando");
		}
		
			  
	}
		
	public void dormir() {
		
		if (acao.equals("")) {
			System.out.println( nome  + " Esta dormindo ");
			acao = "dormindo";
		}else if (acao.equals("dormindo")) {
			System.out.println("Nao pode andar  pos esta dormindo");
		}else if (acao.equals("comendo")) {
			System.out.println("nao pode andar pois esta dormindo");
		}else if (acao.equals("andando")) {
			System.out.println("Nao pode andar pois esta dormindo");
		}
			
	}
	
	public void andar() {
		
		if (acao.equals("")) {
			System.out.println( nome  + " Foi andar "  );
			acao = "andando";
		}else if (acao.equals("dormindo")) {
			System.out.println("Nao pode andar  pos esta dormindo");
		}else if (acao.equals("comendo")) {
			System.out.println("nao pode andar pois esta comendo");
		}else if (acao.equals("andando")) {
			System.out.println("Ja esta andando");
		}
		
	}
}
