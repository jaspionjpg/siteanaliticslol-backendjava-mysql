package br.com.analitics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="item_recomendado_campeao")
public class ItemRecomendadoCampeao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Long id;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idItem")
	private Item item;

	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name="idCampeao", referencedColumnName="id", nullable=false)
	private Campeao campeao;

	public Long getId() {
		return id;
	}

	public Campeao getCampeao() {
		return campeao;
	}

	public Item getItem() {
		return item;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCampeao(Campeao campeao) {
		this.campeao = campeao;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ItemRecomendadoCampeao [id=" + id + ", "
								+ "campeao=" + campeao + ", "
								+ "item=" + item + "]";
	}
}