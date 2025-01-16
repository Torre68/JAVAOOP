package oop04InterfacesyAdaptadores;

public class AdaptadorBrazoAcero implements Girable{
	
	private BrazoAcero brazoacero;

	public BrazoAcero getBa() {
		return brazoacero;
	}

	public void setBa(BrazoAcero ba) {
		this.brazoacero = ba;
	}

	public AdaptadorBrazoAcero(BrazoAcero ba) {
		super();
		this.brazoacero = ba;
	}

	@Override
	public void girar() {
		// Este es el metodo que adapta el brazo de acero al robot usando delegacion.
		brazoacero.rotar();
	}
	
	

}
