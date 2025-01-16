package oop02Igualdad1a1;

public class Sobre {

	private String color;

	// Para construir una relacion 1 a 1 en JAVA necesitamos crear una variable en
	// una clase que referencie a la otra clase
	
	private Galleta galleta;

	public Galleta getGalleta() {
		return galleta;
	}

	public void setGalleta(Galleta galleta) {
		this.galleta = galleta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
