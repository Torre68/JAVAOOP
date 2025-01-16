package oop05ConstructorporDefecto;

public class p01Coche {

	public static void main(String[] args) {
		// Aqui estamos usando el constructor por defecto de JAVA (no viene escrito en
		// el codigo en la clase, pero esta implicito a no ser que se añada un
		// constructor a mano)
		Coche c = new Coche("C3");
		

		System.out.println(c.getMarca() + " " + c.getModelo());
	}

}
