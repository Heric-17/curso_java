package streams;

import java.util.Arrays;
import java.util.List;

public class MetodoFilter {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("Heric", 4.5);
		Aluno a2 = new Aluno("Ana", 9);
		Aluno a3 = new Aluno("Lopes", 7.5);
		Aluno a4 = new Aluno("Kay", 4.9);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		alunos.stream().filter(Utilitarios.condition).map((a) -> {
			return "Os alunos aprovados são: " + a.getNome();
		}).forEach(System.out::println);

	}

}
