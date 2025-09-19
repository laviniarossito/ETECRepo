
public class Pessoa {

	//Atributos
	String nomeAt;
	int idadeAt;
	Endereco enderecoAt;
	
	//Construtores
	public Pessoa() {
		
	}
	
	public Pessoa(String nomePar, int idadePar, Endereco enderecoPar) {
		this.nomeAt = nomePar;
		this.idadeAt = idadePar;
		this.enderecoAt = enderecoPar;
	}

	//Getters
	public String getNome() {
		return nomeAt;
	}
	
	public int getIdade() {
		return idadeAt;
	}
	
	public Endereco getEndereco(){
		return enderecoAt;

	}

	//Setters
	public void setNome(String nomePar) {
		this.nomeAt = nomePar.toUpperCase(); //Tudo maiúscula
	}
	
	public void setIdade(int idadePar) {
		this.idadeAt = idadePar;
	}

	public void setEndereco(Endereco enderecoPar) {
		this.enderecoAt = enderecoPar;
	}

}
