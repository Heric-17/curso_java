package heranca;

public class Jogador {
	
	public int vida = 100;
	
	public int x;
	public int y;
	
	public boolean atacar(Jogador jogador) {
		
		int deltaX = Math.abs(this.x - jogador.x);
		int deltaY = Math.abs(this.y - jogador.y);
		
		int distancia = deltaX + deltaY;
		
		if(distancia == 1 || distancia == 0) {
			jogador.vida = vida - 10;
			return true;
		}
		return false;
	}
	
	public boolean andar(String direcao) {
		if(direcao.equalsIgnoreCase("norte")) {
			y--;
		};
		return true;
	}
	
	public boolean andar(Direcao direcao) {
		if(direcao == Direcao.NORTE) {
			y--;
		};
		return true;
	}
	
}
