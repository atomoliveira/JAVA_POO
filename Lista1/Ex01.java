// Entrar via teclado com a base e a altura de um ret�ngulo,
//calcular e exibir sua �rea.//

package Aula1_lista1;

import java.util.Scanner;
public class Ex01{
  public static void main(String[] args) {
      Scanner ler= new Scanner(System.in);
      int base , altura, soma;
       System.out.printf("Digite a altura: ");
      altura = ler.nextInt();

      System.out.printf("Digite a base : ");
      base = ler.nextInt();

      soma = base+ altura;

      System.out.printf("A soma � : %d", soma);

     }
}

