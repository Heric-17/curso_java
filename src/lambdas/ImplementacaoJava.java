package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ImplementacaoJava {

	public static void main(String[] args) {

		BinaryOperator<Double> calc = (x, y) -> x * y;

		System.out.println(calc.apply(5.0, 4.0));

		List<String> alunos = new ArrayList<String>();
		
		alunos.add("Heric");
		alunos.add("Lopes");
		alunos.add("Santos");
		alunos.add("Lucas");
		
		
		alunos.forEach(System.out::println);

	}

}
