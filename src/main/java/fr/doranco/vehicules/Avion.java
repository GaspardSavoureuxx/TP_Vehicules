package fr.doranco.vehicules;

public final class Avion extends Vehicule {
	
	private String typeMoteur ;
	private int heuresVol ;
	
	
	public Avion() {
		super();
	}


	public Avion(String marque, int anneeAchat, float prixAchat, String typeMoteur, int heuresVol) {
	super(marque, anneeAchat, prixAchat);
	this.typeMoteur = typeMoteur;
	this.heuresVol = heuresVol;
	}


	public void afficher() {
		System.out.println(" Avion : ");
		System.out.println(" [marque=" + marque + ", anneeAchat=" + anneeAchat + ", prixAchat=" + prixAchat
				+ ", prixCourant=" + prixCourant + ", typeMoteur=" + typeMoteur + ", heuresVol=" + heuresVol +  "]");

	}
	



	public final void calculerPrix() {
		double decote;
		if (typeMoteur == "HELICES"){ 
			 decote = heuresVol / 1000;
			}
		else {
			decote = heuresVol / 10000;
		}		
		prixCourant = (1 - decote ) * prixAchat;
		if (prixCourant < 0) {prixCourant = 0;}	

		
	}
	
	
	
	
	


}
