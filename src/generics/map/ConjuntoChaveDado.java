package generics.map;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import generics.exceptions.ChavesComEsseDadoNaoExistem;
import generics.exceptions.DadoComEssaChaveNaoExisteException;

public class ConjuntoChaveDado<C extends Number, D> {

	private final Set<ChaveDado<C, D>> conjunto = new LinkedHashSet<>();

//	TODO adiciona ao conjunto

	public void adicionar(C chave, D dado) {
		if (chave == null || dado == null) {
			throw new NullPointerException("Nem chave nem valor podem ser nulos");
		}

		ChaveDado<C, D> chaveDado = new ChaveDado<>(chave, dado);

		if (conjunto.contains(chaveDado)) {
			conjunto.remove(chaveDado);
		}

		conjunto.add(chaveDado);
	}

//	TODO Pega o dado associado a uma chave

	public D getDado(C chave) {
		if (chave == null) {
			throw new NullPointerException();
		}

		Optional<ChaveDado<C, D>> opcionalDado = conjunto.stream().filter(cd -> cd.getChave().equals(chave))
				.findFirst();

		if (opcionalDado.isPresent()) {
			return opcionalDado.get().getDado();
		}

		throw new DadoComEssaChaveNaoExisteException(chave);
	}

//	TODO Pega todas as chaves que possuem o dado passado

	public List<C> getChavesbyDado(D dado) {
//		TODO implementar algo que consiga realizar a verificação independente do tipo de dado passado

		List<C> chaves = new ArrayList<>();

		conjunto.stream().filter(cd -> cd.getDado().equals(dado)).map(cd -> cd.getChave()).forEach(chaves::add);

		if (chaves.isEmpty()) {
			throw new ChavesComEsseDadoNaoExistem();
		}
		
		return chaves;
	}

}
