package oop03ThrowPersonalizedExceptions;

public class ServicioException extends Exception {

	// Primero, creamos una clase y escogemos como Superclase a Exception.
	// Segundo, generamos Los constructores from SuperClass. Boton derecho>Source>Generate
	// Constructors from SuperClass.. Seleccionamos todos.
	
	
	public ServicioException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServicioException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ServicioException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ServicioException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ServicioException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}


}
