package oop01TryCatch;

import java.io.File;
import java.io.IOException;

public class p01TryCatch {

	public static void main(String[] args) {

		try {
			// TRY, con esto el IDE intentara ejecutar el programa, si no hay un evento, lo
			// ejecutara sin problemas.

			// La unidad F no exixte por lo que nos saltara un error.
			// Para que el programa compile le tenemos que introducir la clausula TRY/CATCH
			// de manejo de expcepciones
			File f = new File("F://hola.txt");
			f.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} // CATCH intentara coger el error que imposibilite que el programa se ejecute
			// correctamente y transformalo en un objeto IOException "e". Con el
			// System.out.println(e.getMessage()); lo que hara el TRY/CATCH es devolvernos
			// el mensaje que nos alerte del error, o con el e.printStackTrace();
			// En Java, printStackTrace() es un método de la clase Throwable, que es la
			// clase base para todos los errores y excepciones que pueden ocurrir en un
			// programa. Este método se utiliza para imprimir en la salida estándar
			// (normalmente la consola) la traza de la pila (stack trace) del error o
			// excepción que se ha producido.La traza de la pila es una representación del
			// estado de la pila de llamadas en el momento en que se lanzó la excepción.
			// Esto incluye información sobre la clase, el método y la línea de código donde
			// ocurrió la excepción, así como las llamadas a métodos que llevaron a ese
			// punto. Esta información es muy útil para la depuración, ya que permite a los
			// desarrolladores identificar rápidamente la causa de un error.

	}

}
