package lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		
		Function<Produto, Double> precoReal = prod -> prod.preco - (prod.preco * prod.desconto);
		
		UnaryOperator<Double> impostoMunicipal = (preco) -> {
			return preco >= 2500 ? preco + (preco * 0.085) : preco;
		};
		
		UnaryOperator<Double> frete = (preco) -> {
			return preco >= 3000 ? preco + 100 : preco + 50;
		};
		
		Function<Double, String> arredondar = preco -> {
			String casaDecimal = new DecimalFormat("0.00").format(preco);
			String pontoEVirgula = casaDecimal.replace(".", ",");
			return "R$" + pontoEVirgula;
		};
		
		System.out.println(precoReal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).apply(p));
		
	}

}
