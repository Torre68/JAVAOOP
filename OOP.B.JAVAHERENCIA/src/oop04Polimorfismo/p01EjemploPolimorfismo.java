package oop04Polimorfismo;

public class p01EjemploPolimorfismo {

	public static void main(String[] args) {

		// Ahora gracias al polimorfismo podriamos crear un objeto Deportista desde la
		// Superclase Persona. PERO NO AL REVES,
		Persona p = new Persona("Manolo");
		// p.andar();
		// Aunque con p.andar estamos usando una referencia a Persona, al ser un paso
		// por referencia el objeto creado modifica el metodo y el que se usa es el del
		// objeto creado (Override)
		Persona e = new Elite("Messi");
		// e.andar();
		Deportista d = new Deportista("Saul");
		// d.andar();

		// s.andar();
		// Ahora gracias al POLIMORFISMO utilizamos el metodo creado iniciarAndar() le
		// introducimos el tipo de objeto como parametro y funciona igual que el codigo
		// arriba comentado. Es decir un unico metodo es usado por 3 tipos de clase (La
		// superclase y las dos subclases)

		iniciarAndar(p);
		iniciarAndar(d);
		iniciarAndar(e);

	}

	// El gran valor del polimorfismo es; si se quisiese declarar un metodo como el
	// siguiente:

	// public static void iniciarAndar(Deportista d) {

	// d.andar();

	// Deberia hacer declarar un metodo como este para todas las subclases. Lo que
	// romperia la maxima DRY don't Repeat Yourself
	// Pero al declararlo con la Superclase ya nos valdria para todos y adquiriria
	// el metodo definido en cada clase (Dependiendo de si creasemos una persona, un
	// deportista o un elite)
	public static void iniciarAndar(Persona p) {

		p.andar();
	}
	// El POLIMORFISMO tambien nos permite ocultar las JERARQUIAS de clases
	// completas y simplificar los programas.
	// El programador no necesita saber de la existencia de las subclases para usar
	// este metodo
	//

}
