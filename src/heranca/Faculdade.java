package heranca;

public class Faculdade {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Leonardo", 29);
		aluno.matricula = "145264";
		
		
		System.out.println("A matricula do aluno"+ aluno.matricula);
		System.out.println(aluno);
		
		System.out.println();
		System.out.println();
		
//--------------------------------------------------------------
		
		
		Funcionario func = new Funcionario("Mario",20);
		func.salario = 1000;
		func.cargo = "Dev";
		
		System.out.println("Salario :"+func.salario);
		System.out.println("Cargo :" +func.cargo);
		System.out.println(func);
		
//---------------------------------------------------------		
		Professor prof = new Professor("Josias",25);
		prof.salario = 2000;
		prof.disciplinas = "GEOGRAFIA";
		
		
		System.out.println("Salario :"+prof.salario);
		System.out.println("Disciplinas :" +prof.disciplinas);
		System.out.println(prof);
		
		
//--------------------------------------------------------------
		
	}

}
