package br.com.analitics.vo;

import java.util.List;

public class CampeaoResumoVO {
	private Long id;

	private String nome;
	private String titulo;
	private String chave;
	
	private Double taxaVitoria;
	private Double taxaBan;
	private Double taxaPick;
	
	private List<JogadorResumoCampeaoVO> jogadoresCampeao;
	
	public CampeaoResumoVO() {
	}

	public CampeaoResumoVO(Long id, String nome, String titulo, Double taxaVitoria, Double taxaBan, Double taxaPick,
			String chave) {
		this.id = id;
		this.nome = nome;
		this.titulo = titulo;
		this.taxaVitoria = taxaVitoria;
		this.taxaBan = taxaBan;
		this.taxaPick = taxaPick;
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
	
	public Double getTaxaVitoria() {
		return taxaVitoria;
	}
	
	public Double getTaxaBan() {
		return taxaBan;
	}
	
	public Double getTaxaPick() {
		return taxaPick;
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
	
	public void setTaxaVitoria(Double taxaVitoria) {
		this.taxaVitoria = taxaVitoria;
	}
	
	public void setTaxaBan(Double taxaBan) {
		this.taxaBan = taxaBan;
	}
	
	public void setTaxaPick(Double taxaPick) {
		this.taxaPick = taxaPick;
	}
	
	public void setChave(String chave) {
		this.chave = chave;
	}
	
	public void setJogadoresCampeao(List<JogadorResumoCampeaoVO> jogadoresCampeao) {
		this.jogadoresCampeao = jogadoresCampeao;
	}

	@Override
	public String toString() {
		return "CampeaoResumoVO [id=" + id + ", nome=" + nome + ", titulo=" + titulo + ", taxaVitoria=" + taxaVitoria
				+ ", taxaBan=" + taxaBan + ", taxaPick=" + taxaPick + ", chave=" + chave + ", jogadoresCampeao="
				+ jogadoresCampeao + "]";
	}
}
