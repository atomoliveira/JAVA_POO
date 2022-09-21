//Entrar via teclado, com dois valores distintos. Exibir o menor deles.

package Lista2;

import java.util.Scanner;
public class Ex02 {
	
	public static void main (String[] args){
			
			Scanner ler = new Scanner(System.in);
			
			int a, b, soma;
			
			System.out.printf("Digite o primeiro valor: ");
			a = ler.nextInt();
			
			System.out.printf("Digite o primeiro valor: ");
			b = ler.nextInt();
			
			soma = a + b;
			
			System.out.printf("A soma é: %d ", soma);
		}
		
	}


	