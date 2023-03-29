import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Wesley Gomes");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Wesley Gomes", 34672);
		Aluno a2 = new Aluno("Rogério Souza", 47421);
		Aluno a3 = new Aluno("Maria Eduarda", 47323);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});
		
		System.out.println("O aluno " + a1 + " está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		
		Aluno ricardo = new Aluno("Ricardo Alface", 36853);
		System.out.println("E esse Ricardo, está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(ricardo));
		
		
		System.out.println("O a1 é equals ao ricardo?");
		System.out.println(a1.equals(ricardo));
		
		// obrigatoriamente o seguinte é true:
		
		System.out.println(a1.hashCode() == ricardo.hashCode());
	}
	
}
