package fr.doranco.vehicules.enums;

public enum MoteurEnum {
	HELICES (" hélices "), 
	REACTION ( " à réaction ");
	
	private String value;

	private MoteurEnum(String value) {
	this.value = value;
	}

	public String getValue() {
		return value;
	}

}
