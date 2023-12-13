package generics.metodos;

import java.util.Arrays;
import java.util.List;

public class UtilListTeste {
	
	public static void main(String[] args) {
		
		List<String> linguagens = Arrays.asList("C++", "Java", "Go", "JS");
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		String ultimaLinguagem = (String) UtilList.getUltimo(linguagens);
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero = (Integer) UtilList.getUltimo(numeros);
		System.out.println(ultimoNumero);
		
		//Não precisa fazer o cast e díminui a possibilidade de erro
		
		String ultimaLinguagemGeneric = UtilList.getUltimoGeneric(linguagens);
		System.out.println(ultimaLinguagemGeneric);
		
		Integer ultimoNumeroGeneric = UtilList.getUltimoGeneric(numeros);
		System.out.println(ultimoNumeroGeneric);
		
	}

}
