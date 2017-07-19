package br.com.analitics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Long id;	
	
	@Column(name="idRito", nullable=false, length=11)
	private Integer idRito;
	
	@Column(name="nome", nullable=true, length=65)
	private String nome;
	
	@Column(name="chave", nullable=false, length=65)
	private String chave;
	
	@Column(name="descricao", nullable=true, length=1000)
	private String descricao;
	
	@Column(name="descricaoElaborada", nullable=true, length=1000)
	private String descricaoElaborada;

	@Column(name="goldCompra", nullable=true, length=11)
	private Integer goldCompra;
	
	@Column(name="goldVenda", nullable=true, length=11)
	private Integer goldVenda;
	
	@Column(name="status", nullable=true, length=1000)
	private String status;

	public Long getId() {
		return id;
	}

	public Integer getIdRito() {
		return idRito;
	}

	public String getNome() {
		return nome;
	}

	public String getChave() {
		return chave;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDescricaoElaborada() {
		return descricaoElaborada;
	}

	public Integer getGoldCompra() {
		return goldCompra;
	}

	public Integer getGoldVenda() {
		return goldVenda;
	}

	public String getStatus() {
		return status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setIdRito(Integer idRito) {
		this.idRito = idRito;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setDescricaoElaborada(String descricaoElaborada) {
		this.descricaoElaborada = descricaoElaborada;
	}

	public void setGoldCompra(Integer goldCompra) {
		this.goldCompra = goldCompra;
	}

	public void setGoldVenda(Integer goldVenda) {
		this.goldVenda = goldVenda;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
