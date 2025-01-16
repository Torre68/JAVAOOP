package oop04Relacion1aN.ARRAYLIST;

import java.util.ArrayList;

public class CajaGalletas {

	// private ArrayList <Galleta> galletas = new ArrayList<Galleta> ();

	// Creamos el constructor, pero esta vez al hacerlo no seleccionamos nada y nos
	// sale esto

	// public CajaGalletas() {
//		super();
//	} Que procederemos a convertirlo manualmente en:

	private ArrayList<Galleta> galletas;

	public CajaGalletas() {
		galletas = new ArrayList<Galleta>();
	}

	public ArrayList<Galleta> getGalletas() {
		return galletas;
	}

	public void setGalletas(ArrayList<Galleta> galletas) {
		this.galletas = galletas;
	}

	public void addGalleta(Galleta galleta) {
		// Con este metodo delego desde la clase Galleta a la Clase CajaGalletas para
		// que el ArrayList añada Galletas
		galletas.add(galleta);
	}

	// Con este metodo creo una SOBRECARGA ESTATICA (multiples metodos con mismo
	// nombre) para añadir galletas de manera mas comoda
	public void addGalleta(String sabor, double precio) {

		galletas.add(new Galleta(sabor, precio));
	}

	public int totalGalletas() {
		// Cuando creo un metodo sin void siempre tiene que return algo.
		return galletas.size();
		// Los Arrays tienen la propiedad .length, los ArrayList la propiedad .size
	}

	public double precioTotal() {

		double total = 0;
		for (Galleta galleta : galletas) {
			//for (tipoElemento variable : colección) {
		    // Cuerpo del bucle}

			// Esta línea inicia un bucle for-each que itera sobre una colección llamada
			// galletas. Se asume que galletas es una colección ArrayList
			// que contiene objetos de la clase Galleta. En cada iteración, se asigna
			// el objeto actual de la colección a la variable galleta.
			total = total + galleta.getPrecio();
		}
		return total + 1;
		// Finalmente, el método devuelve el valor de total incrementado en 1. Esto
		// podría significar que se está añadiendo un cargo adicional (por ejemplo, un
		// costo de envío o un impuesto, o en este caso el propio precio de la caja de
		// carton de las galletas) al precio total de las galletas.
	}

}
