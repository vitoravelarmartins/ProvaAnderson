
public class Vmain {
	public static void main(String[] args) {
		Curso ads = new Curso();
		ads.nomeCurso = "ADS";

		Serie quatro = new Serie();
		Serie dois = new Serie();
		quatro.serie = "4";
		dois.serie = "2";

		// Dados Anderson
		Diciplina diciplinasAnderson = new Diciplina();
		Nota notaAnderson = new Nota();
		notaAnderson.nota = 1.5;
		notaAnderson.diciplina = "LTPIV";
		diciplinasAnderson.Diciplina.add(notaAnderson);

		Nota notaAnderson2 = new Nota();
		notaAnderson2.nota = 5.4;
		notaAnderson2.diciplina = "SO";
		diciplinasAnderson.Diciplina.add(notaAnderson2);

		Aluno objAnderson = new Aluno("Anderson", ads, quatro, diciplinasAnderson);
		// objAnderson.imprimeAluno();

//		// Dados Joao
		Diciplina diciplinasJoao = new Diciplina();
		Nota notaJoao = new Nota();
		notaJoao.nota = 9.8;
		notaJoao.diciplina = "LTPIV";
		diciplinasJoao.Diciplina.add(notaJoao);
		Aluno objJoao = new Aluno("Joao", ads, quatro, diciplinasJoao);
//		objJoao.imprimeAluno();
//
//		// Dados Joaquim
		Diciplina diciplinasJoaquim = new Diciplina();
		Nota notaJoaquim = new Nota();
		notaJoaquim.nota = 7.8;
		notaJoaquim.diciplina = "SO";
		diciplinasJoaquim.Diciplina.add(notaJoaquim);
		Aluno objJoaquim = new Aluno("Joaquim", ads, dois, diciplinasJoaquim);
//		objJoaquim.imprimeAluno();
//
//		// Dados Maria
		Diciplina diciplinasMaria = new Diciplina();
		Nota notaMaria = new Nota();
		notaMaria.nota = 3.4;
		notaMaria.diciplina = "SO";
		diciplinasMaria.Diciplina.add(notaMaria);
		Aluno objMaria = new Aluno("Maria", ads, dois, diciplinasMaria);
//		objMaria.imprimeAluno();

		Faculdade objFaculdade = new Faculdade();

		objFaculdade.dados.add(objAnderson);
		objFaculdade.dados.add(objJoao);
		objFaculdade.dados.add(objJoaquim);
		objFaculdade.dados.add(objMaria);

		objFaculdade.medias("ADS");
		objFaculdade.medias("4");
		objFaculdade.medias("Anderson");
		objFaculdade.medias("SO");

	}
	// Vitor

}
