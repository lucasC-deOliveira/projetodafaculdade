package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Alunotxt {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("sistema de cadastro de alunos");
		ArrayList<Aluno> alunos = new ArrayList();
		int i = 0;
		while (i != 5) {
			System.out.println("1 p/ cadastrar, 2 p/ listar todos, 3 p/ pesquisar, 4 p/ remover, 5 p/ sair");
			i = sc.nextInt();
			if (i == 1) {
				String nome;
				String data;
				int matricula;
				System.out.println("nome do aluno");
				nome = sc.next();
				System.out.println("data de nascimento (dd/mm/YYYY)");
				data = sc.next();
				System.out.println("numero de matricula");
				matricula = sc.nextInt();

				Aluno aluno = new Aluno(nome, data, matricula);
				alunos.add(aluno);
				

			}
			else if(i == 2) {
				for(int o = 0; o < alunos.size(); o++) {
					System.out.println("nome: " + alunos.get(o).getNome());
					System.out.println("data: " + alunos.get(o).getData());
					System.out.println("matricula: " + alunos.get(0).getMatricula());
				System.out.println();
				}
				
			}

			else if(i==3) {
				System.out.println("informe o indice do aluno a ser pesquisado");
				int ind=sc.nextInt();
				
				System.out.println("nome: " + alunos.get(ind).getNome());
				System.out.println("data: " + alunos.get(ind).getData());
				System.out.println("matricula: " + alunos.get(ind).getMatricula());
			System.out.println();
			
		}
			else if(i==4) { System.out.println("informe o indice do aluno a ser removido");
			int ind = sc.nextInt();
			alunos.remove(ind);
			
			
				
			}
			
			
			
			
			
		}
	}
}
