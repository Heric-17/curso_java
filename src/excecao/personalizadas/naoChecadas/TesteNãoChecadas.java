package excecao.personalizadas.naoChecadas;

public class TesteNãoChecadas {
	
	public static void main(String[] args) {
		
		Usuario user = new Usuario();
		
		user.setNome("Heric");
		
		try {
			Validacao.usuario(user);			
		}catch(IdadeException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println(user);			
		}
		
	}

}
