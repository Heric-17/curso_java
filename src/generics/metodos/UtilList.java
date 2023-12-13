package generics.metodos;

import java.util.List;

public class UtilList {
	
	public static Object getUltimo(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	
	public static <T> T getUltimoGeneric(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public <A, B, C> C getTeste(A paramA, B paramB) {
		
		C retorno = null;
		return retorno;
	}
	

}
