
public class Pessoa {

	//Atributos
	String nomeAt;
	int idadeAt;
	Endereco enderecoAt;
	
	//Construtores
	public Pessoa() {
		
	}
	
	public Pessoa(String nomePar, int idadePar) {
		this.nomeAt = nomePar;
		this.idadeAt = idadePar;

	}

	//Getters
	public String getNome() {
		return nomeAt;
	}
	
	public int getIdade() {
		return idadeAt;
	}

	//Setters
	public void setNome(String nomePar) {
		this.nomeAt = nomePar.toUpperCase(); //Tudo maiúscula
	}
	
	public void setIdade(int idadePar) {
		this.idadeAt = idadePar;
	}

}
