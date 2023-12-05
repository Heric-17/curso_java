package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {

		Consumer<Object> print = System.out::println;

		Stream<String> langs = Stream.of("Java", "Lua", "JS");

		langs.forEach(print);

		System.out.println();

		String[] maisLangs = { "Phyton", "Lisp", "Perl", "Go" };
		Stream.of(maisLangs).forEach(print);
		
		System.out.println();
		Arrays.stream(maisLangs).forEach(print);;
		
		//Monta uma Stream como um subconjunto da Array (a => elemento) (b < elemento)
//		Arrays.stream(maisLangs, a, b);
		Arrays.stream(maisLangs, 1, 2);
		
		List<String> outrasLangs = new ArrayList<String>();

		outrasLangs.add("Kotlin");
		outrasLangs.add("CSS");
		outrasLangs.add("a");
		outrasLangs.add("b");
		outrasLangs.add("HTML");
		
		System.out.println("\n - Thread unica\n");
		outrasLangs.stream().forEach(print);
		
		System.out.println("\n - Multi Threads\n");
		outrasLangs.parallelStream().forEach(print);
		
		//Stream.generate(() -> "s").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(print);
		
	}

}
