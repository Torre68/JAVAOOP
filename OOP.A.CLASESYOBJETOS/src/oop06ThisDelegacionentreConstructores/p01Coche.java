package oop06ThisDelegacionentreConstructores;

public class p01Coche {

	public static void main(String[] args) {
		
		Coche c = new Coche("Citroen", "C3");
		//Aqui el constructor que recibe parametros
		
		Coche c1 = new Coche();
		//aqui vemos el constructor que asigna parametros 

		System.out.println(c.getMarca() + " " + c.getModelo());
		System.out.println(c1.getMarca() + " " + c1.getModelo());
		
		
	}

}
