package com.entity;

public class Marque {

	private int id_marque;
	private String libelle_marque;

	public int getId_marque() {
		return id_marque;
	}

	public void setId_marque(int id_marque) {
		this.id_marque = id_marque;
	}

	public String getLibelle_marque() {
		return libelle_marque;
	}

	public void setLibelle_marque(String libelle_marque) {
		this.libelle_marque = libelle_marque;
	}

	public Marque(String libelle_marque) {
		super();
		this.libelle_marque = libelle_marque;
	}

}
