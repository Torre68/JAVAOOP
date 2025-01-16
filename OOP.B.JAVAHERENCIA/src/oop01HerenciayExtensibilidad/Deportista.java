package oop01HerenciayExtensibilidad;

public class Deportista extends Persona {
    //La herencia se denota con el comando extends, 
	// esto puede hacerse manualmente o cuando se crea la subclase/clase hija
	// escogerlo en la pestaña de superclass del IDE.
	
	private String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	

}
