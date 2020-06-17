package faculdade;

public class ContaCorrente extends Conta{


	
	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double atualiza(double taxa) {
		return this.saldo+= saldo* 2* taxa / 100;
	}

	public double depositar(double valor) {
		return this.saldo += valor - 0.10;
	}
	
}
