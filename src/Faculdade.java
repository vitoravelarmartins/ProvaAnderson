import java.util.ArrayList;

public class Faculdade {
	ArrayList<Aluno> dados = new ArrayList<>();

	public void medias(String props) {
		double valorCurso = 0;
		double valor4 = 0;
		double valorPessoal = 0;
		double valorSO = 0;

		int cont = 0;
		int contDiciplina = 0;

		String capNome = null;

		for (Aluno alunos1 : dados) {
			// System.out.println(alunos1.nome + " " + alunos1.cursoAluno.nomeCurso + " " +
			// alunos1.serieAluno.serie);

			ArrayList<Nota> getNotas = alunos1.diciplinaAluno.Diciplina;

			for (Nota nota1 : getNotas) {
				// System.out.println(nota1.diciplina + " " + nota1.nota);

				if (alunos1.cursoAluno.nomeCurso == props) {
					valorCurso += nota1.nota;
					capNome = alunos1.cursoAluno.nomeCurso;
					// contDiciplina+=1;
					// System.out.println("---" + valorCurso);

				} else if (alunos1.nome == props) {
					valorPessoal += nota1.nota;
					capNome = alunos1.nome;
					contDiciplina += 1;
					// System.out.println("---"+capNome);
				} else if (alunos1.serieAluno.serie == props) {
					valorPessoal += nota1.nota;
					capNome = alunos1.serieAluno.serie;
					contDiciplina += 1;
					 //System.out.println("---"+capNome+nota1.nota);
					 
				} else if (nota1.diciplina == props) {
					valorPessoal += nota1.nota;
					capNome = nota1.diciplina;
					contDiciplina += 1;
					// System.out.println("---"+capNome);
				}

				cont = cont + 1;

			}

		}

		if (props == "ADS") {
			System.out.println("Media Nota ADS: " + valorCurso/cont);
		} else if (capNome == props) {
			System.out.println("Media Nota " + capNome + ": " + valorPessoal / contDiciplina);
		}
	}

}
