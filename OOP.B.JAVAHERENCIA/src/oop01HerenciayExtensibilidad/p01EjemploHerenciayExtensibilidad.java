package oop01HerenciayExtensibilidad;

public class p01EjemploHerenciayExtensibilidad {

	public static void main(String[] args) {
		
		Deportista d = new Deportista();
		d.setNombre("Rafa");
		d.setDeporte("Tenis");
		
		System.out.println("El deportista "+d.getNombre()+" se dedica a jugar al "+d.getDeporte()+".");



	}

}
