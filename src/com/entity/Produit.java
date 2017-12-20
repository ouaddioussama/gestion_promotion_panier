package com.entity;

import javax.persistence.Entity;

@Entity

public class Produit {

	private int id_prod;
	private String libelle_prod;
	private double prix_prod;

	private Marque marque;
	private Categorie categorie;

	public String getLibelle_prod() {
		return libelle_prod;
	}

	public void setLibelle_prod(String libelle_prod) {
		this.libelle_prod = libelle_prod;
	}

	public double getPrix_prod() {
		return prix_prod;
	}

	public void setPrix_prod(double prix_prod) {
		this.prix_prod = prix_prod;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
