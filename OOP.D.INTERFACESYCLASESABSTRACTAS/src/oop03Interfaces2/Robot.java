package oop03Interfaces2;

public class Robot {
	
	private Girable brazo;

	public Girable getBrazo() {
		return brazo;
	}

	public void setBrazo(Girable brazo) {
		this.brazo = brazo;
	}
	public void girarBrazo() {
	
	brazo.girar(); }

}
