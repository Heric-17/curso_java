package generics.map;

import java.util.Objects;

public class ChaveDado<C, D> {

	private C chave;

	private D dado;

	public ChaveDado(C chave, D dado) {
		this.chave = chave;
		this.dado = dado;
	}

	public void setChave(C chave) {
		this.chave = chave;
	}

	public void setDado(D dado) {
		this.dado = dado;
	}

	public D getDado() {
		return dado;
	}

	public C getChave() {
		return chave;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chave);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChaveDado<?, ?> other = (ChaveDado<?, ?>) obj;
		return Objects.equals(chave, other.chave);
	}
	
	

}
