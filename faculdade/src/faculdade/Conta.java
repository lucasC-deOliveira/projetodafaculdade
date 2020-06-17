package faculdade;

public class Conta { 
	protected Double saldo;

	public Conta() {
		
		this.saldo = 1500.0;
	}

public double sacar (double valor) {
	return this.saldo -= valor;
}

public double depositar(double valor) {
	return this.saldo += valor;
}

public double atualiza(double taxa) {
	return this.saldo+= saldo* taxa / 100;
}

public Double getSaldo() {
	return saldo;
}


	
	
}
