import java.util.HashMap;

public class BancodeReclamações {

	HashMap <Integer,Reclamação> reclamaçoes = new HashMap();
	
	
	public void ADDreclamação(Reclamação reclamação) {
		reclamaçoes.put(reclamação.getNReclamação(), reclamação);
	}
	
	public void ExcluirReclamação(int Nreclamação) {
		reclamaçoes.remove(Nreclamação);
	}
	public Reclamação  ConsultarReclamação(int Nreclamação) {
		return reclamaçoes.get(Nreclamação);
		
		
	}
	
	
	
}
