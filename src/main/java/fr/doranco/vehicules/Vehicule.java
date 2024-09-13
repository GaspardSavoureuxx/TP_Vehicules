package fr.doranco.vehicules;

import java.time.Year;

public class Vehicule {
	
	protected String marque;
	protected int anneeAchat;
	protected float prixAchat; 
	protected double prixCourant;
	
	public Vehicule() {}
	
	
	public Vehicule(String marque, int anneeAchat, float prixAchat) {
		this.marque = marque;
		this.anneeAchat = anneeAchat;
		this.prixAchat = prixAchat;
	}


	public void afficher() {
		System.out.println( "Vehicule [marque=" + marque + ", anneeAchat=" + anneeAchat + ", prixAchat=" + prixAchat
				+ ", prixCourant=" + prixCourant + "]" );
	}

	public void calculerPrix() {
		int year = Year.now().getValue();
		double decote = (year - anneeAchat) * 0.01;
		prixCourant = (1 - decote ) * prixAchat;
		if (prixCourant < 0) {prixCourant = 0;}
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public int getAnneeAchat() {
		return anneeAchat;
	}


	public void setAnneeAchat(int anneeAchat) {
		this.anneeAchat = anneeAchat;
	}


	public float getPrixAchat() {
		return prixAchat;
	}


	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}


	public double getPrixCourant() {
		return prixCourant;
	}


	public void setPrixCourant(double prixCourant) {
		this.prixCourant = prixCourant;
	};
	
	
	
	
	
	

}
