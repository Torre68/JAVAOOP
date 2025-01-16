package oop01ClasesAbstractas;

public class Moto extends Vehiculo {

	// Lo mismo que en el coche. Tambien se puede añadir el constructor a traves del
	// chivato del IDE, pinchando sobre la X y eligiendo add constructor.
	public Moto(String marca) {
		super(marca);
	}

	public void acelerar() {
		System.out.println("La moto acelera");
	}

}
