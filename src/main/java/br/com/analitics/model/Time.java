package br.com.analitics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.analitics.utils.AbstractEntity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="time")
public class Time extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	Long id;
	
	@Column(name="slug", nullable=false)
	String slug;
	
	@Column(name="nome", nullable=false)
	String nome;
	
	@Column(name="sigla", nullable=false)
	String sigla;
	
	@Column(name="liga", nullable=false)
	String liga;
	
	@Column(name="urlImagem", nullable=false)
	String urlImagem;

	public Long getId() {
		return id;
	}

	public String getSlug() {
		return slug;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

	public String getLiga() {
		return liga;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	@Override
	public String toString() {
		return "Time [id=" + id + ", "
				+ "slug=" + slug + ", "
				+ "nome=" + nome + ", "
				+ "sigla=" + sigla + ", "
				+ "liga=" + liga + ", "
				+ "urlImagem=" + urlImagem + "]";
	}
}
