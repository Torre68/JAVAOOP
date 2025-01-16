package oop04Constructor;

public class Coche {

	private String marca;
	private String modelo;

	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		// Este es el CONSTRUCTOR que hemos creado que nos ayudara a inicializar el
		// objeto/instancia. Lo que nos permite es ahorrarnos codigo y no tener que usar
		// los metodos set para inicilaizar el objeto y ademas nos fuerza a que creemos
		// el objeto ya con los valores introducidos
	}

	public Coche(String modelo) {
		this.marca = "Toyota";
		this.modelo = modelo;
		// SOBRECARGA DE CONSTRUCTORES
		// Ahora tenemos dos constructores con el mismo nombre pero este solo requiere
		// un parametro ya que solo construira coches de la Marca Toyota. Es decir, la
		// marca viene definida por defecto desde el propio constructor

		// Los CONSTRUCTORES se pueden generar con la ayuda del eclipse a traves de
		// boton derecho>Source>generate Constructor usin fields (y ahi escogemos los
		// atributos/propiedades sobre los que queremos generar el/los constructor/es
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
