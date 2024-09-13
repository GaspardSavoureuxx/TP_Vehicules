package fr.doranco.vehicules.enums;

public enum MarqueAvionEnum {
	
	AVION_CESSNA (" Avion Cessna"),
	AVION_NAIN_CONNU ("Avion nain connu");
	
	
	private String value;

	private MarqueAvionEnum(String value) {
	this.value = value;
	}

	public String getValue() {
		return value;
	}

}
