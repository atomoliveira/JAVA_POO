//Calcular e exibir a soma dos �N� primeiros valores da seq��ncia abaixo. 
//O valor �N� ser� digitado, dever� ser positivo, mas menor que cinq�enta. 
//Caso o valor n�o satisfa�a a restri��o, enviar mensagem de erro e solicitar o valor novamente.

package Lista3;
public class Ex12 {

	public static void main(String[] args) {
		
		
int N, num=1, den=2,x=0;
float soma=0, somaden=0;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Entre com o valor menor que 50 positivo, para exibir a soma da sequencia: ");
		N = ler.nextInt();
		
		while(N > 50 || N < 0) {
			System.out.println("ERRO! Digite um numero menor que 50 e positivo");
			N = ler.nextInt();
		}
		
		
		while(x < N){
			
			
			System.out.printf("%d / %d  ,  ", num, den);
			num++;
			den++;
			
			
			
			x++;
			
		}
		
		soma+=num;
		somaden+=den;
		
		System.out.println("\n\nVALOR TOTAL DA SOMA: ");
		System.out.printf("Total = %.0f / %.0f", soma, somaden);
		
		
		


	}

}