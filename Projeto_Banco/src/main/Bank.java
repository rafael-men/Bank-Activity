package main;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double Saldo_inicial = 2500.00;
		
		
		while(true) {
			System.out.println("***********************");
            System.out.println("Dados iniciais do cliente:");
            System.out.println("Nome: XXXXXXXX");
            System.out.println("Tipo conta: Corrente ");
            System.out.printf("Saldo inicial: R$ 2500");
            System.out.println("***********************");

            System.out.println("Operações");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.print("Digite a opção desejada: ");
            
            int opcao = scanner.nextInt();
            
            if(opcao == 1) {
            	System.out.println("Seu Saldo atual é R$ " + Saldo_inicial);
            }
            else if (opcao == 2) {
            	System.out.println("Informe o valor a receber: ");
            	double Saldo_Recebido = scanner.nextDouble();
            	
            	Saldo_inicial += Saldo_Recebido;
            	
            	System.out.println("Saldo atualizado para R$ " + Saldo_inicial);
            			
            }
            else if (opcao == 3) {
            	System.out.println("Insira o valor a ser transferido: ");
            	double transf = scanner.nextDouble();
            	
            	if (Saldo_inicial >= transf) {
            		Saldo_inicial -= transf;
            		System.out.println("Saldo atual: R$ " + Saldo_inicial);
            	}
            	else {
            		System.out.println("Não há saldo na conta suficiente para ser transferido");
            	}
            }
            else if (opcao == 4) {
            	System.out.println("Encerrando sistema... até logo :)");
            	break;
            }
            else {
            	System.out.println("opcão inválida, tente novamente");
            }
            
		}
		
		scanner.close();
	}
}
