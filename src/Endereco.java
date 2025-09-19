
public class Endereco {

	//Atributos
	String ruaAt;
	String cidadeAt;
	String estadoAt;

	//Construtores
	public Endereco(String ruaPar, String cidadePar, String estadoPar){
		this.ruaAt = ruaPar;
		this.cidadeAt = cidadePar;
		this.estadoAt = estadoPar;
	}
	
	//Setters
	public void setRua(String ruaPar){
		this.ruaAt = ruaPar;
	}

	public void setCidade(String cidadePar){
		this.cidadeAt = cidadePar;
	}
	
	public void setEstado(String estadoPar){
		this.estadoAt = estadoPar;
	}
	
	//Getters
	public String getRua(){
		return ruaAt;
	}
	
	public String getCidade(){
		return cidadeAt;
	}

	public String getEstado(){
		return estadoAt;
	}

}
