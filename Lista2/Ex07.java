//Entrar com o peso e a altura de uma determinada pessoa. Ap�s a digita��o, exibir se
//esta pessoa est� ou n�o com seu peso ideal. F�rmula: peso/altura�.

package Lista2;

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double peso, altura, pesoideal;

		System.out.printf("Digite o seu peso: ");
		peso = ler.nextDouble();

		System.out.printf("Digite o sua altura: ");
		altura = ler.nextDouble();

		pesoideal = peso/(Math.pow(altura, 2));

		if(pesoideal < 19) {

			System.out.printf("Feminino: Abaixo do peso");
		}else if(19 <= pesoideal && pesoideal < 24) {

			System.out.printf("Feminino: Peso Ideal");

		}else if(pesoideal >= 24) {

			System.out.printf("Feminino: Acima do peso");

		}


		if(pesoideal < 20) {

			System.out.printf("Masculino: Abaixo do peso");
		}else if(20 <= pesoideal && pesoideal < 25) {

			System.out.printf("Masculino Peso Ideal");

		}else if(pesoideal >= 25) {

			System.out.printf("Masculino Acima do peso");

		}




	}

}
