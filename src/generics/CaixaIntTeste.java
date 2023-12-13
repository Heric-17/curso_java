package generics;

public class CaixaIntTeste<T> {
	
	public static void main(String[] args) {
		
		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(25);
		
		System.out.println(caixaA.abrir());
		
		
	}

}
