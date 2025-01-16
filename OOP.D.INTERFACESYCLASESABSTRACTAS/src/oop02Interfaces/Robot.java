package oop02Interfaces;

public class Robot {
	//DEFINIMOS ESTA PROPIEDAD A TRAVES DE LA COMPOSICION
	//y se apoya en polimorfismo
	private Brazo brazo;

	public Brazo getBrazo() {
		return brazo;
	}

	public void setBrazo(Brazo brazo) {
		this.brazo = brazo;
	}
	public void girarBrazo() {
	
	brazo.girar(); }

}
