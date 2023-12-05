package heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean turbo_on = false;

	private boolean air_on = false;

	public Ferrari() {
		this(300);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void turboToggle() {
		if (turbo_on) {
			turbo_on = false;
		} else {
			turbo_on = true;
		}
	}

	@Override
	public void air_toggle() {
		if (air_on) {
			air_on = false;
		} else {
			air_on = true;
		}
	}

	@Override
	public int getDelta() {
		if (turbo_on && !air_on) {
			setDelta(30);
		} else if (turbo_on && air_on) {
			setDelta(25);
		} else if (!turbo_on && !air_on) {
			setDelta(15);
		} else {			
			setDelta(10);
		}
		return 1;
	}

}
