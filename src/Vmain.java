
public class Vmain {
	public static void main(String[] args) {
		Curso ads = new Curso();
		ads.nomeCurso = "ADS";

		Serie quatro = new Serie();
		Serie dois = new Serie();
		quatro.serie = 4;
		dois.serie = 2;

		Diciplina ltpiv = new Diciplina();
		Diciplina so = new Diciplina();
		ltpiv.diciplina = "LTPIV";
		so.diciplina = "SO";

		// Dados Anderson
		Nota notaAnderson = new Nota();
		notaAnderson.nota = 1.5;
		notaAnderson.NotaDiciplina = "LTPIV";
		Aluno objAnderson = new Aluno("Anderson", ads, quatro, ltpiv, notaAnderson);
		objAnderson.imprimeAluno();

		// Dados Joao
		Nota notaJoao = new Nota();
		notaJoao.nota = 9.8;
		notaJoao.NotaDiciplina = "LTPIV";
		Aluno objJoao = new Aluno("Joao", ads, quatro, ltpiv, notaJoao);
		objJoao.imprimeAluno();

		// Dados Joaquim
		Nota notaJoaquim = new Nota();
		notaJoaquim.nota = 7.8;
		notaJoaquim.NotaDiciplina = "SO";
		Aluno objJoaquim = new Aluno("Joaquim", ads, dois, so, notaJoaquim);
		objJoaquim.imprimeAluno();

		// Dados Maria
		Nota notaMaria = new Nota();
		notaMaria.nota = 3.4;
		notaMaria.NotaDiciplina = "SO";
		Aluno objMaria = new Aluno("Maria", ads, dois, so, notaMaria);
		objMaria.imprimeAluno();

		// Dados Anderson
		Nota notaAnderson2 = new Nota();
		notaAnderson2.nota = 5.4;
		notaAnderson2.NotaDiciplina = "SO";
		Aluno objAnderson2 = new Aluno("Anderson", ads, quatro, so, notaAnderson2);
		objAnderson2.imprimeAluno();

		Faculdade objFaculdade = new Faculdade();

		objFaculdade.dados.add(objAnderson);
		objFaculdade.dados.add(objJoao);
		objFaculdade.dados.add(objJoaquim);
		objFaculdade.dados.add(objMaria);
		objFaculdade.dados.add(objAnderson2);

		objFaculdade.medias();

	}

}
