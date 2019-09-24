
public class Aluno {
	String nome;
	Curso cursoAluno = new Curso();
	Serie serieAluno = new Serie();
	Diciplina diciplinaAluno = new Diciplina();
	Nota notaAluno = new Nota();
	
	public Aluno(String nome, Curso cursoAluno, Serie serieAluno, Diciplina diciplinaAluno, Nota notaAluno) {
		super();
		this.nome = nome;
		this.cursoAluno = cursoAluno;
		this.serieAluno = serieAluno;
		this.diciplinaAluno = diciplinaAluno;
		this.notaAluno = notaAluno;
	}
	
	
	public void imprimeAluno() {
		System.out.println(
				"Nome: "+this.nome+"\n"+
				"Curso: "+this.cursoAluno.nomeCurso+"\n"+
				"Serie: "+this.serieAluno.serie+"\n"+
				"Diciplina: "+this.diciplinaAluno.diciplina+"\n"+
				"Nota: "+this.notaAluno.nota+"\n"
				);
		
	}
	



}
