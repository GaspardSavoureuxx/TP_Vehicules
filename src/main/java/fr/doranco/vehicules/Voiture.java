package fr.doranco.vehicules;

import java.time.Year;

public final class Voiture extends Vehicule {
	
	private double cylindre ;
	private int nbPortes ;
	private double puissance ;
	private double kilometrage ;
	
	// 1er constructeur
	public Voiture () {
		super();
	};
	
	
	// 2e constructeur
	public Voiture(String marque, int anneeAchat, int prixAchat, double cylindre, int nbPortes, double puissance,
			double kilometrage) {
		super(marque, anneeAchat, prixAchat);
		this.cylindre = cylindre;
		this.nbPortes = nbPortes;
		this.puissance = puissance;
		this.kilometrage = kilometrage;
	}
	


	@Override
	public void afficher() {
		System.out.println(" Voiture : ");
		System.out.println(" [marque=" + marque + ", anneeAchat=" + anneeAchat + ", prixAchat=" + prixAchat
				+ ", prixCourant=" + prixCourant + ", cylindre = " + cylindre + ", nbPortes=" + nbPortes + ", puissance=" + puissance
				+ ", kilometrage=" + kilometrage + "]");

	}
	
	
	





	public final void calculerPrix() {
		short year = (short)Year.now().getValue();
		double decote = (year - anneeAchat) * 0.02;
		decote = decote + (kilometrage / 1000) * 0.05;
		if (marque == "PORSCHE" ||marque == "FERRARI" ){ 
			decote = (decote - 0.2);
			}
		else if (marque == "FIAT" ||marque == "RENAULT") {
			decote = (decote + 0.1);
		}
		prixCourant = Math.max(0, (1.0 - decote ) * prixAchat) ;
	}
	
	
	
	
	

}
