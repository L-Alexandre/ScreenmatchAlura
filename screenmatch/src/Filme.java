public class Filme {
	String nome;
	int anoDeLancamento;
	private int totalDeAvaliacoes;
	int duracaoEmMinutos;
	boolean incluidoNoPlano;
	private double somaDasavaliacoes;
	
	int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}

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