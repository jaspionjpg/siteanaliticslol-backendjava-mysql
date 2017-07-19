package br.com.analitics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="habilidade")
public class Habilidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Long id;
	
	@Column(name="chave", nullable=false)
	private String chave;

	@Column(name="nome", nullable=false)	
	private String nome;
	
	@Column(name="descricao", nullable=false, length=4500)
	private String descricao;
	
	@Column(name="custoMana", nullable=false)
	private String custoMana;

	@Column(name="coldowns", nullable=false)
	private String coldowns;
	
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name="idCampeao", referencedColumnName="id", nullable=false)
	private Campeao campeao;

	public Long getId() {
		return id;
	}

	public String getChave() {
		return chave;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getCustoMana() {
		return custoMana;
	}

	public String getColdowns() {
		return coldowns;
	}

	public Campeao getCampeao() {
		return campeao;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCustoMana(String custoMana) {
		this.custoMana = custoMana;
	}

	public void setColdowns(String coldowns) {
		this.coldowns = coldowns;
	}

	public void setCampeao(Campeao campeao) {
		this.campeao = campeao;
	}

	@Override
	public String toString() {
		return "Habilidade [id=" + id + ", "
							+ "chave=" + chave + ", "
							+ "nome=" + nome + ", "
							+ "descricao=" + descricao + ", "
							+ "custoMana=" + custoMana + ", "
							+ "coldowns=" + coldowns + ", "
							+ "campeao=" + campeao + "]";
	}
}