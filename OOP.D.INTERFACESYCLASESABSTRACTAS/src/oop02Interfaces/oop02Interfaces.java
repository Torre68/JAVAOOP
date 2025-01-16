package oop02Interfaces;

public class oop02Interfaces {

	public static void main(String[] args) {

		Brazo bn = new Brazonormal();
		Brazo br = new Brazorapido();
		Robot r = new Robot();

		r.setBrazo(bn);
		r.girarBrazo();

		r.setBrazo(br);
		r.girarBrazo();

		Brazo c = new Coctelera();
		r.setBrazo(c);
		r.girarBrazo();

		c.getTipoAspa(); // Esto es un fallo a nivel logico porque las cocteleras no tienen aspas y viene
							// como resultado de crear la coctelera con herencia de Brazo

	}

}
