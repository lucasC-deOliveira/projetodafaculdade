package faculdade;

import java.util.Scanner;

public class TesteContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new java.util.Scanner(System.in);
		Conta conta = new Conta();
		
		
		
	System.out.println("quanto deseja sacar ?");
	double valor = sc.nextDouble();
	conta.sacar(valor);
	System.out.println("o saldo atual da sua conta é: " + conta.getSaldo());

	
	System.out.println("quanto deseja depositar?");
	valor = sc.nextDouble();
	conta.depositar(valor);
	System.out.println("o saldo atual da sua conta é: " + conta.getSaldo());
	
	System.out.println("qual a taxa de ajuste");
	Double taxa= sc.nextDouble();
	conta.atualiza(taxa);
	System.out.println("o saldo final é "+ conta.getSaldo());
	
	System.out.println("Conta corrente");
	Conta conta2 = new ContaCorrente();
	System.out.println("quanto deseja sacar ?");
	 valor = sc.nextDouble();
	conta.sacar(valor);
	System.out.println("o saldo atual da sua conta é: " + conta.getSaldo());

	
	System.out.println("quanto deseja depositar?");
	valor = sc.nextDouble();
	conta.depositar(valor);
	System.out.println("o saldo atual da sua conta é: " + conta.getSaldo());
	
	System.out.println("qual a taxa de ajuste");
	 taxa= sc.nextDouble();
	conta.atualiza(taxa);
	System.out.println("o saldo final é "+ conta.getSaldo());
	
	System.out.println("Conta poupança");
	
	Conta conta3 = new Contapoupança();
	System.out.println("quanto deseja sacar ?");
	 valor = sc.nextDouble();
	conta.sacar(valor);
	System.out.println("o saldo atual da sua conta é: " + conta.getSaldo());

	
	System.out.println("quanto deseja depositar?");
	valor = sc.nextDouble();
	conta.depositar(valor);
	System.out.println("o saldo atual da sua conta é: " + conta.getSaldo());
	
	System.out.println("qual a taxa de ajuste");
	 taxa= sc.nextDouble();
	conta.atualiza(taxa);
	System.out.println("o saldo final é "+ conta.getSaldo());
	
	
	
	
	sc.close();
	
	}

}
