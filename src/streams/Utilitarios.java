package streams;

import java.util.function.UnaryOperator;

public interface Utilitarios {

	public final static UnaryOperator<Double> multiplicar = n -> n * 2;

	public final static UnaryOperator<Double> dividir = n -> n / 2;

	public static String plusTen(Double n) {
		return n + " + 10 é = " + (n + 10.0);
	}

}
