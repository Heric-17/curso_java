package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MethodMap {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		
		//Map serve para transformar uma Stream em outra Stream
		List<Double> notas = Arrays.asList(2.5, 3.8, 9.9);
		
//		Stream<Double> notasXDois = notas.stream().map(n  -> n * 2);
		
		UnaryOperator<Double> notasMenosDois = n  -> n - 2;
		
//		Stream<Double> notasDivideTres = notas.stream().map(n  -> n / 2);
		
//		Interface utilitaria 
		notas.stream()
			 .map(Utilitarios.multiplicar)
			 .map(notasMenosDois)
			 .map(Utilitarios::plusTen)
			 .forEach(print);
		
		
	}

}
