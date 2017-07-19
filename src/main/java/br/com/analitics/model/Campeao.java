package br.com.analitics.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.analitics.abstracts.AbstractEntity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="campeao")
@NamedQueries({
	@NamedQuery(name="Campeao.findAll", query="SELECT i FROM Campeao i"),
	@NamedQuery(name="Campeao.findById", query="SELECT i FROM Campeao i WHERE i.id = :id")})
public class Campeao extends AbstractEntity {
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
	
	@Column(name="titulo", nullable=false)
	private String titulo;
	
	@Column(name="descricao", nullable=false, length=5000)
	private String descricao;
	
	@Column(name="dicasContra", nullable=false, length=2500)
	private String dicasContra; 

	@Column(name="dicasCom", nullable=false, length=2500)
	private String dicasCom; 
	
	@Column(name="tipos", nullable=false)
	private String tipos; 

	@Column(name="dificuldade", nullable=false)
	private Integer dificuldade;

	@Column(name="ataque", nullable=false)
	private Integer ataque;
	
	@Column(name="defesa", nullable=false)
	private Integer defesa;
	
	@Column(name="magia", nullable=false)
	private Integer magia;
	
	@Column(name="mana", nullable=false)
	private Double mana;
	
	@Column(name="vida", nullable=false)
	private Double vida;
	
	@Column(name="danoAtaque", nullable=false)
	private Double danoAtaque;
	
	@Column(name="armadura", nullable=false)
	private Double armadura;
	
	@Column(name="ataqueRange", nullable=false)
	private Double ataqueRange;
	
	@Column(name="velocidadeMovimento", nullable=false)
	private Double velocidadeMovimento;
	
	@Column(name="critico", nullable=false)
	private Double critico;
	
	@Column(name="manaRegen", nullable=false)
	private Double manaRegen;
	
	@Column(name="defesaMagica", nullable=false)
	private Double defesaMagica;
	
	@Column(name="vidaRegen", nullable=false)
	private Double vidaRegen;
	
	@Column(name="vidaRegenPorLvl", nullable=false)
	private Double vidaRegenPorLvl;
	
	@Column(name="manaRegenPorLvl", nullable=false)
	private Double manaRegenPorLvl;
	
	@Column(name="vidaPorLvl", nullable=false)
	private Double vidaPorLvl;
	
	@Column(name="manaPorLvl", nullable=false)
	private Double manaPorLvl;
	
	@Column(name="defesaMagicaPorLvl", nullable=false)
	private Double defesaMagicaPorLvl;
	
	@Column(name="danoAtaquePorLvl", nullable=false)
	private Double danoAtaquePorLvl;
	
	@Column(name="armaduraPorLvl", nullable=false)
	private Double armaduraPorLvl;
	
	@Column(name="ataqueSpeedPorLvl", nullable=false)
	private Double ataqueSpeedPorLvl;
	
