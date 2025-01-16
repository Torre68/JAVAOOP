package oop04InterfacesyAdaptadores;

public abstract class Brazo {

	// Para evitar la repeticion de codigo en dos o mas clases (en este caso
	// brazonormal y brazorapido) podemos extraer una superclase a traves del
	// asistente del IDE. Seleccionamos la clase desde la cual queremos crear la
	// superclase y
	// boton derecho> Refactor> extract superclass> dar un nombre, elegir los
	// elementos (variables, getters and setters...) >next>next y Finish

	private String tipoAspa;

	public Brazo() {
		super();
	}

	public String getTipoAspa() {
		return tipoAspa;
	}

	public void setTipoAspa(String tipoAspa, Brazonormal brazonormal) {
		this.tipoAspa = tipoAspa;
	}

}