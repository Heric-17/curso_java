package abstratos;

public class Vida {
	
	public static void main(String[] args) {
		
		
		Mamifero lessie = new Cachorro();
		
		lessie.mover();
		
		lessie.mamar(); //Dessa cor pois mamar foi implementado em cachorro
		
		lessie.dar_a_luz();
		
		lessie.respirar();
		
//		lessie.latir();
	}

}
