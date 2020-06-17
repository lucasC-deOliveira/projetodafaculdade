package exercicio2;

public class Maindivisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Divisao divisão = new Divisao();

try { divisão.Calcula(15, 0);
System.out.println(divisão.getResultado());
	
} catch (DivisaoPorZeroException  e) {
	System.out.println(e.getMessage());
	// TODO: handle exception
}

	
	}

}
