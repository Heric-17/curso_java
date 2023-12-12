package generics;

public class CaixaObjetoGenerics<TIPO> {

	private TIPO coisa;

	public void guardar(TIPO coisa) {
		this.coisa = coisa;
	}

	public TIPO abrir() {
		return coisa;
	}

}
