package oop07VariablesEstaticas;

public class Coche {

	private String marca;
	private String modelo;
	private static int contador;
	// Aqui declaramos la variable static y asi hacemos que los objetos creados no
	// lleven una copia de esta variable, pero si puedan acceder a su lectura
	// ESTA VARIABLE PERTENECE A LA CLASE, no al objeto

	public static int getContador() {
		// Aqui declaramos al metodo getContador como static para que no necesitemos
		// crear ningun objeto para poder acceder a el
		return contador;
	}

	public Coche() {

		this("Toyota", "Corolla");

	}

	public Coche(String marca, String modelo) {

		this.marca = marca;
		this.modelo = modelo;
		contador++;
		// aqui insertamos el contador porque si lo pusiesemos arriba no contaria
		// los coches creados con este constructor, pero al reves si por la DELEGACION
		// DE CONSTRUCTORES
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
