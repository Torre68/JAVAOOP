package oop05RelacionNaN;

import java.util.ArrayList;

public class Casa {

	private String direccion;
	ArrayList<Persona> personas;

	// Ahora para que la utilidad sea mejor, generamos a traves del asistente del
	// IDE los metodos delegados para añadir persona/s a la casa/s y para ver el
	// contenido de la/s casa/s. Boton derecho>source>generate delegate methods y
	// añadimos los que deseamos, en este caso los anteriormente explicados
	public boolean contains(Object arg0) {
		return personas.contains(arg0);
	}
	
	public boolean add(Persona arg0) {
		return personas.add(arg0);
	}

	public Casa(String direccion) {
		super();
		this.direccion = direccion;
		this.personas = new ArrayList<Persona>();
		// Este constructor inicializa un objeto de la clase Casa con una dirección y
		// crea una lista vacía para almacenar objetos de la clase Persona.
	}


	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int totalPersonas () {
		
		return personas.size();
	}

	public boolean remove(Object o) {
		return personas.remove(o);
	}

	public void clear() {
		personas.clear();
	}

}
