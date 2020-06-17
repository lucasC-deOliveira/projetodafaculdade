package exercicio2;

public class Divisao {
	private double  resultado;
	
	

	public Divisao() {
		super();
		
	}

	public double Calcula (double a,double b ) throws DivisaoPorZeroException {
	
	 if (b == 0 ) {
		 throw new DivisaoPorZeroException("divisão por zero não existe");
	 }
	return  resultado = a / b;
			 
		
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	
}
