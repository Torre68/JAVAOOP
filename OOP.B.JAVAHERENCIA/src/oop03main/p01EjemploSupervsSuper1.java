package oop03main;

import oop03SuperConParentesisvsSuper.Deportista;
import oop03SuperConParentesisvsSuper.Persona;

//Aqui vemos que como al mover el main (este codigo) a otro package tiene que importar las 
//clases para poder trabajar con ellas, pero al hacer esto no se puede acceder desde aqui al
//asistente del IDE para encontrar d.imprimeandar()
public class p01EjemploSupervsSuper1 {

	public static void main(String[] args) {

		Persona p = new Persona("Manolo");
		// Con los constructores uso el Super() para invocar al constructor de la
		// superclase desde la subclase

		Deportista d = new Deportista("Rafa", "Tenis");

		// Al introducir d. o p. el asistente del IDE ya nos nos da la opcion de escoger
		// imprimeandar();

		p.andar();
		System.out.println("El deportista " + d.getNombre() + " se dedica a jugar al " + d.getDeporte());
		d.andar();

	}

}
