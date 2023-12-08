package excecao.personalizadas.naoChecadas;

public class CampoVazioException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private String campo;

	public CampoVazioException(String campo) {
		this.campo = campo;
	}

	@Override
	public String getMessage() {
		return String.format("O campo: '%s' não pode ser vazio", this.campo);
	}
	
	

}
