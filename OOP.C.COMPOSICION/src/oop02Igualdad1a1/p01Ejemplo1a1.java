package oop02Igualdad1a1;

public class p01Ejemplo1a1 {

	public static void main(String[] args) {

		Galleta g = new Galleta("chocolate", 2.50);

		Sobre s = new Sobre();
		s.setColor("marron");

		s.setGalleta(g);

		System.out.println("El sobre " + s.getColor() + " contiene una galleta de sabor a " + s.getGalleta().getSabor()
				+ " que tiene un precio de " + s.getGalleta().getPrecio() + "€");

	}

}
