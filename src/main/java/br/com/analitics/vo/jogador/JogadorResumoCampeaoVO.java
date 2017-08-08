package br.com.analitics.vo.jogador;

public class JogadorResumoCampeaoVO {
	private Long id;

	private String nome;
	private String chave;
	
	private Double kda;
	private Double kill;
	private Double morte;
	private Double assistencia;
	private Long jogosEscolha;
	private Long jogosGanhos;
	
	public JogadorResumoCampeaoVO() {
	}
	
	public JogadorResumoCampeaoVO(Long id, String nome, String chave, Double kda, Double kill, Double morte,
			Double assistencia, Long jogosEscolha, Long taxaWin) {
		this.id = id;
		this.nome = nome;
		this.chave = chave;
		if(kda != null) this.kda = kda;
		else this.kda = kill + assistencia;
		this.kill = kill;
		this.morte = morte;
		this.assistencia = assistencia;
		this.jogosEscolha = jogosEscolha;
		this.jogosGanhos = taxaWin;
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

	public Double getKill() {
		return kill;
	}

	public Double getMorte() {
		return morte;
	}

	public Double getAssistencia() {
		return assistencia;
	}

	public Long getJogosEscolha() {
		return jogosEscolha;
	}

	public Long getJogosGanhos() {
		return jogosGanhos;
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

	public void setKill(Double kill) {
		this.kill = kill;
	}

	public void setMorte(Double morte) {
		this.morte = morte;
	}

	public void setAssistencia(Double assistencia) {
		this.assistencia = assistencia;
	}

	public void setJogosEscolha(Long jogosEscolha) {
		this.jogosEscolha = jogosEscolha;
	}

	public void setJogosGanhos(Long jogosGanhos) {
		this.jogosGanhos = jogosGanhos;
	}

	@Override
	public String toString() {
		return "JogadorResumoCampeaoVO [id=" + id + ", nome=" + nome + ", chave=" + chave + ", kda=" + kda + ", kill="
				+ kill + ", morte=" + morte + ", assistencia=" + assistencia + ", jogosEscolha=" + jogosEscolha
				+ ", jogosGanhos=" + jogosGanhos + "]";
	}
}
