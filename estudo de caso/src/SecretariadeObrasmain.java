
import java.util.Random;
import java.util.Scanner;

public class SecretariadeObrasmain {

	public static void main(String[] args) {
		System.out.println("Secretaria de Obras do Gama");
		
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("sistema de cadastro de alunos");
		BancodeReclamações banco = new BancodeReclamações();		
		int i = 0;
		while (i != 5) {
			System.out.println("1 p/ Registra reclamação, 2 p/ excluir reclamação, 3 consultar reclamação, 4 Registrar concerto, 5 p/ sair");
			i = sc.nextInt();
			if (i == 1) {
				
				Random randon= new Random();
                int NReclamação = randon.nextInt(100);
                
				System.out.println("informe a rua");
				String rua=sc.next();
				System.out.println("informe o numero");
				String numero = sc.next();
				System.out.println("informe o bairro");
				String bairro= sc.next();
				
				System.out.println("informe o tamanho do buraco de 1 a 10");
				int tamanho = sc.nextInt();
				
				System.out.println("o buraco se encontra na calçada ou na rua ?" );
                 String localização= sc.next();
                 
                 System.out.println("digite a data da solicitação no formato DD/MM/YYYY");
                 String data= sc.next();
                 
                 
                 
                 
				Reclamação reclamação = new Reclamação(NReclamação, tamanho, localização, rua, numero, bairro, data);
					
					banco.ADDreclamação(reclamação);
					
				 

						
						System.out.println("a reclamação foi registrada" + reclamação);
				

			}

			else if(i == 2 ) {
				System.out.println("digite o nº da reclamação a ser excluida");
				 int Nreclamação = sc.nextInt();
				 banco.ExcluirReclamação(Nreclamação);
				 
				
			}
			
			else if(i == 3) {
				System.out.println("digite o nº da reclamação a ser consultada");
				 int Nreclamação = sc.nextInt();
				 Reclamação recuperada = banco.ConsultarReclamação(Nreclamação);
				 if(recuperada == null) {
					 System.out.println("Reclamação não encontrada");
					 System.out.println();
				 }
				 else {
				 System.out.println(recuperada);
				 System.out.println();
				 }

			}
		
			else if(i == 4) {
				System.out.println("informe o numero da reclamação a ser concertada");
				int Nreclamação = sc.nextInt();
				 Reclamação recuperada = banco.ConsultarReclamação(Nreclamação);
				 if(recuperada == null) {
					 System.out.println("Reclamação não encontrada");
					 System.out.println();
				 }
				 else {
				 System.out.println(recuperada);
				 System.out.println();
				 System.out.println("digite o valor do concerto");
				 String valor = sc.next();
				 recuperada.setValor(valor);
				 System.out.println("digite a data da realização do concerto no formato DD/MM/YYYY");
				 String data = sc.next();
				 recuperada.setData(data);
				 recuperada.setSituação("Concertado");
				 System.out.println("operação realizada com sucesso");
				 System.out.println(recuperada + "" + recuperada.getValor());
				 
				 
				 
				 
				 
				 }

			}
			
		}
		}
	}
	