package br.com.analitics.vo.jogador;

public class JogadorResumoVO {
	private Long id;

	private String nick;
	private String chave;
	private String funcao;
	
	private Double kda;
	private Double kill;
	private Double morte;
	private Double assistencia;
	
	private Double gold;
	private Double farme;
	private Double dano;
	private Double wards;
	
	private Long doubleKills;
	private Long tripleKills;
	private Long quadraKills;
	private Long pentaKills;
	
	private Double tempoPartida;
	
	private Long jogosJogados;
	private Long jogosGanhos;
	
	public JogadorResumoVO(Long id, String nick, String chave, String funcao, Double kda, Double kill, Double morte,
			Double assistencia, Double gold, Double farme, Double dano, Double wards, Long doubleKills,
			Long tripleKills, Long quadraKills, Long pentaKills, Double tempoPartida, Long jogosJogados,
			Long jogosGanhos) {
		super();
		this.id = id;
		this.nick = nick;
		this.chave = chave;
		this.funcao = funcao;
		this.kda = kda;
		this.kill = kill;
		this.morte = morte;
		this.assistencia = assistencia;
		this.gold = gold;
		this.farme = farme;
		this.dano = dano;
		this.wards = wards;
		this.doubleKills = doubleKills;
		this.tripleKills = tripleKills;
		this.quadraKills = quadraKills;
		this.pentaKills = pentaKills;
		this.tempoPartida = tempoPartida;
		this.jogosJogados = jogosJogados;
		this.jogosGanhos = jogosGanhos;
	}

	public Long getId() {
		return id;
	}

	public String getNick() {
		return nick;
	}

	public String getChave() {
		return chave;
	}

	public String getFuncao() {
		return funcao;
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

	public Double getGold() {
		return gold;
	}

	public Double getFarme() {
		return farme;
	}

	public Double getDano() {
		return dano;
	}

	public Double getWards() {
		return wards;
	}

	public Long getDoubleKills() {
		return doubleKills;
	}

	public Long getTripleKills() {
		return tripleKills;
	}

	public Long getQuadraKills() {
		return quadraKills;
	}

	public Long getPentaKills() {
		return pentaKills;
	}

	public Double getTempoPartida() {
		return tempoPartida;
	}

	public Long getJogosJogados() {
		return jogosJogados;
	}

	public Long getJogosGanhos() {
		return jogosGanhos;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
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

	public void setGold(Double gold) {
		this.gold = gold;
	}

	public void setFarme(Double farme) {
		this.farme = farme;
	}

	public void setDano(Double dano) {
		this.dano = dano;
	}

	public void setWards(Double wards) {
		this.wards = wards;
	}

	public void setDoubleKills(Long doubleKills) {
		this.doubleKills = doubleKills;
	}

	public void setTripleKills(Long tripleKills) {
		this.tripleKills = tripleKills;
	}

	public void setQuadraKills(Long quadraKills) {
		this.quadraKills = quadraKills;
	}

	public void setPentaKills(Long pentaKills) {
		this.pentaKills = pentaKills;
	}

	public void setTempoPartida(Double tempoPartida) {
		this.tempoPartida = tempoPartida;
	}

	public void setJogosJogados(Long jogosJogados) {
		this.jogosJogados = jogosJogados;
	}

	public void setJogosGanhos(Long jogosGanhos) {
		this.jogosGanhos = jogosGanhos;
	}

	@Override
	public String toString() {
		return "JogadorResumoVO [id=" + id + ", nick=" + nick + ", chave=" + chave + ", funcao=" + funcao + ", kda="
				+ kda + ", kill=" + kill + ", morte=" + morte + ", assistencia=" + assistencia + ", gold=" + gold
				+ ", farme=" + farme + ", dano=" + dano + ", wards=" + wards + ", doubleKills=" + doubleKills
				+ ", tripleKills=" + tripleKills + ", quadraKills=" + quadraKills + ", pentaKills=" + pentaKills
				+ ", tempoPartida=" + tempoPartida + ", jogosJogados=" + jogosJogados + ", jogosGanhos=" + jogosGanhos
				+ "]";
	}
	
}
