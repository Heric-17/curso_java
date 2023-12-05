package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		 
		Predicate<Produto> isExpansive = (produto) -> {
			return produto.preco - (produto.preco * produto.desconto) >= 5;
		}; 
		
		Produto prod = new Produto("caneta", 10.0, 0.5);
		System.out.println(isExpansive.test(prod));
	}
}
