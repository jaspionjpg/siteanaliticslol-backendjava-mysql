package br.com.analitics.vo;

public class JogadorResumoCampeaoVO {
	private Long id;

	private String nome;
	private String chave;
	
	private Double kda;
	private Integer kill;
	private Integer morte;
	private Integer assistencia;
	private Integer jogosEscolha;
	private Double taxaWin;
	
	public JogadorResumoCampeaoVO() {
	}
	
	public JogadorResumoCampeaoVO(Long id, String nome, String chave, Double kda, Integer kill, Integer morte,
			Integer assistencia, Integer jogosEscolha, Double taxaWin) {
		this.id = id;
		this.nome = nome;
		this.chave = chave;
		this.kda = kda;
		this.kill = kill;
		this.morte = morte;
		this.assistencia = assistencia;
		this.jogosEscolha = jogosEscolha;
		this.taxaWin = taxaWin;
	}

	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getChave() {
		return chave;
	}
	
	public Double getKda() {
		return kda;
	}
	
	public Integer getKill() {
		return kill;
	}
	
	public Integer getMorte() {
		return morte;
	}
	
	public Integer getAssistencia() {
		return assistencia;
	}
	
	public Integer getJogosEscolha() {
		return jogosEscolha;
	}
	
	public Double getTaxaWin() {
		return taxaWin;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setChave(String chave) {
		this.chave = chave;
	}
	
	public void setKda(Double kda) {
		this.kda = kda;
	}
	
	public void setKill(Integer kill) {
		this.kill = kill;
	}
	
	public void setMorte(Integer morte) {
		this.morte = morte;
	}
	
	public void setAssistencia(Integer assistencia) {
		this.assistencia = assistencia;
	}
	
	public void setJogosEscolha(Integer jogosEscolha) {
		this.jogosEscolha = jogosEscolha;
	}
	
	public void setTaxaWin(Double taxaWin) {
		this.taxaWin = taxaWin;
	}

	@Override
	public String toString() {
		return "JogadorResumoCampeaoVO [id=" + id + ", nome=" + nome + ", chave=" + chave + ", kda=" + kda + ", kill="
				+ kill + ", morte=" + morte + ", assistencia=" + assistencia + ", jogosEscolha=" + jogosEscolha
				+ ", taxaWin=" + taxaWin + "]";
	}
}
