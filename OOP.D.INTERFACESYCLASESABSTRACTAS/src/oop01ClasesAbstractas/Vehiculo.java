package oop01ClasesAbstractas;

//Las Clases abstractas tambien pueden poseer metodos concretos que sean de una 
//funcionalidad logica para todas las subclases. 
public abstract class Vehiculo {
	// Declarando la clase abstracta con el comando abstract ya restringimos la
	// opcion de crear objetos/instancias. Ahora solo sirven para heredar
	// propiedades y metodos.

	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Vehiculo(String marca) {
		super();
		this.marca = marca;
	}

	public abstract void acelerar();

	// Una vez declarado abstracto, las subclases son las que se deben encargar de
	// implementar el metodo. A EXCEPCION de que las subclases sean tambien
	// abstractas .

	public void pagarImpuesto() {

		System.out.println("Impuesto pagado");
	}
	// Ahora, para declarar un METODO CONCRETO comun a todas las subclases, lo
	// podemos crear a mano aqui. O si las clases todas possen ese metodo lo podemos
	// hacer a traves del asistente del IDE desplegando una de las clases,
	// seleccionando el metodo a subir (PULL UP) a la clase abstracta y boton
	// derecho>Refactor>PULL UP>Next seleccionamos el mismo metodo que este tambien
	// presente en otras subclases > Next (donde nos mostrara un resumen de lo que
	// va a hacer) y Finish. Entonces el metodo sera subido a la clase abstracta y
	// eliminado de las subclases ya que a partir de ahora heredaran este metodo
	// concreto directamente.

}
