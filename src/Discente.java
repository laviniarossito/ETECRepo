
public class Discente extends Pessoa {

	//Atributos
	int nota1At;
	int nota2At;
	int nota3At;
	int nota4At;
	
	//Construtores
	public Discente(int nota1Par, int nota2Par, int nota3Par, int nota4Par, String nomePar, int idadePar, Endereco enderecoPar){
		super(String nomePar, int idadePar, Endereco enderecoPar);
		this.nota1At = nota1Par;
		this.nota2At = nota2Par;
		this.nota3At = nota3Par;
		this.nota4At = nota4Par;

	}
}
