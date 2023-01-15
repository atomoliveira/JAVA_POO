// Entrar via teclado com a base e a altura de um retângulo,
//calcular e exibir sua área.//

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

      System.out.printf("A soma é : %d", soma);

     }
}

