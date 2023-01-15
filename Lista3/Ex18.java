//Crie um programa em que o usuário entre com um número inteiro qualquer, 
//e o programa imprima os 20 números subsequentes ao que foi digitado pelo usuário

package Lista3;

import java.util.*;
public class Ex18 {
	
	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int num=0, i=0;
			
			System.out.printf("Digite um numero: ");
			num = ler.nextInt();
			
			i=num;
			num+=20;
			
			
			while(i != num) {
				
				
				System.out.printf(" %d ", i);
				
				i++;
			}

		}

	}


	