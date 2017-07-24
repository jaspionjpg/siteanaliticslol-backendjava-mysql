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
@Table(name="passiva")
public class Passiva extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	Long id;
	
	@Column(name="chave", nullable=false)
	String chave;

	@Column(name="nome", nullable=false)	
	String nome;
	
	@Column(name="descricao", nullable=false, length=2500)	
	String descricao;
	
	public Passiva() {
	}

	public Passiva(Long id, String chave, String nome, String descricao) {
		this.id = id;
		this.chave = chave;
		this.nome = nome;
		this.descricao = descricao;
	}

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

	@Override
	public String toString() {
		return "Passiva [id=" + id + ", "
						+ "chave=" + chave + ", "
						+ "nome=" + nome + ", "
						+ "descricao=" + descricao + "]";
	}
}
