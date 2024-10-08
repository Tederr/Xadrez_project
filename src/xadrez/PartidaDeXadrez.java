package xadrez;

import quadroDeTabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro;

	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		configuracaoInicial();
	}

	public PecaDeXadrez[][] getPecas() {
		PecaDeXadrez[][] matriz = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				matriz[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
			}
		}
		return matriz;
	}

	private void novoLugarDePeca(char coluna, int linha, PecaDeXadrez peca) {
		tabuleiro.lugarDaPeca(peca, new PosicaoDeXadrez(coluna, linha).toPosicao());
	}

	private void configuracaoInicial() {
		novoLugarDePeca('c', 1, new Torre(tabuleiro, Cor.BRANCO));
		novoLugarDePeca('c', 2, new Torre(tabuleiro, Cor.BRANCO));
		novoLugarDePeca('d', 2, new Torre(tabuleiro, Cor.BRANCO));
		novoLugarDePeca('e', 2, new Torre(tabuleiro, Cor.BRANCO));
		novoLugarDePeca('e', 1, new Torre(tabuleiro, Cor.BRANCO));
		novoLugarDePeca('d', 1, new Rei(tabuleiro, Cor.BRANCO));

		novoLugarDePeca('c', 7, new Torre(tabuleiro, Cor.PRETO));
		novoLugarDePeca('c', 8, new Torre(tabuleiro, Cor.PRETO));
		novoLugarDePeca('d', 7, new Torre(tabuleiro, Cor.PRETO));
		novoLugarDePeca('e', 7, new Torre(tabuleiro, Cor.PRETO));
		novoLugarDePeca('e', 8, new Torre(tabuleiro, Cor.PRETO));
		novoLugarDePeca('d', 8, new Rei(tabuleiro, Cor.PRETO));

	}
}
