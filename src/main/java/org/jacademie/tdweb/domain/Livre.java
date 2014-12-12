package org.jacademie.tdweb.domain;

public class Livre {

	private String auteur;
	
	private String titre;

	public Livre(String auteur, String titre) {
		super();
		this.auteur = auteur;
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	
}
