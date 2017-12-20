package com.entity;

public class Categorie {

	private int id_cat;
	private String libelle_cat;
	
	public Categorie(){
		
	}
	
	public Categorie(String libelle_cat) {
		super();
		this.libelle_cat = libelle_cat;
	}

	public int getId_cat() {
		return id_cat;
	}

	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}

	public String getLibelle_cat() {
		return libelle_cat;
	}

	public void setLibelle_cat(String libelle_cat) {
		this.libelle_cat = libelle_cat;
	}

	
	
	
}
