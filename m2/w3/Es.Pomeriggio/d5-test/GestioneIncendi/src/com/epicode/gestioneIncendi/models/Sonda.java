package com.epicode.gestioneIncendi.models;

public class Sonda {

	private Long id;
	private Double latitudine;
	private Double longitudine;
	private Double smokeLevel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(Double latitudine) {
		this.latitudine = latitudine;
	}

	public Double getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(Double longitudine) {
		this.longitudine = longitudine;
	}

	public Double getSmokeLevel() {
		return smokeLevel;
	}

	public void setSmokeLevel(Double smokeLevel) {
		this.smokeLevel = smokeLevel;
	}

	public Sonda(Long id, Double latitudine, Double longitudine, Double smokeLevel) {
		super();
		this.id = id;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.smokeLevel = smokeLevel;
	}
}
