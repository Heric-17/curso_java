package heranca.desafio;

public class Carro {

	private final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;

	protected int delta = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			this.velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			this.velocidadeAtual += getDelta();
		}
	}

	public void frear() {
		if (velocidadeAtual <= 0) {
			velocidadeAtual = 0;
			this.velocidadeAtual -= 5;
		}
	}

	public int getDelta() {
		return this.delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

}
