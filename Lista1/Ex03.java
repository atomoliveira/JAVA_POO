/*3. A partir dos valores da base e altura de um tri�ngulo, calcular e exibir sua �rea.*/

package Aula1_lista1;

import java.util.Scanner;
public class Ex03 {
  public static void main(String[] args){
      Scanner ler = new Scanner(System.in);
      
      int base, altura, area;
      
      System.out.printf("Digite a base :");
      base = ler.nextInt();
      
      System.out.printf("Digite a Altura :");
      altura =ler.nextInt();
      
      area = base + altura;
      
      System.out.printf(" A soma � : %d" , area);
     }
  
}

	
