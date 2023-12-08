package excecao.personalizadas.naoChecadas;

public class IdadeException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public IdadeException() {
	
	}
	
	@Override
	public String getMessage() {
		return "Idade não pode ser menor que 0";
	}
	
	

}
