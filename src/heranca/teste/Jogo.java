package heranca.teste;

import heranca.Direcao;
import heranca.Heroi;
import heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Heroi j1 = new Heroi();
		Monstro j2 = new Monstro();

		j1.y = 10;
		j1.x = 30;

		j2.y = 8;
		j2.x = 30;

		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);

		System.out.println(j1.vida);
		System.out.println(j2.vida);

		j1.atacar(j2);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);

	}
}
