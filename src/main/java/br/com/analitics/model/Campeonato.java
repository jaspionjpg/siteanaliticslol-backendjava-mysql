package br.com.analitics.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.analitics.utils.database.AbstractEntity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="campeonato")
public class Campeonato extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Long id;
	
	@Column(name="title", nullable=false)
	private String title;
	
	@Column(name="descricao", nullable=false)
	private String descricao;
	
	@Column(name="urlImagem", nullable=false)
	private String urlImagem;
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="campeonato", fetch=FetchType.LAZY)
	private List<Serie> series;

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}

	@Override
	public String toString() {
		return "Campeonato [id=" + id + ", "
				+ "title=" + title + ", "
				+ "descricao=" + descricao + ", "
				+ "urlImagem=" + urlImagem + ", "
				+ "series=" + series + "]";
	}
}