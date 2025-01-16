package oop04UncheckedExceptionsRuntime;

public class p01UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p = null;
		
		System.out.println(p.getNombre());
		
		
//		En Java, las excepciones se dividen en dos categorías principales: excepciones chequeadas (checked exceptions) y excepciones no chequeadas (unchecked exceptions).
//		Excepciones No Chequeadas
//
//		Las excepciones no chequeadas son aquellas que no están obligadas a ser declaradas en la cláusula throws de un método ni a ser manejadas con un bloque try-catch. Estas excepciones heredan de la clase RuntimeException o de la clase Error.
//		Características de las Excepciones No Chequeadas
//
//		    No es necesario manejarlas: No es obligatorio que un método declare estas excepciones en su firma, ni que el código que las invoca las maneje.
//		    Por lo general, indican errores de programación: Las excepciones no chequeadas a menudo indican errores que podrían haberse evitado mediante una mejor programación, como NullPointerException, ArrayIndexOutOfBoundsException, etc.
//		    Herencia: Todas las excepciones no chequeadas son subclases de RuntimeException o Error.
//
//		Ejemplos Comunes de Excepciones No Chequeadas
//
//		    NullPointerException: Ocurre cuando se intenta utilizar un objeto que es null.
// ArrayIndexOutOfBoundsException: Ocurre cuando se intenta acceder a un índice que está fuera de los límites de un arreglo
		//ClassCastException: Ocurre cuando se intenta realizar un casting a un tipo incompatible.
		//llegalArgumentException: Ocurre cuando un método recibe un argumento inapropiado.
	}

}
