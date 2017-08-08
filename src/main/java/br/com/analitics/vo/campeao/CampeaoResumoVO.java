package br.com.analitics.vo.campeao;

import java.util.List;

import br.com.analitics.vo.jogador.JogadorResumoCampeaoVO;

public class CampeaoResumoVO {
	private Long id;

	private String nome;
	private String titulo;
	private String chave;
	
	private Double jogosGanhos;
	private Double kda;
	private Double partidas;
	
	private List<JogadorResumoCampeaoVO> jogadoresCampeao;
	
	public CampeaoResumoVO() {
	}

	public CampeaoResumoVO(Long id, String nome, String titulo, Long numeroVitorias, Double kda, Long partidas,
			String chave) {
		this.id = id;
		this.nome = nome;
		this.titulo = titulo;
		this.kda = kda;
		if(partidas == 0) {
			jogosGanhos = 0d; 
			this.kda = 0d;
		}
		else this.jogosGanhos = numeroVitorias.doubleValue();
		this.partidas = partidas.doubleValue();
		this.chave = chave;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public Double getJogosGanhos() {
		return jogosGanhos;
	}
	
	public Double getKda() {
		return kda;
	}
	
	public Double getPartidas() {
		return partidas;
	}
	
	public String getChave() {
		return chave;
	}
	
	public List<JogadorResumoCampeaoVO> getJogadoresCampeao() {
		return jogadoresCampeao;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setJogosGanhos(Double jogosGanhos) {
		this.jogosGanhos = jogosGanhos;
	}
	
	public void setKda(Double kda) {
		this.kda = kda;
	}
	
	public void setPartidas(Double partidas) {
		this.partidas = partidas;
	}
	
	public void setChave(String chave) {
		this.chave = chave;
	}
	
	public void setJogadoresCampeao(List<JogadorResumoCampeaoVO> jogadoresCampeao) {
		this.jogadoresCampeao = jogadoresCampeao;
	}

	@Override
	public String toString() {
		return "CampeaoResumoVO [id=" + id + ", nome=" + nome + ", titulo=" + titulo + ", chave=" + chave
				+ ", jogosGanhos=" + jogosGanhos + ", kda=" + kda + ", partidas=" + partidas + ", jogadoresCampeao="
				+ jogadoresCampeao + "]";
	}
}
