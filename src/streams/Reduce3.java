package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Reduce3 {
	
	public static void main(String[] args) {
		
//		BinaryOperator<Media> combinador = Media::combinarMedias;
		
//		Media media = new Media();
		
		Function<Double, Media> adicionarMedia = new Media()::adicionar;

//		Predicate<Double> aprovado = (a) -> a >= 7 ;
		
		Function<Aluno, Double> getNotas = (a) -> a.getNota();
		
		Aluno a1 = new Aluno("Heric", 4.5);
		Aluno a2 = new Aluno("Ana", 9);
		Aluno a3 = new Aluno("Lopes", 7.5);
		Aluno a4 = new Aluno("Kay", 4.9);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		alunos.stream().map(getNotas).map((n) -> new Media().adicionar(n)).forEach(m -> System.out.println(m));
		
		alunos.stream().map(getNotas).map(adicionarMedia).forEach(m -> System.out.println(m));
		
//		alunos.stream().map(getNotas).filter(aprovado).reduce()
		
		
		
		
		
		
	}

}
