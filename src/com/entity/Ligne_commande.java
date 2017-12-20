package com.entity;

import javax.persistence.Entity;

@Entity

public class Ligne_commande {

  private int id_ligne ;
  private Panier panier;
  private Produit produit  ;
  private double quantité;
  private Double prix_inital;
  private Double prix_encours;
  
  public Ligne_commande(Panier panier, Produit produit, double quantité, Double prix_inital, Double prix_encours) {
		super();
		this.panier = panier;
		this.produit = produit;
		this.quantité = quantité;
		this.prix_inital = prix_inital;
		this.prix_encours = prix_encours;
	}

public Panier getPanier() {
	return panier;
}

public void setPanier(Panier panier) {
	this.panier = panier;
}

public Produit getProduit() {
	return produit;
}

public void setProduit(Produit produit) {
	this.produit = produit;
}

public double getQuantité() {
	return quantité;
}

public void setQuantité(double quantité) {
	this.quantité = quantité;
}

public Double getPrix_inital() {
	return prix_inital;
}

public void setPrix_inital(Double prix_inital) {
	this.prix_inital = prix_inital;
}

public Double getPrix_encours() {
	return prix_encours;
}

public void setPrix_encours(Double prix_encours) {
	this.prix_encours = prix_encours;
}
  

  
  
  
  
}
