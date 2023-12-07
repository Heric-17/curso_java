package streams.desafios;

import java.util.Arrays;
import java.util.List;

import streams.Utilitarios;

public class DesafioMap {
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//		1. NUmero para string binaria... 6 = "110"
//		2. Inverter a string... "110" = "011"
//		3. Converter de volta para inteiro "011" = 3

		nums.stream()
		.map(Integer::toBinaryString)
		.map(Utilitarios.reverseString)
		.map(Utilitarios.stringToNumber)
		.forEach(System.out::println);
	}

}
