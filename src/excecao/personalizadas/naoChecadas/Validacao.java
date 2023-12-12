package excecao.personalizadas.naoChecadas;

import excecao.personalizadas.checadas.NaoPodeNuloException;

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
	
	public static boolean isNull(String texto) throws NaoPodeNuloException{
		if(texto != null) {
			return false;
		}
		
		throw new NaoPodeNuloException(); 
	}

}
