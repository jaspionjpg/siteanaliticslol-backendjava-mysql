package br.com.analitics.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.analitics.utils.AbstractEntity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="jogo")
public class Jogo extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Long id;

	@Column(name="season", nullable=false)
	private Integer season;

	@Column(name="numeroJogo", nullable=false)
	private Integer numeroJogo;
	
	@Column(name="gameId", nullable=false)
	private String gameId;
	
	@Column(name="patch", nullable=false)
	private String patch;
	
	@Column(name="platform", nullable=false)
	private String platform;
	
	@Column(name="urlVideoYoutube", nullable=false)
	private String urlVideoYoutube;
	
	@Column(name="data", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	@Column(name="vencedor", nullable=false)
	private Boolean vencedor;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idEstatisticaTime1", nullable=false)
	private EstatisticaTime estatisticaTime1;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idEstatisticaTime2", nullable=false)
	private EstatisticaTime estatisticaTime2;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTopTime1", nullable=false)
	private EstatisticaJogador topTime1;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idJngTime1", nullable=false)
	private EstatisticaJogador jngTime1;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idMidTime1", nullable=false)
	private EstatisticaJogador midTime1;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idAdcTime1", nullable=false)
	private EstatisticaJogador adcTime1;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idSupTime1", nullable=false)
	private EstatisticaJogador supTime1;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTopTime2", nullable=false)
	private EstatisticaJogador topTime2;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idJngTime2", nullable=false)
	private EstatisticaJogador jngTime2;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idMidTime2", nullable=false)
	private EstatisticaJogador midTime2;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idAdcTime2", nullable=false)
	private EstatisticaJogador adcTime2;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idSupTime2", nullable=false)
	private EstatisticaJogador supTime2;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idSerie", nullable=false)
	private Serie serie;

	public Long getId() {
		return id;
	}

	public Integer getSeason() {
		return season;
	}

	public Integer getNumeroJogo() {
		return numeroJogo;
	}

	public String getGameId() {
		return gameId;
	}

	public String getPatch() {
		return patch;
	}

	public String getPlatform() {
		return platform;
	}

	public String getUrlVideoYoutube() {
		return urlVideoYoutube;
	}

	public Date getData() {
		return data;
	}

	public Boolean getVencedor() {
		return vencedor;
	}

	public EstatisticaTime getEstatisticaTime1() {
		return estatisticaTime1;
	}

	public EstatisticaTime getEstatisticaTime2() {
		return estatisticaTime2;
	}

	public EstatisticaJogador getTopTime1() {
		return topTime1;
	}

	public EstatisticaJogador getJngTime1() {
		return jngTime1;
	}

	public EstatisticaJogador getMidTime1() {
		return midTime1;
	}

	public EstatisticaJogador getAdcTime1() {
		return adcTime1;
	}

	public EstatisticaJogador getSupTime1() {
		return supTime1;
	}

	public EstatisticaJogador getTopTime2() {
		return topTime2;
	}

	public EstatisticaJogador getJngTime2() {
		return jngTime2;
	}

	public EstatisticaJogador getMidTime2() {
		return midTime2;
	}

	public EstatisticaJogador getAdcTime2() {
		return adcTime2;
	}

	public EstatisticaJogador getSupTime2() {
		return supTime2;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSeason(Integer season) {
		this.season = season;
	}

	public void setNumeroJogo(Integer numeroJogo) {
		this.numeroJogo = numeroJogo;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public void setPatch(String patch) {
		this.patch = patch;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public void setUrlVideoYoutube(String urlVideoYoutube) {
		this.urlVideoYoutube = urlVideoYoutube;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setVencedor(Boolean vencedor) {
		this.vencedor = vencedor;
	}

	public void setEstatisticaTime1(EstatisticaTime estatisticaTime1) {
		this.estatisticaTime1 = estatisticaTime1;
	}

	public void setEstatisticaTime2(EstatisticaTime estatisticaTime2) {
		this.estatisticaTime2 = estatisticaTime2;
	}

	public void setTopTime1(EstatisticaJogador topTime1) {
		this.topTime1 = topTime1;
	}

	public void setJngTime1(EstatisticaJogador jngTime1) {
		this.jngTime1 = jngTime1;
	}

	public void setMidTime1(EstatisticaJogador midTime1) {
		this.midTime1 = midTime1;
	}

	public void setAdcTime1(EstatisticaJogador adcTime1) {
		this.adcTime1 = adcTime1;
	}

	public void setSupTime1(EstatisticaJogador supTime1) {
		this.supTime1 = supTime1;
	}

	public void setTopTime2(EstatisticaJogador topTime2) {
		this.topTime2 = topTime2;
	}

	public void setJngTime2(EstatisticaJogador jngTime2) {
		this.jngTime2 = jngTime2;
	}

	public void setMidTime2(EstatisticaJogador midTime2) {
		this.midTime2 = midTime2;
	}

	public void setAdcTime2(EstatisticaJogador adcTime2) {
		this.adcTime2 = adcTime2;
	}

	public void setSupTime2(EstatisticaJogador supTime2) {
		this.supTime2 = supTime2;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	@Override
	public String toString() {
		return "Jogo [id=" + id + ", "
				+ "season=" + season + ", "
				+ "numeroJogo=" + numeroJogo + ", "
				+ "gameId=" + gameId + ", "
				+ "patch=" + patch + ", "
				+ "platform=" + platform + ", "
				+ "urlVideoYoutube=" + urlVideoYoutube + ", "
				+ "data=" + data + ", "
				+ "vencedor=" + vencedor + ", "
				+ "estatisticaTime1=" + estatisticaTime1 + ", "
				+ "estatisticaTime2=" + estatisticaTime2 + ", "
				+ "topTime1=" + topTime1 + ", "
				+ "jngTime1=" + jngTime1 + ", "
				+ "midTime1=" + midTime1 + ", "
				+ "adcTime1=" + adcTime1 + ", "
				+ "supTime1=" + supTime1 + ", "
				+ "topTime2=" + topTime2 + ", "
				+ "jngTime2=" + jngTime2 + ", "
				+ "midTime2=" + midTime2 + ", "
				+ "adcTime2=" + adcTime2 + ", "
				+ "supTime2=" + supTime2 + ", "
				+ "serie=" + serie + "]";
	}
}