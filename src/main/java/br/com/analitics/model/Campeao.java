package br.com.analitics.model;

public class Campeao {
	private Long id;
	
	private Integer idRito;
	
	private String nome;
	
	private String chave;
	
	private String titulo;
	
	private String descricao;
	
	private String dicasContra; 

	private String dicasCom; 
	
	private String tipos; 


	private Integer ataque;
	
	private Integer defesa;
	
	private Integer magia;
	
	private Double mana;
	
	private Double vida;

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
						+ "tipos=" + tipos + ", ";
	}
}
