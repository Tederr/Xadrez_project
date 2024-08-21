package quadroDeTabuleiro;

public class Peca {
	
	protected Posicao posiçao;
	private Tabuleiro tabuleiro;

	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posiçao = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
