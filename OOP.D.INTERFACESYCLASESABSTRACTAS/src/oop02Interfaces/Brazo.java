package oop02Interfaces;

public abstract class Brazo {
	
	private String tipoAspa;
	
	public String getTipoAspa() {
		return tipoAspa;
	}

	public void setTipoAspa(String tipoAspa) {
		this.tipoAspa = tipoAspa;
	}

	public abstract void girar ();

}
