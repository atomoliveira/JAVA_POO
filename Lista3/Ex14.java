//Entrar via teclado com dez valores positivos. 
//Consistir a digita��o e enviar mensagem de erro, se necess�rio. 
//Ap�s a digita��o, exibir:
//a) O maior valor;
//b) A soma dos valores;
//c) A m�dia aritm�tica dos valores;

package Lista3;
import java.util.*;

public class Ex14 {
	
	public static void main(String[] args) {
			
			int num, MaiorVal=0, Soma=0,media=0,i=1;
			
			
			Scanner ler = new Scanner(System.in);
			
			
			while(i <= 10) {
				
				System.out.printf("Digite um numero inteiro");
				num = ler.nextInt();
				Soma+=num;
			
				
				if(MaiorVal < num) {
					MaiorVal = num;
				}
					
					
				
				i++;
				
			}
			media = Soma/10;
			System.out.printf("\nMaior valor: %d",MaiorVal);
			System.out.printf("\nSoma dos Valores: %d", Soma);
			System.out.printf("\nMedia: %d", media);
			
			
		}

	}
}

	