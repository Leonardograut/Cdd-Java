package string;

public class exer03 {

	public static void main(String[] args) {
		/*compare os 2 textos abaixo e diga se são 
          iguais.*/


		String texto01 = "Será que são iguais?";
		String texto02 = "Será que são iguais?";

		boolean result = texto01.equals(texto02);


		if (result) {

			System.out.println("Os textos  sao iguais : " + result);

		}else {
			System.out.println("Os textos sao diferentes :" + result);
		}

	}

}
