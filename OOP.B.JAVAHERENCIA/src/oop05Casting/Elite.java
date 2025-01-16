package oop05Casting;

public class Elite extends Persona {

	public Elite(String nombre) {
		super(nombre);
	}

	@Override
	public void andar() {

		System.out.println(getNombre() + " camina a 15km/h.");
	}
	
	

}
