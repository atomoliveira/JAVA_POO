//Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão
//digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”, caso contrário,
//exibir a mensagem “Terreno pequeno”

package Lista2;

import java.util.*;

public class Ex05 {

public static void main(String[] args) {


		Scanner ler = new Scanner(System.in);

		double a, b, area;

		System.out.printf("Digite o valor da base do Triangulo: ");
		a = ler.nextInt();

		System.out.printf("Digite o valor da altura do Triangulo: ");
		b = ler.nextInt();

		area = a*b/2;

		System.out.printf("A área do Quadrado é: %.2f ", area);

	}

}


