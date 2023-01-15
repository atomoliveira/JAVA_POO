// Crie uma classe conforme o Diagrama de Classe (UML). 
	//Crie um programa que utilize essa classe para cadastrar 10 produtos em uma lista de produtos.
	//Ao final exibir apenas os produtos cujo valor � menor do que 100 reais.


package Lista2;

public class Ex04 {

import Lista4.Produto;
import Lista4.Scanner;
import Lista4.String;
import java.util.*;

	public static void main(String[] args) {
			
			
			Produto[] c = new Produto[5];
			Scanner ler = new Scanner(System.in);
			
			
			for(int i=0; i<=9;i++) {
				
				Produto p = new Produto();
				
				// Popula o objeto (preenche os atributos do objetos)
	            System.out.printf("Digite o id do Produto: ");
	            p.id = ler.nextInt();
	           
	            System.out.printf("Digite a descricao: ");
	            p.descricao = ler.next();
	            
	            System.out.printf("Digite quantidade: ");
	            p.quantidade = ler.nextDouble();
	            
	            System.out.printf("Digite o valor: ");
	            p.valor = ler.nextDouble();
	           
	            // Adiciona o objeto no array "listaPessoas"
	            c[i] = p;            

			}
			
			for(int i=0; i<=9; i++) {
				
				//System.out.printf("\nPessoa %d criada com sucesso (%s)!", c[i].id, c[i].nome, c[i].idade, c[i].email);
				
				
				if(c[i].valor > 100) {
					
					System.out.printf("\nProdutos acima de 100 ");
					System.out.printf("\n\n%s - %f", c[i].descricao, c[i].valor);
					
				}
				
				
			}
			
			

			

		}