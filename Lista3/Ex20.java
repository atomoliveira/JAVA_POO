//Elabore um programa que apresente os n�meros pares maiores que 10 no intervalo fechado [A, B]. 
//Sendo que A e B ser�o n�meros inteiros escolhidos pelo usu�rio. 
//Um n�mero � par quando este satisfaz a seguinte condi��o: (N�MERO mod 2 = 0)

package Lista3;

import java.util.*;
public class Ex20 {

	
		public static void main(String[] args) {
			
			
			Scanner ler = new Scanner(System.in);
			
			int num=0, numf=0, i=0;
			
			System.out.printf("Digite um numero inicial: ");
			num = ler.nextInt();
			
			do {
			
			System.out.printf("Digite um numero final tem que ser maior que o inicial: ");
			numf = ler.nextInt();
			
			}while(num > numf);
			
			i=num;
			
			while(i != numf) {
				
				if(i%2==0 && i>10) {
					System.out.printf(" %d ", i);
				}
				
				i++;
			}
			

		}

	}