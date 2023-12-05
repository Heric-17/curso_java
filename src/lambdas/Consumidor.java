package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		Produto p1 = new Produto("prod1", 100.0, 0.5);
		Produto p2 = new Produto("prod2", 200.0, 0.5);
		Produto p3 = new Produto("prod3", 300.0, 0.5);
		Produto p4 = new Produto("prod4", 400.0, 0.5);
		
		Consumer<Produto> imprimir = produto -> System.out.println(produto.nome);
		imprimir.accept(p1);
 
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);		
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
