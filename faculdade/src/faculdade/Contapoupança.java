package faculdade;

public class Contapoupança extends Conta {

	public Contapoupança() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double atualiza(double taxa) {
		return this.saldo+= saldo * 3 * taxa / 100;
	}

}
