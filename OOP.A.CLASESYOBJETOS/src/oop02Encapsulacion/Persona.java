package oop02Encapsulacion;

public class Persona {
	// ENCAPSULACION
	// Restringir el acceso a las propiedades, para por ejemplo evitar que se pueda
	// asignar como edad un numero negativo o un valor irreal como 200.
	// Al declarar nuestras variables como private restringimos el acceso
	private String nombre;
	private String apellidos;
	private int edad;

	// y para controlar el acceso generamos los metodos getter and setter (acceder y
	// establecer)
	// donde podremos controlar que no se inserten valores irreales para la edad.
	// esto se puede hacer manualmente, pero la mejor manera es: boton
	// derecho>source>generate getters and setters y una vez en el menu
	// seleccionamos de que variables queremos crear los getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		// Estos this. se denominan operadores de ambito

	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		// Y ahora gracias a las variables private, los getter and setter y los
		// operadores de ambito this. puedo restringir la edad maxima y minima que se le
		// puede dar a la instancia/objeto de persona creado, para no dar una edad irreal

		if (edad > 120) {
			this.edad = 120;
		} else if (edad < 0) {
			this.edad = 0;

		}
	}
}
