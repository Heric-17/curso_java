package generics.exceptions;

public class ChavesComEsseDadoNaoExistem extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ChavesComEsseDadoNaoExistem() {
		super("Não há chaves com o dado mencionado");
	}

}
