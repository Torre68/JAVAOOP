package oop01IgualdadentreObjetos;

public class Persona {

	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void Andar() {

		System.out.println(getNombre() + " camina a 5km/h.");
	}
	// El concepto de definir igualdad entre objetos en un concepto de negocio. Es
	// decir, en este caso decidiremos que dos personas con el mismo nombre sean un
	// objeto igual porque nos interesa para implementar una parte del negocio.

	// Para hacer esto necesito generar los metodos hascode a traves de boton
	// derecho>source>Override/Implement methods> y elegir hashcode y equals
	
	
	@Override
	public int hashCode() {
		//devuelve el hashcode del nombre
		return nombre.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		//Primero tengo que hacer un casting
		Persona nueva = (Persona) obj;
		//para luego implementar que devuelva true si los nombres coinciden
		return nueva.getNombre().equals(this.getNombre());
	}

	
	

}
