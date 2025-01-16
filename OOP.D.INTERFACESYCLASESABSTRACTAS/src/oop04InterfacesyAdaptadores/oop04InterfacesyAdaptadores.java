package oop04InterfacesyAdaptadores;

public class oop04InterfacesyAdaptadores {

	public static void main(String[] args) {

		Girable bn = new Brazonormal();
		Girable br = new Brazorapido();
		Robot r = new Robot();

		r.setBrazo(bn);
		r.girarBrazo();

		r.setBrazo(br);
		r.girarBrazo();

		Girable c = new Coctelera();
		r.setBrazo(c);
		r.girarBrazo();

		BrazoAcero ba = new BrazoAcero();
		
		// r.setBrazo(ba); Esto nos da error ya que no podemos asignar al robot el brazo
		// de acero por lo cual necesitamos el adaptador. Los adaptadores son muy utiles
		// cuando no tenemos acceso al codigo fuente o no podemos tocarlo o los
		// programas evolucionan y ahora las clases no cumplen especificamente con las
		// expectativas de la interfaz.
		
		r.setBrazo(new AdaptadorBrazoAcero(ba));
		r.girarBrazo();

	}

}
