package oop07VariablesEstaticas;

public class p01Coche {

	public static void main(String[] args) {

		Coche c = new Coche();
		Coche c1 = new Coche();
		Coche c2 = new Coche("Citroen", "C3");
		Coche c3 = new Coche();
		Coche c4 = new Coche("Honda", "Civic");
		Coche c5 = new Coche();

		System.out.println(Coche.getContador());
		// Ahora, al haber convertido el metodo getcontador en static podria borrar
		// todos los coches y acceder a el dandome un valor de cero. De no haberlo hecho
		// asi no podriamos acceder al metodo y comprobar que hay cero coches creados

	}

}
