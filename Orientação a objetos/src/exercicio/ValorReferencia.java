package exercicio;

public class ValorReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variaveis tipo valor
		int x = 2;
		int y = 3;
		x=y;
		y = 4;
		
		System.out.println("Y: "+y);
		System.out.println("X:"+x);
		// note que o valor foi alterado dentro do endereço alocado de memoria das variaveis x e y
		// em java todos os tipos primitivos sao variaveis de tipo valor;
		
		// variaveis de tipo refencia
		
		Referencia a1 = new Referencia();
		double valor = 2;
		a1.setValor(valor);
		Referencia a2 = a1;
		// criei duas variaveis referenciando o mesmo objeto
		System.out.println("x: "+a1.getValor());
		System.out.println("y: "+a2.getValor());
	    valor = 3;
	    a1.setValor(valor);
		System.out.println("x: "+a1.getValor());
		System.out.println("y: "+a2.getValor());
	    //como são variaveis referencia toda altereção feita por quaquer uma dessas variaveis vai refletir no mesmo objeto
	    
	    valor = 5;
	    a2.setValor(valor);
		System.out.println("x: "+a1.getValor());
		System.out.println("y: "+a2.getValor());
		
		
		
	}

}
