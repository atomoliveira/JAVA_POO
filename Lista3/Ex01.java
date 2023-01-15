//Criar uma rotina de entrada que aceite somente um valor positivo.

package Lista3;

public class Ex01 {

	import java.util.*;
	 
	public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			int num;
			
			do {
				
			System.out.println("Digite um numero positivo: ");
			num = ler.nextInt();
				
			}while(num <= 0);
			
			System.out.printf("Esse numero esta correto, voce digitou: %d", num);
			

		}

	}