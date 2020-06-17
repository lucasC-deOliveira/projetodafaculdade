
public class Pessoa {
 protected String nome;
 protected String endereço;
 
public Pessoa(String nome, String endereço) {
	super();
	this.nome = nome;
	this.endereço = endereço;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEndereço() {
	return endereço;
}

public void setEndereço(String endereço) {
	this.endereço = endereço;
}
 
}
