package lambdas;

import java.util.function.Predicate;

public class Predicado_dois {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPair = num -> num % 2 == 0;

		Predicate<Integer> isTreeDigits = num -> num >= 100 && num <= 999;

		System.out.println(isPair.and(isTreeDigits).negate().test(477));
		
		System.out.println(isPair.or(isTreeDigits).test(77));
		
		
	}

}
