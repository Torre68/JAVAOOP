package oop05Casting;

public class Deportista extends Persona {

	
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
