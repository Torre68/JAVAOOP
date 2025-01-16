package oop05InterfacesAdaptadoresyExtensibilidad;

public class AdaptadorBrazoAcero implements Girable{
	
	//Al haber creado la interfaz, vemos como el IDE ha cambiado:
//	private BrazoAcero brazoacero;
//
//	public BrazoAcero getBa() {
//		return brazoacero;
//	} por la interfaz Rotable.
	
	private Rotable brazoacero;

	public Rotable getBa() {
		return brazoacero;
	}

	public void setBa(Rotable ba) {
		this.brazoacero = ba;
	}

	public AdaptadorBrazoAcero(Rotable ba) {
		super();
		this.brazoacero = ba;
	}

	@Override
	public void girar() {
		// Este es el metodo que adapta el brazo de acero al robot usando delegacion.
		brazoacero.rotar();
	}
	
	

}
