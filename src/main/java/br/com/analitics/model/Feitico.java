package br.com.analitics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.analitics.utils.database.AbstractEntity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="feitico")
public class Feitico extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Long id;
	
	@Column(name="idRito", nullable=false)
	private Integer idRito;
	
	@Column(name="nome", nullable=false)
	private String nome;
	
	@Column(name="chave", nullable=false)
	private String chave;
	
	@Column(name="descricao", nullable=false)
	private String descricao;
	
	@Column(name="cooldown", nullable=false)
	private Integer cooldown;
	
	@Column(name="lvlUso", nullable=false)
	private Integer lvlUso;

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

	public Integer getCooldown() {
		return cooldown;
	}

	public Integer getLvlUso() {
		return lvlUso;
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

	public void setCooldown(Integer cooldown) {
		this.cooldown = cooldown;
	}

	public void setLvlUso(Integer lvlUso) {
		this.lvlUso = lvlUso;
	}

	@Override
	public String toString() {
		return "Feitico [id=" + id + ", "
									+ "idRito=" + idRito + ", "
									+ "nome=" + nome + ", "
									+ "chave=" + chave + ", "
									+ "descricao=" + descricao + ", "
									+ "cooldown=" + cooldown + ", "
									+ "lvlUso=" + lvlUso + "]";
	}
}