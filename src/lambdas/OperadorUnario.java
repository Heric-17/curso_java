package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> divideDois = n -> n / 2;
		UnaryOperator<Integer> aoCubo = n -> n * n * n;
		
		int resultado = maisDois.andThen(vezesDois).andThen(divideDois).andThen(aoCubo).apply(7);
		
		System.out.println(resultado);
	}

}
