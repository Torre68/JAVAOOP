package oop01IgualdadentreObjetos;

public class p01Igualdad {

	public static void main(String[] args) {

		Persona p = new Persona("Juan");
		Persona p1 = new Persona("Juan");

		// Si se cambiase cualquier cosa del nombre de p o p1 todo cambiaria.
		System.out.println(p == p1);
		// A nivel de comparar objetos el == no debe usarse porque ese comparador esta
		// reservado para los 8 tipos primitivos
		int a = 9;
		int b = 9;
		System.out.println(a == b);
		System.out.println(9 == b);
		// Aqui utilizo el metodo equals.
		// Esta seria la forma directa de JAVA de averiguar si hay igualdad
		System.out.println(p.equals(p1));
		System.out.println(p1.equals(p));
		// Esta seria la forma rapida, a traves de los hashcode
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		// todo esto es importante a nivel de negocio porque podria pasar que aunque dos
		// objetos devolviesen el mismo hashcode se consideren distintos a nivel de
		// negocio

		System.out.println(p);
		System.out.println(p1);
	}
}