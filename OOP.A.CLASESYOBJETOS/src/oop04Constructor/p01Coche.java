package oop04Constructor;

public class p01Coche {

	public static void main(String[] args) {

//		Coche c = new Coche();
//		c.setMarca("Toyota");
//		c.setModelo("Yaris");
		// Lo de arriba ya esta obsoleto y da error ya que se nos requiere inicializar
		// el objeto introduciendo los valores de los atributos/propiedades
		//Por lo tanto valdria con
		Coche c = new Coche ("Toyota", "Yaris");
		System.out.println(c.getMarca() + " " + c.getModelo());
		
		Coche c1 = new Coche("Corolla");
		System.out.println(c1.getMarca() + " " + c1.getModelo());
		
	}

}
