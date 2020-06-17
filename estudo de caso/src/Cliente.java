
public class Cliente extends Pessoa  {
private double saldo;

public Cliente(String nome, String endereço, double saldo) {
	super(nome, endereço);
	this.saldo = saldo;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}
 


}
