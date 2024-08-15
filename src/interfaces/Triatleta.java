package interfaces;

public class Triatleta implements Atleta,Corredor,Nadador,Ciclista {

    String acao = "" ;
	
    String nome;


	@Override
	public void pedalar() {
		
		if (acao.equals("")) {
			System.out.println( nome  + " Esta pedalando "  );
			acao = "pedalar";
		}else if (acao.equals("nadando")) {
			System.out.println("Nao pode nadar pos esta pedalando");
		}else if (acao.equals("correr")) {
			System.out.println("nao pode correr pois esta pedalando");
		}else if (acao.equals("descansar")) {
			System.out.println("esta descanando  entao nao pode pedalar");
		}
		
		
	}

	@Override
	public void nadar() {
		if (acao.equals("")) {
			System.out.println( nome  + " Esta nadando "  );
			acao = "nadar";
		}else if (acao.equals("pedalar")) {
			System.out.println("Nao pode pedalar pos esta nadando");
		}else if (acao.equals("correr")) {
			System.out.println("nao pode andar pois esta comendo");
		}else if (acao.equals("descansar")) {
			System.out.println("nao pode nadar pois  esta descansando");
		}
			
	}

	@Override
	public void correr() {
		
		if (acao.equals("")) {
			System.out.println( nome  + " Esta Correndo ");
			acao = "correr";
		}else if (acao.equals("nadar")) {
			System.out.println("O atleta esta correndo entao nao pode nadar");
		}else if (acao.equals("descansar")) {
			System.out.println("nao pode correr pois esta andando");
		}else if (acao.equals("pedalar")) {
			System.out.println("o atleta esta correndo entao nao pode  pedalar");
		}
		
	}
	
	public void descansar() {
		
		if (acao.equals("")) {
			System.out.println( nome  + " esta descansando "  );
			acao = "descansar";
		}else if (acao.equals("nadar")) {
			System.out.println("Nao pode nadar  pos esta descansado");
		}else if (acao.equals("pedalar")) {
			System.out.println("nao pode pedalar pois esta pedalando");
		}else if (acao.equals("correr")) {
			System.out.println("ele esta descando entao nao pode correr");
		}
		
	}

}
