package oop02Encapsulacion;

public class p01Persona {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setNombre("Manolo");
		p.setApellidos("Kabezabolo");
		p.setEdad(222);
		Persona p1 = new Persona();
		p1.setNombre("Pablo");
		p1.setApellidos("Fernandez");
		p1.setEdad(-12);
		// Gracias a la restriccion de la Clase, vemos como las edades no se pueden
		// asignar al albedrio

		System.out.println("La persona " + p.getNombre() + " que se apellida " + p.getApellidos() + " tiene "
				+ p.getEdad() + " años");
		System.out.println("La persona " + p1.getNombre() + " que se apellida " + p1.getApellidos() + " tiene "
				+ p1.getEdad() + " años");
	}

}
