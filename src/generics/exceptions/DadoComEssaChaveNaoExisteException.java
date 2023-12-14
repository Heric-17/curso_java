package generics.exceptions;

public class DadoComEssaChaveNaoExisteException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	private Number chave;
	
	public DadoComEssaChaveNaoExisteException(Number chave) {
		this.chave = chave;
	}
	
	@Override
	public String getMessage() {
		
		String chaveString = chave.toString();
		
		return String.format("Não há nenhum registro com a chave: %s", chaveString);
	}
	
}
