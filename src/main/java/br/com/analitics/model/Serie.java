package br.com.analitics.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.analitics.abstracts.AbstractEntity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="serie")
public class Serie extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Long id;
	
	@Column(name="numeroJogos", nullable=false)
	private Integer numeroJogos;
	
	@Column(name="nome", nullable=false)
	private String nome;
	
	@Column(name="titulo", nullable=false)
	private String titulo;
	
	@Column(name="faseTorneio", nullable=false)
	private String faseTorneio; 
	
	@Column(name="data", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTime1", nullable=false)
	private Time time1;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTime2", nullable=false)
	private Time time2;
	
	@Column(name="time1Vencedor", nullable=false)
	private Integer time1Vencedor;
	
	@Column(name="time2Vencedor", nullable=false)
	private Integer time2Vencedor;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCampeonato", nullable=false)
	private Campeonato campeonato;
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="serie", fetch=FetchType.LAZY)
	private List<Jogo> jogos;

	public Long getId() {
		return id;
	}

	public Integer getNumeroJogos() {
		return numeroJogos;
	}

	public String getNome() {
		return nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getFaseTorneio() {
		return faseTorneio;
	}

	public Date getData() {
		return data;
	}

	public Time getTime1() {
		return time1;
	}

	public Time getTime2() {
		return time2;
	}

	public Integer getTime1Vencedor() {
		return time1Vencedor;
	}

	public Integer getTime2Vencedor() {
		return time2Vencedor;
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNumeroJogos(Integer numeroJogos) {
		this.numeroJogos = numeroJogos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setFaseTorneio(String faseTorneio) {
		this.faseTorneio = faseTorneio;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setTime1(Time time1) {
		this.time1 = time1;
	}

	public void setTime2(Time time2) {
		this.time2 = time2;
	}

	public void setTime1Vencedor(Integer time1Vencedor) {
		this.time1Vencedor = time1Vencedor;
	}

	public void setTime2Vencedor(Integer time2Vencedor) {
		this.time2Vencedor = time2Vencedor;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}

	@Override
	public String toString() {
		return "Serie [id=" + id + ", "
				+ "numeroJogos=" + numeroJogos + ", "
				+ "nome=" + nome + ", "
				+ "titulo=" + titulo + ", "
				+ "faseTorneio=" + faseTorneio + ", "
				+ "data=" + data + ", "
				+ "time1=" + time1 + ", "
				+ "time2=" + time2 + ", "
				+ "time1Vencedor=" + time1Vencedor + ", "
				+ "time2Vencedor=" + time2Vencedor + ", "
				+ "campeonato=" + campeonato + ", "
				+ "jogos=" + jogos + "]";
	}
}