package com.entity;

public class Status_commande {

	public Status_commande(String libelle_status) {
		super();
		this.libelle_status = libelle_status;
	}
	private int id_status;
	private String libelle_status;
	
	
	public int getId_status() {
		return id_status;
	}
	public void setId_status(int id_status) {
		this.id_status = id_status;
	}
	public String getLibelle_status() {
		return libelle_status;
	}
	public void setLibelle_status(String libelle_status) {
		this.libelle_status = libelle_status;
	}
	
	
	
	

}
