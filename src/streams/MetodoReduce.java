package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class MetodoReduce {
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> somaFinal = (a, b) ->  a + b;
	
//		stream() executa de forma sequencial
		Optional<Integer> somaTalvez = numeros.stream().reduce(somaFinal);
		
		if(somaTalvez.isPresent()) {
			System.out.println(somaTalvez.get());
		}
		
//		stream() executa de forma sequencial
		Integer somaTalvez2 = numeros.stream().reduce(5, somaFinal);
		
		if(somaTalvez2 != null) {
			System.out.println("\n" + somaTalvez2);
		}
		
		
		List<Integer> numeros2 = Arrays.asList(1, 2, 3);
		
//		parallelStream() Considera o valor inicial múltiplas vezes
		int soma = numeros2.parallelStream().reduce(10, somaFinal);
		System.out.println("\n" + soma);
	}

}
