package faculdade;

import java.util.ArrayList;

import java.util.Scanner;

public class Lista {
	private void add(String nome) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		int i = 2;
		ArrayList <String> lista = new ArrayList();
	while(i != 1 ) {	
		Scanner sc = new Scanner(System.in);
	System.out.println("digite um nome");
	String nome = sc.next();
	lista.add(nome);
	System.out.println("digite 1 para sair/ 2 para insirir outro nome");
	i = sc.nextInt();
	}
	for(String s: lista){
		   System.out.println(s);
		}

	}
	
	}

	

