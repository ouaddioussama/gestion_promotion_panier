package com.entity;

public class Panier {

	public Panier(Client client, Status_commande status, String contenu) {
		super();
		this.client = client;
		this.status = status;
		this.contenu = contenu;
	}

	private int id_panier;
	private Client client;
	private Status_commande status;
	private String contenu;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Status_commande getStatus() {
		return status;
	}

	public void setStatus(Status_commande status) {
		this.status = status;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

}
