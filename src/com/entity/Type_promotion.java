package com.entity;

import javax.persistence.Entity;

@Entity

public class Type_promotion {

	public Type_promotion(String libelle_promo) {
		super();
		this.libelle_promo = libelle_promo;
	}

	private int id_promo;
	private String libelle_promo;

	public int getId_promo() {
		return id_promo;
	}

	public void setId_promo(int id_promo) {
		this.id_promo = id_promo;
	}

	public String getLibelle_promo() {
		return libelle_promo;
	}

	public void setLibelle_promo(String libelle_promo) {
		this.libelle_promo = libelle_promo;
	}

}
