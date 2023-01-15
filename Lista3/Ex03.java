//33. Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como respostas válidas.

package Lista3;

import java.util.Scanner;
public class Ex03 {

	

    public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			char sexo;
			
			
				
			
			System.out.println("Digite o sexo F ou M: ");
			sexo = ler.nextLine().charAt(0);
				
			
			while((sexo != 'M' && sexo != 'F')) {
				System.out.println("Digite o sexo F ou M: ");
				sexo = ler.nextLine().charAt(0);
			}
			System.out.println("Fim!");
			
			ler.close();
		}
		
		

	}