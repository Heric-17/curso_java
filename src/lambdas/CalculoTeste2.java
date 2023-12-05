package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		Calculo funcao = (x, y) -> x * y;

		System.out.println(funcao.executar(10, 5));

		funcao = (x, y) -> {
			return x + y;
		};

		System.out.println(funcao.executar(50, 9));

	}
}
