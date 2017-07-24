package br.com.analitics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.analitics.utils.AbstractEntity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="estatistica_jogador")
public class EstatisticaJogador extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Long id;
	
	@Column(name="vencedor", nullable=false)
	private Boolean vencedor;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCampeao", nullable=false)
	private Campeao campeao;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idMastery", nullable=true)
	private Mastery mastery;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idFeitico1", nullable=false)
	private Feitico feitico1;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idFeitico2", nullable=false)
	private Feitico feitico2;
	
	@Column(name="campeaoLevel", nullable=false)
	private Integer campeaoLevel;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idItem0", nullable=true)
	private Item item0;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idItem1", nullable=true)
	private Item item1;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idItem2", nullable=true)
	private Item item2;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idItem3", nullable=true)
	private Item item3;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idItem4", nullable=true)
	private Item item4;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idItem5", nullable=true)
	private Item item5;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idItem6", nullable=true)
	private Item item6;

	@Column(name="abates", nullable=false)
	private Integer abates;
	
	@Column(name="mortes", nullable=false)
	private Integer mortes;
	
	@Column(name="assistencias", nullable=false)
	private Integer assistencias;
	
	@Column(name="farme", nullable=false)
	private Integer farme;
	
	@Column(name="goldGanho", nullable=false)
	private Integer goldGanho;
	
	@Column(name="inibidoresKills", nullable=false)
	private Integer inibidoresKills;
	
	@Column(name="torresKills", nullable=false)
	private Integer torresKills;
	
	@Column(name="wardsColocadas", nullable=false)
	private Integer wardsColocadas;
	
	@Column(name="wardsMatadas", nullable=false)
	private Integer wardsMatadas;
	
	@Column(name="wardsCompradas", nullable=false)
	private Integer wardsCompradas;
	
	@Column(name="firstBlood", nullable=false)
	private Boolean firstBlood;
	
	@Column(name="firstBloodAssistencia", nullable=false)
	private Boolean firstBloodAssistencia;
	
	@Column(name="firstTower", nullable=false)
	private Boolean firstTower;
	
	@Column(name="firstTowerAssistencia", nullable=false)
	private Boolean firstTowerAssistencia;
	
	@Column(name="firstInibidor", nullable=false)
	private Boolean firstInibidor;
	
	@Column(name="firstInibidorAssistencia", nullable=false)
	private Boolean firstInibidorAssistencia;
	
	@Column(name="doubleKills", nullable=false)
	private Integer doubleKills;
	
	@Column(name="tripleKills", nullable=false)
	private Integer tripleKills;
	
	@Column(name="quadraKills", nullable=false)
	private Integer quadraKills;
	
	@Column(name="pentaKills", nullable=false)
	private Integer pentaKills;
	
	@Column(name="maoirMultiKill", nullable=false)
	private Integer maoirMultiKill;
	
	@Column(name="killingSprees", nullable=false)
	private Integer killingSprees;
	
	@Column(name="totalDano", nullable=false)
	private Integer totalDano;
	
	@Column(name="totalDanoTomado", nullable=false)
	private Integer totalDanoTomado;
	
	@Column(name="ladoTime", nullable=false)
	private Boolean ladoTime;
	
	@Column(name="tempoPartida", nullable=false)
	private Long tempoPartida;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idJogador", nullable=false)
	private Jogador jogador;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTimeAtual", nullable=false)
	private Time timeAtual;

	public Long getId() {
		return id;
	}

	public Boolean getVencedor() {
		return vencedor;
	}

	public Campeao getCampeao() {
		return campeao;
	}

	public Mastery getMastery() {
		return mastery;
	}

	public Feitico getFeitico1() {
		return feitico1;
	}

	public Feitico getFeitico2() {
		return feitico2;
	}

	public Integer getCampeaoLevel() {
		return campeaoLevel;
	}

	public Item getItem0() {
		return item0;
	}

	public Item getItem1() {
		return item1;
	}

	public Item getItem2() {
		return item2;
	}

	public Item getItem3() {
		return item3;
	}

	public Item getItem4() {
		return item4;
	}

	public Item getItem5() {
		return item5;
	}

	public Item getItem6() {
		return item6;
	}

	public Integer getAbates() {
		return abates;
	}

	public Integer getMortes() {
		return mortes;
	}

	public Integer getAssistencias() {
		return assistencias;
	}

	public Integer getFarme() {
		return farme;
	}

	public Integer getGoldGanho() {
		return goldGanho;
	}

	public Integer getInibidoresKills() {
		return inibidoresKills;
	}

	public Integer getTorresKills() {
		return torresKills;
	}

	public Integer getWardsColocadas() {
		return wardsColocadas;
	}

	public Integer getWardsMatadas() {
		return wardsMatadas;
	}

	public Integer getWardsCompradas() {
		return wardsCompradas;
	}

	public Boolean getFirstBlood() {
		return firstBlood;
	}

	public Boolean getFirstBloodAssistencia() {
		return firstBloodAssistencia;
	}

	public Boolean getFirstTower() {
		return firstTower;
	}

	public Boolean getFirstTowerAssistencia() {
		return firstTowerAssistencia;
	}

	public Boolean getFirstInibidor() {
		return firstInibidor;
	}

	public Boolean getFirstInibidorAssistencia() {
		return firstInibidorAssistencia;
	}

	public Integer getDoubleKills() {
		return doubleKills;
	}

	public Integer getTripleKills() {
		return tripleKills;
	}

	public Integer getQuadraKills() {
		return quadraKills;
	}

	public Integer getPentaKills() {
		return pentaKills;
	}

	public Integer getMaoirMultiKill() {
		return maoirMultiKill;
	}

	public Integer getKillingSprees() {
		return killingSprees;
	}

	public Integer getTotalDano() {
		return totalDano;
	}

	public Integer getTotalDanoTomado() {
		return totalDanoTomado;
	}

	public Boolean getLadoTime() {
		return ladoTime;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public Time getTimeAtual() {
		return timeAtual;
	}

	public Long getTempoPartida() {
		return tempoPartida;
	}

	public void setTempoPartida(Long tempoPartida) {
		this.tempoPartida = tempoPartida;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setVencedor(Boolean vencedor) {
		this.vencedor = vencedor;
	}

	public void setCampeao(Campeao campeao) {
		this.campeao = campeao;
	}

	public void setMastery(Mastery mastery) {
		this.mastery = mastery;
	}

	public void setFeitico1(Feitico feitico1) {
		this.feitico1 = feitico1;
	}

	public void setFeitico2(Feitico feitico2) {
		this.feitico2 = feitico2;
	}

	public void setCampeaoLevel(Integer campeaoLevel) {
		this.campeaoLevel = campeaoLevel;
	}

	public void setItem0(Item item0) {
		this.item0 = item0;
	}

	public void setItem1(Item item1) {
		this.item1 = item1;
	}

	public void setItem2(Item item2) {
		this.item2 = item2;
	}

	public void setItem3(Item item3) {
		this.item3 = item3;
	}

	public void setItem4(Item item4) {
		this.item4 = item4;
	}

	public void setItem5(Item item5) {
		this.item5 = item5;
	}

	public void setItem6(Item item6) {
		this.item6 = item6;
	}

	public void setAbates(Integer abates) {
		this.abates = abates;
	}

	public void setMortes(Integer mortes) {
		this.mortes = mortes;
	}

	public void setAssistencias(Integer assistencias) {
		this.assistencias = assistencias;
	}

	public void setFarme(Integer farme) {
		this.farme = farme;
	}

	public void setGoldGanho(Integer goldGanho) {
		this.goldGanho = goldGanho;
	}

	public void setInibidoresKills(Integer inibidoresKills) {
		this.inibidoresKills = inibidoresKills;
	}

	public void setTorresKills(Integer torresKills) {
		this.torresKills = torresKills;
	}

	public void setWardsColocadas(Integer wardsColocadas) {
		this.wardsColocadas = wardsColocadas;
	}

	public void setWardsMatadas(Integer wardsMatadas) {
		this.wardsMatadas = wardsMatadas;
	}

	public void setWardsCompradas(Integer wardsCompradas) {
		this.wardsCompradas = wardsCompradas;
	}

	public void setFirstBlood(Boolean firstBlood) {
		this.firstBlood = firstBlood;
	}

	public void setFirstBloodAssistencia(Boolean firstBloodAssistencia) {
		this.firstBloodAssistencia = firstBloodAssistencia;
	}

	public void setFirstTower(Boolean firstTower) {
		this.firstTower = firstTower;
	}

	public void setFirstTowerAssistencia(Boolean firstTowerAssistencia) {
		this.firstTowerAssistencia = firstTowerAssistencia;
	}

	public void setFirstInibidor(Boolean firstInibidor) {
		this.firstInibidor = firstInibidor;
	}

	public void setFirstInibidorAssistencia(Boolean firstInibidorAssistencia) {
		this.firstInibidorAssistencia = firstInibidorAssistencia;
	}

	public void setDoubleKills(Integer doubleKills) {
		this.doubleKills = doubleKills;
	}

	public void setTripleKills(Integer tripleKills) {
		this.tripleKills = tripleKills;
	}

	public void setQuadraKills(Integer quadraKills) {
		this.quadraKills = quadraKills;
	}

	public void setPentaKills(Integer pentaKills) {
		this.pentaKills = pentaKills;
	}

	public void setMaoirMultiKill(Integer maoirMultiKill) {
		this.maoirMultiKill = maoirMultiKill;
	}

	public void setKillingSprees(Integer killingSprees) {
		this.killingSprees = killingSprees;
	}

	public void setTotalDano(Integer totalDano) {
		this.totalDano = totalDano;
	}

	public void setTotalDanoTomado(Integer totalDanoTomado) {
		this.totalDanoTomado = totalDanoTomado;
	}

	public void setLadoTime(Boolean ladoTime) {
		this.ladoTime = ladoTime;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public void setTimeAtual(Time timeAtual) {
		this.timeAtual = timeAtual;
	}

	@Override
	public String toString() {
		return "EstatisticaJogador [id=" + id + ", "
				+ "vencedor=" + vencedor + ", "
				+ "campeao=" + campeao + ", "
				+ "mastery=" + mastery + ", "
				+ "feitico1=" + feitico1 + ", "
				+ "feitico2=" + feitico2 + ", "
				+ "campeaoLevel=" + campeaoLevel + ", "
				+ "item0=" + item0 + ", "
				+ "item1=" + item1 + ", "
				+ "item2=" + item2 + ", "
				+ "item3=" + item3 + ", "
				+ "item4=" + item4 + ", "
				+ "item5=" + item5 + ", "
				+ "item6=" + item6 + ", "
				+ "abates=" + abates + ", "
				+ "mortes=" + mortes + ", "
				+ "assistencias=" + assistencias + ", "
				+ "farme=" + farme + ", "
				+ "goldGanho=" + goldGanho + ", "
				+ "inibidoresKills=" + inibidoresKills + ", "
				+ "torresKills=" + torresKills + ", "
				+ "wardsColocadas="	+ wardsColocadas + ", "
				+ "wardsMatadas=" + wardsMatadas + ", "
				+ "wardsCompradas=" + wardsCompradas + ", "
				+ "firstBlood=" + firstBlood + ", "
				+ "firstBloodAssistencia=" + firstBloodAssistencia + ", "
				+ "firstTower="	+ firstTower + ", "
				+ "firstTowerAssistencia=" + firstTowerAssistencia + ", "
				+ "firstInibidor=" + firstInibidor + ", "
				+ "firstInibidorAssistencia=" + firstInibidorAssistencia + ", "
				+ "doubleKills=" + doubleKills + ", "
				+ "tripleKills=" + tripleKills + ", "
				+ "quadraKills=" + quadraKills + ", "
				+ "pentaKills=" + pentaKills + ", "
				+ "maoirMultiKill=" + maoirMultiKill + ", "
				+ "killingSprees=" + killingSprees + ", "
				+ "totalDano=" + totalDano + ", "
				+ "tempoPartida=" + tempoPartida + ", "
				+ "totalDanoTomado=" + totalDanoTomado + ", "
				+ "ladoTime=" + ladoTime + ", "
				+ "jogador=" + jogador + ", "
				+ "timeAtual=" + timeAtual + "]";
	}
}