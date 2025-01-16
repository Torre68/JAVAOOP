package oop02Overriding;

public class Persona {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void andar () {
		//Este es le metodo de la Superclase
		System.out.println("anda a 5km/h");
	}
	
	

}
