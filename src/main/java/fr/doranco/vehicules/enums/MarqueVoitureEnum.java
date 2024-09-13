package fr.doranco.vehicules.enums;

public enum MarqueVoitureEnum {
	
	RENAULT ("Renault"),
	PEUGEOT ("Peugeot"),
	FIAT ("Fiat"),
	PORSCHE ("Porsche"),
	FERRARI ("Ferrari");

	private String value;

	private MarqueVoitureEnum(String value) {
	this.value = value;
	}

	public String getValue() {
		return value;
	}


}
