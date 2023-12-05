package heranca.teste;

import heranca.desafio.Celta;
import heranca.desafio.Ferrari;

public class Corrida {
	public static void main(String[] args) {
	
		Celta c = new Celta();
		
		Ferrari f = new Ferrari();
		
		c.acelerar();
		f.acelerar();
		
		System.out.println("Velocidade atual do Celta: " + c.velocidadeAtual);
		System.out.println("Velocidade atual do Celta: " + f.velocidadeAtual);
				
		c.frear();
		c.frear();
		c.frear();
		f.frear();
		f.frear();
		f.frear();

		System.out.println("Velocidade atual do Celta: " + c.velocidadeAtual); 
		System.out.println("Velocidade atual do Celta: " + f.velocidadeAtual);
		
		c.frear();
		c.frear();
		c.frear();
		f.frear();
		f.frear();
		f.frear();
		
		System.out.println("Velocidade atual do Celta: " + c.velocidadeAtual);
		System.out.println("Velocidade atual do Celta: " + f.velocidadeAtual);
	}

}
