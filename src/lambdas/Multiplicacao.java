package lambdas;

public class Multiplicacao implements Calculo {
	
	public double num = 5;
	
	@Override
	public double executar(double a, double b) {
		return a * b;
	}
	
	public static void testMethodReferenceImprimir(double num) {
		System.out.println("O valor é: " + num);
	}
	
	public void testMethodReferenceMudarValor(double num) {
		this.num = num;
		System.out.println("O valor de num é: " + this.num);
		
	}
	
	public static Double testeDeMethodReferenceMaisDeUmArg(double a, double b) {
		return a + b;
	}

}
