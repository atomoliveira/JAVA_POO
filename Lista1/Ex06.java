//Entrar via teclado com o valor da cota��o do d�lar e uma certa quantidade de d�lares.
//Calcular e exibir o valor correspondente em Reais (R$).*/

package Aula1_lista1;


import java.util.Scanner;
public class Ex06 {
           public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
           double cotacao_dolar, valor_dolar,valor_real;

            System.out.printf("Conversor de d�lar em real\n\n");

    System.out.printf("Digite a cota��o do dolar: ");
    cotacao_dolar = entrada.nextDouble();

    System.out.printf("Digite o valor em dolar: ");
    valor_dolar = entrada.nextDouble();

    valor_real = cotacao_dolar * valor_dolar;

    System.out.printf("O Valor em reais � " + valor_real + "\n");
        }
}
