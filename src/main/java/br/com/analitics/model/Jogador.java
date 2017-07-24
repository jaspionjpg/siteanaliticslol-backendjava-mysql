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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.analitics.utils.AbstractEntity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="jogador")
public class Jogador extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Long id;
	
	@Column(name="idRito", nullable=false)
	private Integer idRito;
	
	@Column(name="slug", nullable=false)
	private String slug;
	
	@Column(name="nick", nullable=false)
	private String nick;
	
	@Column(name="primeiroNome")
	private String primeiroNome;
	
	@Column(name="ultimoNome")
	private String ultimoNome;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="funcao", nullable=false)
	private String funcao;
	
	@Column(name="regiao")
	private String regiao;

	@Column(name="urlImagem")
	private String urlImagem;
	
	@Column(name="data")
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="jogador", fetch=FetchType.LAZY)
	private List<RedeSocial> redeSocial;

	public Long getId() {
		return id;
	}

	public String getSlug() {
		return slug;
	}

	public String getNick() {
		return nick;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public String getCidade() {
		return cidade;
	}

	public String getFuncao() {
		return funcao;
	}

	public String getRegiao() {
		return regiao;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getIdRito() {
		return idRito;
	}

	public void setIdRito(Integer idRito) {
		this.idRito = idRito;
	}

	@Override
	public String toString() {
		return "Jogador [id=" + id + ", "
					+ "slug=" + slug + ", "
					+ "nick=" + nick + ", "
					+ "primeiroNome=" + primeiroNome + ", "
					+ "ultimoNome=" + ultimoNome + ", "
					+ "cidade=" + cidade + ", "
					+ "funcao=" + funcao + ", "
					+ "regiao=" + regiao + ", "
					+ "urlImagem=" + urlImagem + ", "
					+ "dataNascimento=" + dataNascimento + "]";
	}
}
