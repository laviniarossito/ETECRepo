
public class ClassePrincipal {

	public static void main(String[] args) {

		//Objeto = Instância da classe
		Pessoa victor = new Pessoa();
		Pessoa luiz = new Pessoa("Luis", 16);
		Pessoa rafael = new Pessoa();
		
		luiz.setNome("Luiz");
		
		System.out.println(victor.getNome());
		System.out.println(luiz.getNome());

	}

}
