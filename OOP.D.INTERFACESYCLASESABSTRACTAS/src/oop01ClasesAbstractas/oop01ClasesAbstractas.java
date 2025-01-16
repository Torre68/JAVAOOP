package oop01ClasesAbstractas;

public class oop01ClasesAbstractas {

	public static void main(String[] args) {

		Coche c = new Coche("Toyota");
		Vehiculo m = new Moto("Honda");
		Camion cm = new Camion("Iveco");
		// Vehiculo v = new Vehiculo("Mercedes");
		// Esto no se deberia poder hacer porque estamos hablando de una clase
		// abstracta.
		// Por eso hay que irse a la Clase Vehiculo y declararla como una clase
		// abstracta para que no se puedan construir objetos/instancias directamente
		// desde esa clase. Una vez hecho, si lo descomentamos, nos dara error y dira
		// que no se pueden instanciar objetos desde esa clase

		System.out.println(c.getMarca());
		System.out.println(m.getMarca());
		cm.acelerar();
		c.acelerar();
		m.acelerar();
		acelerarvehiculo(cm);
		acelerarvehiculo(m);
		acelerarvehiculo(c);
		c.pagarImpuesto();
		cm.pagarImpuesto();
	}

	// Abrir esta via al polimorfismo no podria hacerse de no haber creado el metodo
	// abstracto acelerar en la clase abstracta Vehiculo.
	//  El programador no necesetaria conocer la jerarquia
	// completa para construir este metodo polimorfico.
	public static void acelerarvehiculo(Vehiculo v) {

		v.acelerar();
	}
	

}
