package oop03Interfaces2;

public class oop03Interfaces {

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

		// Ahora tenemos una jerarquia de clases con la superclase abstracta Brazo (que
		// evita la repeticion de codigo)y sus
		// subclases brazonormal y brazorapido que hacen uso de la interfaz girable, y
		// una clase separada coctelera que tambien hace uso de la interfaz. Ahora el
		// robot lo que recibe son interfaces y usa cualquiera de los tres elementos
		// (brazonormal, brazorapido o coctelera)
		//En JAVA una CLASE puede IMPLEMENTAR multiples INTERFACES, no hay limite.
		

	}

}
