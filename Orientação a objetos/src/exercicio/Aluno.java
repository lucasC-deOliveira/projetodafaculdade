package exercicio;

import java.util.ArrayList;

public class Aluno {
protected String nome;
protected String data;
protected int matricula;

public Aluno(String nome, String data, int matricula) {
	super();
	this.nome = nome;
	this.data = data;
	this.matricula = matricula;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

public int getMatricula() {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}



}
