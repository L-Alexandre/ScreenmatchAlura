public class Filme {
	String nome;
	int anoDeLancamento;
	int totalDeAvaliacoes;
	int duracaoEmMinutos;
	boolean incluidoNoPlano;
	double somaDasavaliacoes;

	void exibeFichatecnica() {
		System.out.println("Nome do Filme:" + nome);
		System.out.println("Ano de Lançamento: " + anoDeLancamento);
	}

	void avalia(double nota) {
		somaDasavaliacoes += nota;
		totalDeAvaliacoes++;
	}
	
	double pegaMedia(){
		return somaDasavaliacoes / totalDeAvaliacoes;
	}
}
