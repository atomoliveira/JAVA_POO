//Calcular e exibir a �rea de um quadrado, a partir do valor de sua aresta que ser� digitado.*/

package Aula1_lista1;

mport java.util.*;


public class Ex02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);


		double a, area;

		System.out.printf("Digite o valor de um lado do quadrado: ");
		a = ler.nextInt();


		area = Math.pow(a, 2);


		System.out.printf("A �rea do Quadrado �: %.2f ", area);

	}

}

