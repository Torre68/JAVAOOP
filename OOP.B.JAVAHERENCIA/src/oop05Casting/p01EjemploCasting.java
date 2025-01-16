package oop05Casting;

public class p01EjemploCasting {

	public static void main(String[] args) {

		Persona p = new Deportista("Rafa", "tenis");
		System.out.println(p.getNombre());
		p.andar();
		// Pero si quiero acceder a la propiedad deporte nos da error ya que hemos
		// creado al Deportista desde la superclase persona.
		// Por lo tanto lo que debemos hacer es un CASTING (DOWNCASTING) ya que vamos a
		// convertir el objeto de la superclase en el de la subclase
		//System.out.println(p.getDeporte());
		Deportista d = (Deportista) p;
		// Al introducir esto nos dara error pero solo debemos utilizar el asistente del
		// IDE para que haga el Casting. Add to Cast 'Deportista'.
		System.out.println(d.getDeporte());
		
		
	}

}