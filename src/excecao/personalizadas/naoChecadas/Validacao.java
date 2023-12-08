package excecao.personalizadas.naoChecadas;

public interface Validacao {

	public static boolean usuario(Usuario usuario) {
		
		if(usuario == null) {			
			throw new IllegalArgumentException("Usuário não pode ser nulo");
		} 
		
		if(usuario.getNome() == null || usuario.getNome().trim().isEmpty()) {
			throw new CampoVazioException("nome");
		}
		
		if(usuario.getIdade() < 0) {
			throw new IdadeException();
		}
		
		return true;
		
	}

}
