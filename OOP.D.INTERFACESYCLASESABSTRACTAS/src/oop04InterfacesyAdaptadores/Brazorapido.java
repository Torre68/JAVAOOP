package oop04InterfacesyAdaptadores;

public class Brazorapido extends Brazo implements Girable {

	// Una vez creada la superclase, aqui solo tengo que indicarlo con el extends y
	// puedo borrar el resto.
	

	public void girar() {

		System.out.println("EL brazo gira a 40rpm");
	}

}
