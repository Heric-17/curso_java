package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {

		System.out.println("#SEM GENERICS \n");
		CaixaObjetoSemGenerics caixaSemGenerics = new CaixaObjetoSemGenerics();

		caixaSemGenerics.guardar(2.0);

		Double coisaA = (Double) caixaSemGenerics.abrir();
		System.out.println(coisaA);

		CaixaObjetoSemGenerics b = new CaixaObjetoSemGenerics();

		b.guardar("texto");

		String coisaB = (String) b.abrir();
		System.out.println(coisaB);
		
		System.out.println("\n\n#COM GENERICS \n");

		CaixaObjetoGenerics<String> caixaComGenerics = new CaixaObjetoGenerics<>();

		caixaComGenerics.guardar("Teste com generics");
		String texto = caixaComGenerics.abrir();

		System.out.println(texto);

		CaixaObjetoGenerics<Double> caixaComGenericsB = new CaixaObjetoGenerics<>();

		caixaComGenericsB.guardar(2.5);
		Double numero = caixaComGenericsB.abrir();

		System.out.println(numero);

	}

}
