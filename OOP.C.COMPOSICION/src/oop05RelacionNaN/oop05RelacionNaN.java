package oop05RelacionNaN;

public class oop05RelacionNaN {

	public static void main(String[] args) {

		Casa c = new Casa("Santander");
		Persona p = new Persona("Manolo");
		Persona p1 = new Persona("Eva");
		c.add(p);
		c.add(p1);
		System.out.println(c.contains(new Persona("Manolo")));
		System.out.println(c.contains(new Persona("Eva")));

		// Aqui ahora nos da falso porque no hemos creado las relaciones de igualdad con
		// el equals. y el hashcode. UNa vez creadas en Persona ya nos devuelve
		// verdadero.
		System.out.println(c.totalPersonas());

		// Podriamos usar los metodos clears and remove para eliminar del ArrayList de
		// la casa que contiene a Manolo y Eva, uno a uno o a ambos.Pero para eso
		// deberiamos generar los metodos delegados de clear and remove ademas de los
		// anteriormente generados y podriamos usar:
		// c.personas.clear();
		// c.personas.remove(p1 o p);

		p.add(c);
		System.out.println(p.contains(c));

		// ya hemos construido las relaciones N a N. Ahora las casas pueden contener
		// personas y las personas poseer varias casas.
	}

}
