//Crie um programa que solicite que o usu�rio entre com dois n�meros (inicial e final). 
//Ao final o programa dever� apresentar o valor total da soma de todos os n�meros do intervalo digitado pelo usu�rio

package Lista3;

import  java.util.Scanner;
public class Ex19 {

	

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
				
				
		    System.out.printf(" %d ", i);
				
				i++;
			}

		}

	}
