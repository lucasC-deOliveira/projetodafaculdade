import java.util.Date;


public class Reclamação {

 protected int NReclamação;
 protected int tamanho;
 
 protected int local;
 
 
 protected String rua;
 protected String numero;
 protected String Bairro;
 protected String data;
 protected String localização;
 protected String Situação = "Aguardando reparos";
 protected String valor = "indisponivel";
 
 




public String getLocalização() {
	return localização;
}


public void setLocalização(String localização) {
	this.localização = localização;
}


public String getSituação() {
	return Situação;
}


public void setSituação(String situação) {
	Situação = situação;
}


public String getValor() {
	return valor;
}


public void setValor(String valor) {
	this.valor = valor;
}


public Reclamação(int NReclamação, int tamanho, String localização, String rua, String numero, String bairro,String data) {
	super();
	this.tamanho = tamanho;
	this.localização = localização;
	this.rua = rua;
	this.numero = numero;
	this.Bairro = bairro;

	this.NReclamação = NReclamação;
	
}


public int getNReclamação() {
	return NReclamação;
}

public void setNReclamação(int nReclamação) {
	NReclamação = nReclamação;
}

public int getTamanho() {
	return tamanho;
}

public void setTamanho(int tamanho) {
	this.tamanho = tamanho;
}

public int getLocal() {
	return local;
}

public void setLocal(int local) {
	this.local = local;
}


public String getRua() {
	return rua;
}

public void setRua(String rua) {
	this.rua = rua;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public String getBairro() {
	return Bairro;
}

public void setBairro(String bairro) {
	Bairro = bairro;
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

@Override
public String toString() {
	return  " Reclamação [ NReclamação: " + NReclamação + 
			", nivel de tamanho do buraco: " + tamanho + 
			", rua: " + rua + ", numero:" + numero
			+ ", Bairro: " + Bairro + 
			", data:" + data + 
			", localização do buraco: " + localização + "Situação da reclamação: " +Situação + "valor:" + valor+"]";
}




 

 }
 
 
 
