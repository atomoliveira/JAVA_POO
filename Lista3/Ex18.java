//Crie um programa em que o usu�rio entre com um n�mero inteiro qualquer, 
//e o programa imprima os 20 n�meros subsequentes ao que foi digitado pelo usu�rio

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


	