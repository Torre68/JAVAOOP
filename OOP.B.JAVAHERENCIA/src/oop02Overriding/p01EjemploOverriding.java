package oop02Overriding;

public class p01EjemploOverriding {

	public static void main(String[] args) {
		
		Persona p = new Persona ();
		p.setNombre("Manolo");
		
		Deportista d = new Deportista();
		d.setNombre("Rafa");
		d.setDeporte("Tenis");
		
		System.out.print(p.getNombre()+" ");p.andar();
		System.out.println("El deportista "+d.getNombre()+" se dedica a jugar al "+d.getDeporte());
		d.andar();
//El metodo andar, tiene que ir fuera del syso porque es un syso en si mismo.

	}

}
