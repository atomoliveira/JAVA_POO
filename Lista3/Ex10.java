//Exibir os vinte primeiros valores da s�rie de Bergamaschi. A s�rie: 1, 1, 1, 3, 5, 9, 17, ...
package Lista3;
import java.util.*;
 public class Ex10 {

   public static void main(String[] args) {

		int x=0,i=3, temp=0, valor=0;


		Pilha p = new Pilha();

		while(!p.pilhaVazia()) {
			p.desempilhar();
		}


		p.empilhar(1);
		p.empilhar(1);
		p.empilhar(1);


		//temp = (int)p.exibeUltimoValor();
		//temp = p.tamanho();

		//System.out.printf("%d\n", temp);
				p.empilhar(1);
				p.empilhar(1);
				p.empilhar(1);


		while(x < p.tamanho()) {



				temp = p.tamanho();

				valor+=(int)p.pilha[temp-1];
				valor+=(int)p.pilha[temp-2];
				valor+=(int)p.pilha[temp-3];

				p.empilhar(valor);
				valor=0;


			x++;
		}


		while(i<p.tamanho()) {

			System.out.printf(" %d ", p.pilha[i]);
			i++;

		}

	}

}


}
