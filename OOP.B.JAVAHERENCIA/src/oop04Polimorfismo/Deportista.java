package oop04Polimorfismo;

public class Deportista extends Persona {

	// Una vez generado el constructor en la superclase, el IDE nos señala un error
	// en la subclase, si pinchamos sobre el, nos da la opcion de generar el
	// constructor para Deportista adecuado teniendo en cuenta lo hecho en la
	// Superclase Persona. Basta con pinchar en la x roja y Add Constructor
	// 'Deportista(String)'y nos crea el constructor de abajo.
	
	
	
	public Deportista(String nombre) {
		super(nombre);

	}

	public Deportista(String nombre, String deporte) {
		super(nombre);
		this.deporte = deporte;
	}

	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	@Override

	public void andar() {

		System.out.println(getNombre() + " camina a 10km/h.");
	}

}
