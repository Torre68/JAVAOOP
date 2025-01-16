package oop03SuperConParentesisvsSuper;

public class Persona {

	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
//Creo el constructor de la superclase con el asistente del IDE.
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	void imprimeandar() {
		System.out.print(getNombre() + " anda a ");
		// Este metodo no puede ser private porque entonces la subclase no podria
		// acceder a el.
		// creo otro metodo y para que este metodo no pueda ser accesible desde la
		// instancia/objeto lo declaro void y entonces solo podra ser accedido dentro
		// del mismo package. Por lo que creo un package para el main y lo muevo ahi
		// para que desde el main no se pueda acceder a el.

		
	}

	public void andar() {
		imprimeandar();
		System.out.println("5km/h.");
	}

}
