import java.util.ArrayList;

public class Faculdade {
	ArrayList<Aluno> dados = new ArrayList<>();
	
	

	public void medias() {
		double valorADS = 0;
		double valor4 = 0;
		double valorAnd = 0;
		double valorSO = 0;
		int cont= 0;
		for (Aluno alunos1 : dados) {
			//System.out.println(alunos1.nome + " " + alunos1.cursoAluno.nomeCurso + " " + alunos1.serieAluno.serie + " "
				//	+ alunos1.notaAluno.NotaDiciplina + " " + alunos1.notaAluno.nota);
			cont=cont+1;

			if (alunos1.cursoAluno.nomeCurso == "ADS") {
				valorADS=valorADS+alunos1.notaAluno.nota;
				
				}
			if (alunos1.serieAluno.serie == 4) {
				valor4=valor4+alunos1.notaAluno.nota;
				
				}
			if (alunos1.nome == "Anderson") {
				valorAnd=valorAnd+alunos1.notaAluno.nota;
				
				}
			if (alunos1.notaAluno.NotaDiciplina == "SO") {
				valorSO=valorSO+alunos1.notaAluno.nota;
				
				}
		}
		System.out.println("Media Nota ADS: "+valorADS/cont);
		System.out.println("Media Nota Serie 4: "+valor4/cont);
		System.out.println("Media Nota Andersom: "+valorAnd/cont);
		System.out.println("Media Nota SO: "+valorSO/cont);
	}
	
	//Vitor

}
