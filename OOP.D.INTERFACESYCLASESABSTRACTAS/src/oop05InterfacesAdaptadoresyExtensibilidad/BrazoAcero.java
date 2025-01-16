package oop05InterfacesAdaptadoresyExtensibilidad;

public class BrazoAcero implements Rotable {
	// A partir de esta clase vamos a crear otra interfaz para que si tenemos mas
	// objetos rotables los podamos usar. Lo hacemos a traves de
	// Refactor(Alt+Shift+T)>Extract Interface>Nombramos la interfaz y extraemos el
	// metodo que queremos que esa interfaz maneje. Una vez hecho, veremos que el
	// IDE ha cambiado por si mismo el AdaptadorBrazoAcero para que tengan efecto la
	// creacion de la nueva interfaz.

	@Override
	public void rotar() {

		System.out.println("El brazo de acero rota a 50rpm.");
	}
}