
public class Principal {
	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.nome = "O poderoso chefão";
		meuFilme.anoDeLancamento = 1970;
		meuFilme.duracaoEmMinutos = 180;

		meuFilme.exibeFichatecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		System.out.println(meuFilme.somaDasavaliacoes);
		System.out.println(meuFilme.totalDeAvaliacoes);
		System.out.println(meuFilme.pegaMedia());
	}
}