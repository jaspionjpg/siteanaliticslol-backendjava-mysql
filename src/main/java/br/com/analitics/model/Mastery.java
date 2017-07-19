package br.com.analitics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.analitics.abstracts.AbstractEntity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="mastery")
public class Mastery extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Long id;
	
	@Column(name="idRito", nullable=false)
	private Integer idRito;
	
	@Column(name="nome", nullable=false)
	private String nome;
	
	@Column(name="descricao", nullable=false, length=750)
	private String descricao;

	public Long getId() {
		return id;
	}

	public Integer getIdRito() {
		return idRito;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
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

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Mastery [id=" + id + ", "
						+ "idRito=" + idRito + ", "
						+ "nome=" + nome + ", "
						+ "descricao=" + descricao + "]";
	}
}
