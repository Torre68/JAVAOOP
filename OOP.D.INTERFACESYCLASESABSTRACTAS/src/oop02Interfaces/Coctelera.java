package oop02Interfaces;

//La coctelera no es un brazo, por lo tanto esto puede causar problemas a nivel futuro
//y convertir el codigo en un gran problema cuando se quieran implementar 
//nuevas funcionalidades. No se deberia usar la herencia, se deberia usar la interfaz.
public class Coctelera extends Brazo {

	@Override
	public void girar() {

		System.out.println("La coctelera gira a 10rpm.");

	}

}
