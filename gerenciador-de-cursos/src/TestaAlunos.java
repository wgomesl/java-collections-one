import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


public class TestaAlunos {
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("João da Silva");
		alunos.add("Maria da Silva");
		alunos.add("Jorge da Silva");
		
		boolean joaoEstaMatriculado = alunos.contains("João da Silva");
		alunos.remove("Jorge da Silva");
		System.out.println(joaoEstaMatriculado);
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);

	}
}
