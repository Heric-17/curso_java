package excecao.personalizadas.checadas;

import excecao.personalizadas.naoChecadas.Validacao;

public class TesteChecadas {

	private static String testando;

	public static void main(String[] args) {

		try {
			Validacao.isNull(testando);
		} catch (NaoPodeNuloException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalizando");
		}

	}
}
