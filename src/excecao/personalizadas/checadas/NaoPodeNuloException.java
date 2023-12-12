package excecao.personalizadas.checadas;

public class NaoPodeNuloException extends Exception{
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "O valor passado é nulo";
	}
	

}
