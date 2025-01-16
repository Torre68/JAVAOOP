package oop02Overriding;

public class Deportista extends Persona {

	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	// public void andar() {
	// Este es el metodo de la subclase, que hara override (sobreescribe) en el de
	// la superclase en
	// tiempo de ejecucion cuando el objeto/instancia sea de la clase deportista.
	// System.out.println("anda a 10km/h.");
	// Esto se puede hacer manualmente o a traves del IDE con boton
	// derecho>source>override/implement methods se escoge el metodo y crearia esta
	// plantilla

	@Override
	// @Override: Anotacion que indica al compilador JAVA que este es un metodo que
	// sobreescribe al de la superclase, por lo que el de la superclase debe existir. De no existir el metodo
	// en la superclase tendriamos un problema de compilacion.
	public void andar() {

		System.out.println(getNombre() + " camina a 10km/h.");
	}

}
