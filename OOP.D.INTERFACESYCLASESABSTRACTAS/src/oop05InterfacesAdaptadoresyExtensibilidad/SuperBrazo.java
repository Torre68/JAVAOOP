package oop05InterfacesAdaptadoresyExtensibilidad;

public class SuperBrazo implements Girable, Rotable {
	// Ahora puedo crearme una clase Superbrazo que implemente las dos interfaces.
	// Lo indico arriba y a traves del asistente del IDE, hago click en la X y
	// selecciono "Add unimplemented methods" y el propio IDE los añade. Solo me
	// quedaria
	// adecuarlos a lo que deseo y listo. Esta es la gran Flexibilidad y
	// Extensibilidad que tiene el manejo de interfaces.

	@Override
	public void rotar() {
		
		System.out.println("El Super brazo rota.");



	}

	@Override
	public void girar() {
		System.out.println("El super brazo gira.");

	}

}
