package lambdas;

@FunctionalInterface
public interface Calculo {
	
	public double executar(double a, double b);
	
	public default String legal() {
		//Posso usar executar
		
		return "legal " +  executar(2, 5);
	}
}
