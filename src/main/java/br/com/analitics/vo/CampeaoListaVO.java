package br.com.analitics.vo;

public class CampeaoListaVO {
	private Long id;
	private String nome;
	private String chave;
	
	public CampeaoListaVO() {
	}

	public CampeaoListaVO(Long id, String nome, String chave) {
		this.id = id;
		this.nome = nome;
		this.chave = chave;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getChave() {
		return chave;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setChave(String chave) {
		this.chave = chave;
	}

	@Override
	public String toString() {
		return "CampeaoListaVO [id=" + id + ", " +
								"nome=" + nome + ", " + 
								"chave=" + chave + "]";
	}
}
