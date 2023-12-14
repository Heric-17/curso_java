package generics.map;

public class ChaveDadoTeste {
	public static void main(String[] args) {

		ConjuntoChaveDado<Integer, String> nomes = new ConjuntoChaveDado<Integer, String>();

		nomes.adicionar(1, "Heric");
		nomes.adicionar(2, "Larissa");
		nomes.adicionar(3, "Melody");
		nomes.adicionar(4, "Kailane");
		nomes.adicionar(5, "Kayk");
		nomes.adicionar(6, "Heric");
		nomes.adicionar(7, "Heric");
		nomes.adicionar(2, "Joao");

		System.out.println(nomes.getDado(7));
		
		System.out.println(nomes.getChavesbyDado("Kayk"));
	}

}
