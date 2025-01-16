package oop06ThisDelegacionentreConstructores;

public class Coche {

	private String marca;
	private String modelo;

	public Coche() {
		// Este constructor asigna valores por defecto
		// this.marca= "Toyota";
		// this.modelo = "Corolla";
		// Pero podemos DELEGAR un CONSTRUCTOR en el otro a traves del operador de
		// ambito this
		this("Toyota", "Corolla");
		// Esta SIEMPRE ha de ser la primera linea de codigo en el constructor, a la
		// hora de delegar

	}

	public Coche(String marca, String modelo) {
		// Este constructor recibe parametros
		this.marca = marca;
		this.modelo = modelo;
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
