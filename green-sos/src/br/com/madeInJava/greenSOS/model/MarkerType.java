package br.com.madeInJava.greenSOS.model;

public enum MarkerType {

	PAPER("paper", ""), 
	PLASTIC("plastic", ""), 
	METAL("metal", ""), 
	GLASS("glass", ""),
	ALL_TYPES("all_types", "");

	private String name;
	private String iconSRC;

	private MarkerType(String name, String iconSRC) {
		this.name = name;
		this.iconSRC = iconSRC;
	}

	public String getName() {
		return name;
	}

	public String getIconSRC() {
		return iconSRC;
	}
}
