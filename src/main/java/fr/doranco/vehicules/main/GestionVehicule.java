package fr.doranco.vehicules.main;

import java.util.ArrayList;
import java.util.List;

import fr.doranco.vehicules.Avion;
import fr.doranco.vehicules.Vehicule;
import fr.doranco.vehicules.Voiture;
import fr.doranco.vehicules.enums.MarqueAvionEnum;
import fr.doranco.vehicules.enums.MarqueVoitureEnum;
import fr.doranco.vehicules.enums.MoteurEnum;

public class GestionVehicule {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

				List<Vehicule> listeDeVehicules = new ArrayList<Vehicule>();

				Voiture v1 = new Voiture(MarqueVoitureEnum.PEUGEOT.toString(), 2005, 5000, 2.5, 5, 120, 120000);
				Voiture v2 = new Voiture(MarqueVoitureEnum.PORSCHE.toString(), 1999, 250000, 6.5, 2, 280, 813000);
				Avion a1 = new Avion (MarqueAvionEnum.AVION_CESSNA.toString(), 1982, 1230673.90f, MoteurEnum.HELICES.toString(), 250 );
				Avion a2 = new Avion (MarqueAvionEnum.AVION_NAIN_CONNU.toString(), 1993, 4321098.00f, MoteurEnum.REACTION.toString(), 1300 );

				listeDeVehicules.add(v1);
				listeDeVehicules.add(v2);
				listeDeVehicules.add(a1);
				listeDeVehicules.add(a2);
				
				
				
				for (Vehicule v : listeDeVehicules) {
					v.calculerPrix();
					
					v.afficher();
					
				}
				
	}

}
