package streams;

public class Media {

	private double total;
	private int quantidade;
	
	public Media() {
		
	}

	public Media adicionar(double valor) {
		quantidade++;
		this.total += valor;

		return this;
	}
	
	public double getMedia() {
		return total / quantidade;
	}
	
	public static Media combinarMedias(Media m1, Media m2) {
		Media newMedia = new Media();
		
		newMedia.quantidade = m1.quantidade + m2.quantidade;
		newMedia.total = m1.total + m2.total;
		
		return newMedia;
	}
	
	@Override
	public String toString() {
		return total + " - " + quantidade ;
	}
	
	
}
