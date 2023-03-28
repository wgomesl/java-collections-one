
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
		
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
	}
	
}
