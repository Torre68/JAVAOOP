package oop03Igualdad1a1ConEncapsulacion;

public class p01Ejemplo1a1 {

	public static void main(String[] args) {

		Sobre s = new Sobre("marron", "chocolate", 2.50);

		// System.out.println("El sobre " + s.getColor() + " contiene una galleta de
		// sabor a " + s.getGalleta().getSabor()
		// + " que tiene un precio de " + s.getGalleta().getPrecio() + "€");
		// Se puede optimizar el programa para no tener que usar tanto codigo para
		// acceder desde
		// el sobre a getPrecio o getSabor (s.getGalleta().getSabor()), como en el
		// ejemplo de arriba.
		// Esto se lleva a cabo a traves de la delegacion de metodos en la Clase.

		System.out.println("El sobre " + s.getColor() + " contiene una galleta de sabor a " + s.getSabor()
				+ " que tiene un precio de " + s.getPrecio() + "€");

		// Para acabar de optimizar el programa no deberiamos tener la capacidad de
		// acceder a setGalleta ni getGalleta desde la clase sobre asi que solo
		// necesitamos
		// borrar esos metodos de la clase Sobre.
		// Ahora introduciendo s. no nos saldrian las opciones arriba descritas.

		// Al final hemos ocultado por completo la Clase Galleta, aunque es necesaria y
		// trabajamos con ella, lo hacemos desde la Clase Sobre porque resulta mas util
		// y necesita mucho menos codigo para desempeñar la tarea que se requiera.
		
	}

}
