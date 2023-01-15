//Crie as classes conforme o Diagrama de Classe (UML) abaixo. Crie um programa que
//utilize essas classes para cadastrar 5 clientes em uma lista de clientes e pergunte para
//cada cliente se ele tem ou n�o conta banc�ria. Caso o cliente tenha, permita ele cadastrar
//os dados da conta banc�ria. Ao final exibir todos os clientes e suas respectivas contas
//banc�rias, se houver.

import java.util.*;


public class Ex01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Cliente[] cadastrar = new Cliente[5];
		
		
		String nome, email, agencia, numero;
		int id,idade;
		double saldo;
		char possuiConta;
		
		
		
		for(int i=0;i<=4;i++){
			
		Cliente c;
			
		System.out.println("Digite o id do cliente: ");
		id = ler.nextInt();
			
		System.out.println("Digite o nome do cliente: ");
		nome = ler.next();
		
		System.out.println("Digite a idade do cliente: ");
		idade = ler.nextInt();
		
		System.out.println("Digite o email do Cliente: ");
		email = ler.next();
		
		
		 System.out.printf("Possui conta Bancaria? (S/N)");
		 possuiConta = ler.next().charAt(0);
         
         if (possuiConta == 'S') {
        	 
        	 
        	 System.out.println("Digite a agencia: ");
     		 agencia = ler.next();
     		 
     		 System.out.println("Digite o numero da conta: ");
    		 numero = ler.next();
    		 
    		 System.out.println("Digite o saldo da conta: ");
    		 saldo = ler.nextDouble();
    		 
    		// Instancia conta Banc�ria
        	 ContaBancaria conta = new ContaBancaria(agencia,numero, saldo);
    		 
        	// Instancia (cria) o objeto cliente com a conta
    		 c = new Cliente(id, nome, idade, email,conta);
    		  
         }	else {
        	 
        	// Instancia (cria) o objeto cliente sem conta
        	 c = new Cliente(id, nome, idade, email,null);
         }
			
			
      // Adiciona o objeto no array "cadastrar"
         cadastrar[i] = c;
			
		}
		
		for (int i=0; i<=4; i++) {
			
			
            System.out.printf("\nCliente %d criado com sucesso (%s)!", cadastrar[i].id, cadastrar[i].nome);
         
            
            if (cadastrar[i].conta != null) {
            	System.out.printf("\n Dados da Conta: %s", cadastrar[i].exibirDadosConta());
             
            }

	 }
	 

	}

