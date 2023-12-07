package streams;

public class MediaTeste {
	public static void main(String[] args) {
		
		Media m1 = new Media();
		Media m2 = new Media();
		
		//7.5
		m1.adicionar(5.0).adicionar(10.0);
		
		//15
		m2.adicionar(10.0).adicionar(20.0);
		
		System.out.println(m1.getMedia());
		System.out.println(m2.getMedia());
		
		Media combinadas = Media.combinarMedias(m1, m2);
		
		System.out.println(combinadas.getMedia());
		
	}

}
