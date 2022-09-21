//Entrar com o peso, o sexo e a altura de uma determinada pessoa. Após a digitação,
//exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

package Lista2;

import java.util.Scanner;
public class Ex10 {

public static void main (String[] args){

		Scanner ler = new Scanner (System.in);

		double alt, peso, imc;

		System.out.printf("Digite a sua altura: ");
		alt = ler.nextDouble();

		System.out.printf("Digite a sua peso: ");
		peso = ler.nextDouble();

		imc = peso / (alt* alt);

		if (imc < 20){

			System.out.printf("Abaixo peso");
		}else if (imc < 25){
			System.out.printf("Peso ideal");
		}
		else{
			System.out.printf("Acima do peso");
		}


	}

}






