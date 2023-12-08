package excecao.personalizadas.naoChecadas;

public class Usuario {

	private String nome;

	private byte idade;

	public Usuario() {

	}

	public Usuario(String nome, String email, byte idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public short getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", idade=" + idade + "]";
	}

}
