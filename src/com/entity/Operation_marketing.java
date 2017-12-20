package com.entity;

public class Operation_marketing {
	 public Operation_marketing(Promotion promo, Produit produit) {
		super();
		this.promo = promo;
		this.produit = produit;
	}
	private int id_operation;
	 private Promotion promo;
	 private Produit produit;
	public Promotion getPromo() {
		return promo;
	}
	public void setPromo(Promotion promo) {
		this.promo = promo;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	 
	 

}
