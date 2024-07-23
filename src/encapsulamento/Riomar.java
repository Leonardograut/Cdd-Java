package encapsulamento;

public class Riomar {

	public static void main(String[] args) {
		Pet p1 = new Pet();
		p1.setNome("fumaca");
		p1.setRaca("pitbul");
		p1.setSigno("libra");
		p1.setVacinado(false);
		p1.setNomeDoDono("janja");
		p1.setPadrinho("lula");
		
        System.out.println("O nome do pet: "+ p1.getNome());
        System.out.println("Raça: "+p1.getRaca());
        System.out.println("Signo: "+p1.getSigno());
        System.out.println("Esta vacinado ?:"+ p1.isVacinado());
        System.out.println("O nome do dono:"+ p1.getNomeDoDono());
        System.out.println("Quem e o padrinho ? :" +p1.getPadrinho());
         
}}
