package oop06RelacionesRecursivas;

import java.util.ArrayList;
import java.util.Objects;

public class Persona {

	private String nombre;
	private ArrayList<Persona> amigos = new ArrayList<Persona>();
	//Aqui vemos la RELACION RECURSIVA. Un ArrayList de Persona en la propia Clase Persona
	
        //Solo genero el getter de amigos.
	public ArrayList<Persona> getAmigos() {
		return amigos;
	}

	public void addAmigo(Persona persona) {
		// El método recibe un argumento de tipo Persona, que se denomina persona. Esto
		// significa que cuando llames a este método, debes pasarle un objeto de la
		// clase Persona.
		amigos.add(persona);

	}

	public void deletAmigo(Persona persona) {

		amigos.remove(persona);
		// NO hay que olvidarse de que hay que crear los metodos equals y hashcode para
		// que las relaciones de igualdad funcionen
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amigos, nombre);
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
		return Objects.equals(amigos, other.amigos) && Objects.equals(nombre, other.nombre);
	}

}
