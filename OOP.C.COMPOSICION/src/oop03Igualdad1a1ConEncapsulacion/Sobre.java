package oop03Igualdad1a1ConEncapsulacion;

public class Sobre {

	private String color;

	// Para ahorrar trabajo podemos hacer que al crear el sobre, se cree la galleta
	// a la vez. ENCAPSULACION

	// public Sobre(String color, Galleta galleta) { En vez de crear el sobre y
	// asignar la galleta, mejor:
	public Sobre(String color, String sabor, double precio) {

		super();
		this.color = color;
		this.galleta = new Galleta(sabor, precio);
		// Aqui le digo que cree la galleta directamente
	}

	private Galleta galleta;

	// Para acabar de optimizar el programa no deberiamos tener la capacidad de
	// acceder a setGalleta ni getGalleta desde la clase sobre asi que solo
	// necesitamos
	// borrar esos metodos de la clase Sobre. EN ESTE CASO LOS COMENTO POR
	// EJEMPLIFICAR DE MANERA MAS CLARA.

//	public Galleta getGalleta() {
//		return galleta;
//	}
//
//	public void setGalleta(Galleta galleta) {
//		this.galleta = galleta;
//	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	// CREAMOS LA DELEGACION DE METODOS a traves de boton derecho>Source>Generate
	// Delagate Methods y ahi seleccionamos la clase Galleta y de ella los metodos
	// que queremos delegar en la clase sobre

	public String getSabor() {
		return galleta.getSabor();
	}

	public double getPrecio() {
		return galleta.getPrecio();
	}
}
