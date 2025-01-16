package oop02ThrowExceptions;

public class p01Throw {

	public static void main(String[] args) {

		// Despues de añadir el throw en la Clase Servicio, el chivato del IDE nos
		// indica error. Debemos pinchar y seleccionar surround with TRY/CATCH.

		try {
			Servicio.miMetodo();
		} catch (Exception e) {
			System.out.println("Ventana de Alerta " + e.getMessage());
			;
		}

		// Selecciono todo el codigo de abajo, boton derecho> Refactor>Extract Method y
		// me crea un metodo con el nombre que le haya dado.
		// Despues en el menu de la izquierda despliego a p01Throw selecciono el metodo>
		// Refactor> Move y lo he movido a la Clase Servicio.

		// Ahora vemos los dos mensajes porque estamos en el IDE, pero el del LOG seria
		// para ver los desarroladores el problema a posteriori, y el de la ventana
		// seria el mensaje de alerta para el
		// ususario de la aplicacion web (por ejemplo), y el unico mensaje que veria el
		// usuario final.

	}
}