package encapsulamento;

public class Pet {

	private String nome;
	private String signo;
	private String raca;
	private boolean vacinado ;
	private String nomeDoDono;
	private String padrinho;
	
	
	public void ajustarNome(String nome) {
		this.nome = nome;
	}
	
	public String mostrarNome() {
		return this.nome;
	}
	
	
	public void ajustarSigno(String signo) {
		this.signo = signo;
	}
	
	public String mostrarSigno() {
		return this.signo;
	}
	
	
	public void ajustarRaca(String raca) {
		this.raca = raca;
	}
	
	public String mostrarRaca() {
		return this.raca;
	}
	
	
	public String getNomeDoDono() {
		return nomeDoDono;
	}

	public void setNomeDoDono(String nomeDoDono) {
		this.nomeDoDono = nomeDoDono;
	}

	public String getPadrinho() {
		return padrinho;
	}

	public void setPadrinho(String padrinho) {
		this.padrinho = padrinho;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigno() {
		return signo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public boolean isVacinado() {
		return vacinado;
	}

	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}
	
	
}
