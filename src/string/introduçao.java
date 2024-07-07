package string;

import java.util.StringTokenizer;

public class introduçao {

	// Declara uma variável de instância do tipo String com o valor "Maça"

	static String valor = "Leonardo e lindo";
	

	public static void main(String[] args) {

		// Descomente as linhas abaixo para chamar os métodos correspondentes

		//tamanhoString();
		//pegarCaracteres();
		//trabalhandoComSubstring();
		//exemploIndexOf();
		//exemplosCase();
		//removerEspacosEmBranco();
		//replace();
		//OutrosMeotodos();
		//CompareToecompareToignoreCase();
		  StringTokenizer();
	}

	private static void tamanhoString() {
		int tamanho = valor.length(); // Obtém o tamanho da string

		System.out.println("Tamanho " + tamanho); // Exibe o tamanho da string
	}

	// Método para pegar caracteres específicos na string

	private static void pegarCaracteres() {
		char caractere = valor.charAt(0); // Obtém o primeiro caractere

		char ultimo = valor.charAt(valor.length() - 1); // Obtém o último caractere

		System.out.println("Primeiro e ultimo Caractere " + caractere + " e " + ultimo); // Exibe o primeiro e o último caractere
	}

	// Método para trabalhar com substrings
	private static void trabalhandoComSubstring() {
		
		String pedaco = valor.substring(6, valor.length()); // Obtém uma substring a partir do índice 6 até o final da string
		
		System.out.println("pedaco da string: " + pedaco); // Exibe a substring
	}

	// Método para demonstrar o uso de indexOf

	private static void exemploIndexOf() {

		int indice = valor.indexOf("R"); // Procura o índice da letra "R" (não encontrada)
           
		
		System.out.println("Indice da Letra a " + indice); // Exibe o índice (será -1)

		String nome = "Afrodite da Silva";

		indice = nome.indexOf("Silva"); // Procura o índice da substring "Silva"
		
		
		System.out.println("Indice encontrado " + indice); // Exibe o índice da substring "Silva"
		

		// Verifica se a substring "Afrodite" é encontrada no início da string (sempre será diferente de -1)

		if (nome.indexOf("Afrodite") != -1) {
			System.out.println("Encontrei " + nome);
		} else {
			System.out.println("Nao encontrei esse pedaco de nome");
		}
	}

	// Método para demonstrar conversão de case (maiúsculo/minúsculo)

	private static void exemplosCase() {
		String string = "Nascimento";

		String MAIUSCULO = string.toUpperCase(); // Converte a string para maiúsculas

		System.out.println(MAIUSCULO); // Exibe a string em maiúsculas

		String MINUSCULO = string.toLowerCase(); // Converte a string para minúsculas

		System.out.println(MINUSCULO); // Exibe a string em minúsculas
	}

	// Método para remover espaços em branco no início e no fim da string
	private static void removerEspacosEmBranco() {
		String string = " Condominio Digital ";

		String stringSemEspacos = string.trim(); // Remove espaços em branco no início e no fim da string

		System.out.println(stringSemEspacos.length()); // Exibe o comprimento da string sem espaços

		System.out.println(stringSemEspacos); // Exibe a string sem espaços
	}

	// Método para substituir caracteres na string
	private static void replace() {
		
		String valor = "Maça";

		// Substitui "ã" por "a" e "ç" por "c" na string valor
		String novaMaca = valor.replace("ã", "a").replace("ç", "c");

		System.out.println(novaMaca); // Exibe a nova string

		// Substitui "." e "-" por uma string vazia no CPF
		String cpf = "012.345.678-90";

		System.out.println(cpf.replace(".", "").replace("-", "")); // Exibe o CPF sem pontos e hífens
	}

	// Método para demonstrar outros métodos úteis da classe String
	private static void OutrosMeotodos() {
		String hello = "Hello";

		// Verifica se a string "hello" é igual a "hello", ignorando maiúsculas/minúsculas

		System.out.println("Parece com hello: " + hello.equalsIgnoreCase("hello"));

		// Verifica se a string começa com "He"

		System.out.println("Começa com He?: " + hello.startsWith("He"));

		// Verifica se a string termina com "lo"

		System.out.println("Começa com Lo?: " + hello.endsWith("lo"));

		String nomeCompleto = "Fulano Beltrano e Cicrano";

		// Divide a string em partes usando o espaço como delimitador

		String[] partesDoNome = nomeCompleto.split(" ");

		// Exibe cada parte da string dividida

		System.out.println(partesDoNome[0]);
		System.out.println(partesDoNome[1]);
		System.out.println(partesDoNome[2]);
		System.out.println(partesDoNome[3]);
	}
	
	
	
	private static void CompareToecompareToignoreCase() {
		
		
		 String valor = "CDD4.0 - Java";
		 System.out.println(valor.compareTo("CDD4.0 - Java") == 0 ? true : false); // Como ambas as strings são exatamente iguais, o método compareTo retornará 0.true
		 System.out.println(valor.compareTo("CDD4.0 - JAVA") == 0 ? true : false); // A comparação é sensível a maiúsculas e minúsculas, então "Java" e "JAVA" são diferentes. false 
		
		 System.out.println(valor.compareToIgnoreCase ("CDD4.0 - JAVA") == 0 ? true : false); 
		 
		 //A comparação ignora diferenças entre maiúsculas e minúsculas, então "Java" e "JAVA" serão considerados iguais. entao retornara 0 true
	}
	
	
	private static void  StringTokenizer() {
		
		//Isso indica que há 12 tokens (ou palavras) na string fornecida, de acordo com a separação por espaços em branco.
		StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo mas não iremos desistir nunca");
		
		System.out.println(exemplo.countTokens());
        
		
	}
	
}
