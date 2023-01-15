/*7. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor
//referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá
//ser devolvido.*/

package Aula1_lista1;


import java.util.Scanner;

public class Ex07 {

  import java.util.*;

  public static void main(String[] args) {


		Scanner ler = new Scanner(System.in);

		int i=0;
		double prod=0, pagar=0, valorProd=0;


		while(i<=4) {

			System.out.printf("Digite o valor do produto: ");
			prod = ler.nextDouble();

			valorProd += prod;

			i++;
		}


		System.out.printf("Valor a pagar: %.2f", valorProd);
		System.out.printf("\n");
		System.out.printf("Digite o valor em dinheiro: ");
		pagar = ler.nextDouble();

		if(pagar < valorProd) {

			System.out.printf("Valor abaixo do valor de compra!");

		}else {
			pagar = pagar-valorProd;
			System.out.printf("troco: %.2f", pagar);
		}

	}

}

