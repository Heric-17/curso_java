package streams;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public interface Utilitarios {
	
	//Interfaces podem conter atributos e metodos estáticos
	
	//Essa interface poderia ser substituida por uma classe com contrutor privado para não poder ser instanciada.

	public final static UnaryOperator<Double> multiplicar = n -> n * 2;

	public final static UnaryOperator<Double> dividir = n -> n / 2;

	public static String plusTen(Double n) {
		return n + " + 10 é = " + (n + 10.0);
	}
	
	public final static Function<Integer, String> numToBinaryString = (num) -> {
		return Integer.toBinaryString(num);
	};
	
	public final static  UnaryOperator<String> reverseString = (text) -> {
		StringBuilder stBuilder = new StringBuilder(text);
		stBuilder = stBuilder.reverse();
		
		return stBuilder.toString();
	};
	
	public final static  Function<String, Integer> stringToNumber = (text) -> {
		Integer number = Integer.parseUnsignedInt(text, 2); 
		
		return number;
	};
	
	public final static  Predicate<Aluno> condition = (n) -> {
		return n.getNota() >= 7.0;
	};
	
	
	

}
