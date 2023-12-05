package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> isPair = (numero) -> {
			if(numero%2 == 0) {				
				return "Par";
			} else {
				return "Impar";
			}
		};
		
		Function<String, String> resposta = valor -> "A resposta é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
	
		String resultado = isPair.andThen(resposta).andThen(empolgado).apply(40); 
		
		System.out.println(resultado);
		
	}

}
