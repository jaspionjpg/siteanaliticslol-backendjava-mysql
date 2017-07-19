package br.com.analitics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.analitics.abstracts.AbstractEntity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="estatistica_time")
public class EstatisticaTime extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Long id;
	
	@Column(name="vencedor", nullable=false)
	private Boolean vencedor;
	
	
	@Column(name="baraoKills", nullable=false)
	private Integer baraoKills;
	
	@Column(name="dragaoKills", nullable=false)
	private Integer dragaoKills;
	
	@Column(name="inibidoresKills", nullable=false)
	private Integer inibidoresKills;

	@Column(name="torresKills", nullable=false)
	private Integer torresKills;
	
	@Column(name="firstBlood", nullable=false)
	private Boolean firstBlood;
	
	@Column(name="firstTower", nullable=false)
	private Boolean firstTower;
	
	@Column(name="firstInibidor", nullable=false)
	private Boolean firstInibidor;
	
	@Column(name="firstBarao", nullable=false)
	private Boolean firstBarao;
	
	@Column(name="firstDragao", nullable=false)
	private Boolean firstDragao;
	
	@Column(name="firstArauto", nullable=false)
	private Boolean firstArauto;
	
	@Column(name="ladoTime", nullable=false)
	private Boolean ladoTime;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTime", nullable=false)
	private Time time;

	public Long getId() {
		return id;
	}

	public Boolean getVencedor() {
		return vencedor;
	}

	public Integer getBaraoKills() {
		return baraoKills;
	}

	public Integer getDragaoKills() {
		return dragaoKills;
	}

	public Integer getInibidoresKills() {
		return inibidoresKills;
	}

	public Integer getTorresKills() {
		return torresKills;
	}

	public Boolean getFirstBlood() {
		return firstBlood;
	}

	public Boolean getFirstTower() {
		return firstTower;
	}

	public Boolean getFirstInibidor() {
		return firstInibidor;
	}

	public Boolean getFirstBarao() {
		return firstBarao;
	}

	public Boolean getFirstDragao() {
		return firstDragao;
	}

	public Boolean getLadoTime() {
		return ladoTime;
	}

	public Time getTime() {
		return time;
	}

	public Boolean getFirstArauto() {
		return firstArauto;
	}

	public void setFirstArauto(Boolean firstArauto) {
		this.firstArauto = firstArauto;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setVencedor(Boolean vencedor) {
		this.vencedor = vencedor;
	}

	public void setBaraoKills(Integer baraoKills) {
		this.baraoKills = baraoKills;
	}

	public void setDragaoKills(Integer dragaoKills) {
		this.dragaoKills = dragaoKills;
	}

	public void setInibidoresKills(Integer inibidoresKills) {
		this.inibidoresKills = inibidoresKills;
	}

	public void setTorresKills(Integer torresKills) {
		this.torresKills = torresKills;
	}

	public void setFirstBlood(Boolean firstBlood) {
		this.firstBlood = firstBlood;
	}

	public void setFirstTower(Boolean firstTower) {
		this.firstTower = firstTower;
	}

	public void setFirstInibidor(Boolean firstInibidor) {
		this.firstInibidor = firstInibidor;
	}

	public void setFirstBarao(Boolean firstBarao) {
		this.firstBarao = firstBarao;
	}

	public void setFirstDragao(Boolean firstDragao) {
		this.firstDragao = firstDragao;
	}

	public void setLadoTime(Boolean ladoTime) {
		this.ladoTime = ladoTime;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "EstatisticaTime [id=" + id + ", "
				+ "vencedor=" + vencedor + ", "
				+ "baraoKills="	+ baraoKills + ", "
				+ "dragaoKills=" + dragaoKills + ", "
				+ "inibidoresKills=" + inibidoresKills + ", "
				+ "torresKills=" + torresKills + ", "
				+ "firstArauto=" + firstArauto + ", "
				+ "firstBlood=" + firstBlood + ", "
				+ "firstTower="	+ firstTower + ", "
				+ "firstInibidor=" + firstInibidor + ", "
				+ "firstBarao=" + firstBarao + ", "
				+ "firstDragao=" + firstDragao + ", "
				+ "ladoTime=" + ladoTime + ", "
				+ "time=" + time + "]";
	}
}