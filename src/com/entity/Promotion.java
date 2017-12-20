package com.entity;

import java.util.Date;

public class Promotion {


	public Promotion(String code_promo, Type_promotion type_promotion, float pourcentage_reduc, Double valeur_reduc,
			Date date_debut, Date date_fin) {
		super();
		this.code_promo = code_promo;
		this.type_promotion = type_promotion;
		this.pourcentage_reduc = pourcentage_reduc;
		this.valeur_reduc = valeur_reduc;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}

	private int id_promo;
	private String code_promo;
	private Type_promotion type_promotion;
	private float pourcentage_reduc;
	private Double valeur_reduc;
	private Date date_debut;
	private Date date_fin;
	
	
	

	public String getCode_promo() {
		return code_promo;
	}

	public void setCode_promo(String code_promo) {
		this.code_promo = code_promo;
	}

	public Type_promotion getType_promotion() {
		return type_promotion;
	}

	public void setType_promotion(Type_promotion type_promotion) {
		this.type_promotion = type_promotion;
	}

	public float getPourcentage_reduc() {
		return pourcentage_reduc;
	}

	public void setPourcentage_reduc(float pourcentage_reduc) {
		this.pourcentage_reduc = pourcentage_reduc;
	}

	public Double getValeur_reduc() {
		return valeur_reduc;
	}

	public void setValeur_reduc(Double valeur_reduc) {
		this.valeur_reduc = valeur_reduc;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	
}
