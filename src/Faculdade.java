import java.util.ArrayList;

public class Faculdade {
	ArrayList<Aluno> dados = new ArrayList<>();
	double valor = 0;

	public void medias() {
		int cont= 0;
		for (Aluno alunos1 : dados) {
			System.out.println(alunos1.nome + " " + alunos1.cursoAluno.nomeCurso + " " + alunos1.serieAluno.serie + " "
					+ alunos1.notaAluno.NotaDiciplina + " " + alunos1.notaAluno.nota);
			cont=cont+1;

			if (alunos1.cursoAluno.nomeCurso == "ADS") {
				
				valor=valor+alunos1.notaAluno.nota;

				System.out.println(valor/cont);
				

			}

		}
	}

}
