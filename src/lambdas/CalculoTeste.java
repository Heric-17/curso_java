package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class CalculoTeste {

	public static void main(String[] args) {

		Calculo calc = new Soma();
		System.out.println(calc.executar(5, 7));

		
		Calculo multi = new Multiplicacao();
		System.out.println(multi.executar(6, 7));
		
		
		calc = new Multiplicacao();
		System.out.println(calc.executar(10, 10));
	
		List<Double> numeros = new ArrayList<Double>();
		
		numeros.add(4.6);
		numeros.add(5.6);
		numeros.add(80.6);
		
		System.out.println();
		System.out.println();
		
		Multiplicacao m = new Multiplicacao();
		
		//Method Reference por instância
		numeros.forEach(m::testMethodReferenceMudarValor);	

		//Method Reference por metodo estático
		numeros.forEach(Multiplicacao::testMethodReferenceImprimir);
		
		
		// Testando method 
		BinaryOperator<Double> numeros_2 = Multiplicacao::testeDeMethodReferenceMaisDeUmArg;

		System.out.println(numeros_2.apply(5.5, 8.6));
	

	}
}
