package oop05RelacionNaN;

import java.util.ArrayList;
import java.util.Objects;

public class Persona {

	private String nombre;
	private ArrayList<Casa> casas;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		this.casas = new ArrayList<Casa> ();
		// Para crear las relaciones de igualdad dejamos al asistente del IDE que nos
		// ayude con
		// boton derecho>source>generate hashcode and equals (SHORTCUT Alt+Shift+S y nos
		// lleva directamente a Source) Solo creamos la relacion de igualdad con nombre.
	}
	
	

	public boolean contains(Object o) {
		return casas.contains(o);
	}



	public boolean add(Casa e) {
		return casas.add(e);
	}



	@Override
	public int hashCode() {
		return Objects.hash(nombre);
		// Objects.hash(nombre): La clase Objects proporciona un método estático llamado
		// hash(), que calcula un código hash basado en los valores de los campos que se
		// pasan como argumentos. En este caso, solo se está usando el campo nombre de
		// la clase Persona. Esto significa que dos objetos Persona que tengan el mismo
		// nombre producirán el mismo código hash.
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nombre, other.nombre);

		// Comparaciones en equals():
//
//    if (this == obj): Comprueba si ambos objetos son la misma instancia. Si son idénticos, devuelve true.
//    if (obj == null): Comprueba si el objeto con el que se está comparando es null. Si es así, devuelve false.
//    if (getClass() != obj.getClass()): Verifica si los objetos son de la misma clase. Si no lo son, devuelve false.
//    Persona other = (Persona) obj;: Realiza un "casting" del objeto obj a Persona, ya que se ha comprobado que son del mismo tipo.
//    return Objects.equals(nombre, other.nombre);: Compara el campo nombre de ambos objetos. Utiliza el método equals() de la clase Objects, que maneja también el caso de que nombre sea null.
//

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
