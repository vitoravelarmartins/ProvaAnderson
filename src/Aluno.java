
public class Aluno {
	String nome;
	Curso cursoAluno = new Curso();
	Serie serieAluno = new Serie();
	Diciplina diciplinaAluno = new Diciplina();

	public Aluno(String nome, Curso cursoAluno, Serie serieAluno, Diciplina diciplinaAluno) {
		super();
		this.nome = nome;
		this.cursoAluno = cursoAluno;
		this.serieAluno = serieAluno;
		this.diciplinaAluno = diciplinaAluno;

	}

	public void imprimeAluno() {
		System.out.println("Nome: " + this.nome + "\n" + "Curso: " + this.cursoAluno.nomeCurso + "\n" + "Serie: "
				+ this.serieAluno.serie + "\n" + "Diciplina: ");
		
		for (Nota nota0 : this.diciplinaAluno.Diciplina) {
			System.out.println(nota0.diciplina + " " + nota0.nota);
		}
		

	}
	
	

//Vitor

}
