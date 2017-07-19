package br.com.analitics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.analitics.abstracts.AbstractEntity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="rede_social")
public class RedeSocial extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Long id;
	
	@Column(name="rede", nullable=false)
	private String rede;
	
	@Column(name="url", nullable=false)
	private String url;
	
	@OneToOne()
	@JoinColumn(name="idJogador", nullable=false)
	private Jogador jogador;

	public Long getId() {
		return id;
	}

	public String getRede() {
		return rede;
	}

	public String getUrl() {
		return url;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setRede(String rede) {
		this.rede = rede;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	@Override
	public String toString() {
		return "RedeSocial [id=" + id + ", "
					+ "rede=" + rede + ", "
					+ "url=" + url + ", "
					+ "jogador=" + jogador + "]";
	}
}