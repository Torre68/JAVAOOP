package oop01ClasesAbstractas;

public class Coche extends Vehiculo {
	// Una vez especificamos la relacion Coche extends Vehiculo,g eneramos un
	// constructor y seleccionamos el constructor de la Clase abstracta
	// vehiculo.

	public Coche(String marca) {
		super(marca);
	}

	public void acelerar() {
		System.out.println("El coche acelera");
	}

}
