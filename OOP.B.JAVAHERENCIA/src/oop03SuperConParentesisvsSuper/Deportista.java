package oop03SuperConParentesisvsSuper;

public class Deportista extends Persona {

	private String deporte;

	public Deportista(String nombre) {
		// Y aqui creo un constructor que llame al constructor de la Superclase para
		// utilizarlo.
		super(nombre);
		// this() esto no podria ser utilizado, o super() o this() pero los dos no se
		// pueden utilizar juntos

	}

	public Deportista(String nombre, String deporte) {
		super(nombre);
		this.deporte = deporte;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	@Override
	public void andar() {
		// Aqui usamos SUPER para forzar a que se trabaje con el metodo imprimeandar()
		// de
		// la superclase y reutilizar el codigo de esta.

		super.imprimeandar();
		System.out.println("10km/h.");
	}

}