	@Column(name="criticoPorLvl", nullable=false)
	private Double criticoPorLvl;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPassiva")
	private Passiva passiva;
	
	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="campeao", fetch=FetchType.LAZY)
	private List<ItemRecomendadoCampeao> itensRecomendados;

	@OneToMany(cascade=CascadeType.PERSIST, mappedBy="campeao", fetch=FetchType.LAZY)
	private List<Habilidade> habilidades;

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

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDicasContra() {
		return dicasContra;
	}

	public String getDicasCom() {
		return dicasCom;
	}

	public String getTipos() {
		return tipos;
	}

	public Passiva getPassiva() {
		return passiva;
	}

	public Integer getDificuldade() {
		return dificuldade;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public Integer getDefesa() {
		return defesa;
	}

	public Integer getMagia() {
		return magia;
	}

	public Double getMana() {
		return mana;
	}

	public Double getVida() {
		return vida;
	}

	public Double getDanoAtaque() {
		return danoAtaque;
	}

	public Double getArmadura() {
		return armadura;
	}

	public Double getAtaqueRange() {
		return ataqueRange;
	}

	public Double getVelocidadeMovimento() {
		return velocidadeMovimento;
	}

	public Double getCritico() {
		return critico;
	}

	public Double getManaRegen() {
		return manaRegen;
	}

	public Double getDefesaMagica() {
		return defesaMagica;
	}

	public Double getVidaRegen() {
		return vidaRegen;
	}

	public Double getVidaRegenPorLvl() {
		return vidaRegenPorLvl;
	}

	public Double getManaRegenPorLvl() {
		return manaRegenPorLvl;
	}

	public Double getVidaPorLvl() {
		return vidaPorLvl;
	}

	public Double getManaPorLvl() {
		return manaPorLvl;
	}

	public Double getDanoAtaquePorLvl() {
		return danoAtaquePorLvl;
	}

	public Double getArmaduraPorLvl() {
		return armaduraPorLvl;
	}

	public Double getAtaqueSpeedPorLvl() {
		return ataqueSpeedPorLvl;
	}

	public Double getCriticoPorLvl() {
		return criticoPorLvl;
	}

	public List<ItemRecomendadoCampeao> getItensRecomendados() {
		return itensRecomendados;
	}

	public List<Habilidade> getHabilidades() {
		return habilidades;
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

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setDicasContra(String dicasContra) {
		this.dicasContra = dicasContra;
	}

	public void setDicasCom(String dicasCom) {
		this.dicasCom = dicasCom;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}

	public void setPassiva(Passiva passiva) {
		this.passiva = passiva;
	}

	public void setDificuldade(Integer dificuldade) {
		this.dificuldade = dificuldade;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}

	public void setMagia(Integer magia) {
		this.magia = magia;
	}

	public void setMana(Double mana) {
		this.mana = mana;
	}

	public void setVida(Double vida) {
		this.vida = vida;
	}

	public void setDanoAtaque(Double danoAtaque) {
		this.danoAtaque = danoAtaque;
	}

	public void setArmadura(Double armadura) {
		this.armadura = armadura;
	}

	public void setAtaqueRange(Double ataqueRange) {
		this.ataqueRange = ataqueRange;
	}

	public void setVelocidadeMovimento(Double velocidadeMovimento) {
		this.velocidadeMovimento = velocidadeMovimento;
	}

	public void setCritico(Double critico) {
		this.critico = critico;
	}

	public void setManaRegen(Double manaRegen) {
		this.manaRegen = manaRegen;
	}

	public void setDefesaMagica(Double defesaMagica) {
		this.defesaMagica = defesaMagica;
	}

	public void setVidaRegen(Double vidaRegen) {
		this.vidaRegen = vidaRegen;
	}

	public void setVidaRegenPorLvl(Double vidaRegenPorLvl) {
		this.vidaRegenPorLvl = vidaRegenPorLvl;
	}

	public void setManaRegenPorLvl(Double manaRegenPorLvl) {
		this.manaRegenPorLvl = manaRegenPorLvl;
	}

	public Double getDefesaMagicaPorLvl() {
		return defesaMagicaPorLvl;
	}

	public void setDefesaMagicaPorLvl(Double defesaMagicaPorLvl) {
		this.defesaMagicaPorLvl = defesaMagicaPorLvl;
	}

	public void setVidaPorLvl(Double vidaPorLvl) {
		this.vidaPorLvl = vidaPorLvl;
	}

	public void setManaPorLvl(Double manaPorLvl) {
		this.manaPorLvl = manaPorLvl;
	}

	public void setDanoAtaquePorLvl(Double danoAtaquePorLvl) {
		this.danoAtaquePorLvl = danoAtaquePorLvl;
	}

	public void setArmaduraPorLvl(Double armaduraPorLvl) {
		this.armaduraPorLvl = armaduraPorLvl;
	}

	public void setAtaqueSpeedPorLvl(Double ataqueSpeedPorLvl) {
		this.ataqueSpeedPorLvl = ataqueSpeedPorLvl;
	}

	public void setCriticoPorLvl(Double criticoPorLvl) {
		this.criticoPorLvl = criticoPorLvl;
	}

	public void setItensRecomendados(List<ItemRecomendadoCampeao> itensRecomendados) {
		this.itensRecomendados = itensRecomendados;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

	@Override
	public String toString() {
		return "Campeao [id=" + id + ", "
						+ "idRito=" + idRito + ", "
						+ "nome=" + nome + ", "
						+ "chave=" + chave + ", "
						+ "titulo=" + titulo + ", "
						+ "descricao=" + descricao + ", "
						+ "dicasContra=" + dicasContra + ", "
						+ "dicasCom=" + dicasCom + ", "
						+ "tipos=" + tipos + ", "
						+ "dificuldade=" + dificuldade + ", "
						+ "ataque=" + ataque + ", "
						+ "defesa=" + defesa + ", "
						+ "magia=" + magia + ", "
						+ "mana=" + mana + ", "
						+ "vida=" + vida + ", "
						+ "danoAtaque=" + danoAtaque + ", "
						+ "armadura=" + armadura + ", "
						+ "ataqueRange=" + ataqueRange + ", "
						+ "velocidadeMovimento=" + velocidadeMovimento + ", "
						+ "critico=" + critico + ", "
						+ "manaRegen=" + manaRegen + ", "
						+ "defesaMagica=" + defesaMagica + ", "
						+ "vidaRegen=" + vidaRegen + ", "
						+ "vidaRegenPorLvl=" + vidaRegenPorLvl + ", "
						+ "manaRegenPorLvl=" + manaRegenPorLvl + ", "
						+ "vidaPorLvl=" + vidaPorLvl + ", "
						+ "manaPorLvl=" + manaPorLvl + ", "
						+ "danoAtaquePorLvl=" + danoAtaquePorLvl + ", "
						+ "defesaMagicaPorLvl=" + defesaMagicaPorLvl + ", "
						+ "armaduraPorLvl=" + armaduraPorLvl + ", "
						+ "ataqueSpeedPorLvl=" + ataqueSpeedPorLvl + ", "
						+ "criticoPorLvl=" + criticoPorLvl + "]";
	}
}
