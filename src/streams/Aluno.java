package streams;

public class Aluno {

	private final double nota;

	private final String nome;

	public Aluno(String nome, double nota) {
		this.nota = nota;
		this.nome = nome;
	}
	
	public double getNota() {
		return this.nota;
	}
	
	public String getNome() {
		return this.nome;
	}
	

}
