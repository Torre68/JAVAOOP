package oop07VariablesEstaticas;

public class p02Circulo {
	
	public static void main (String [] args) {
		
	
		Circulo c = new Circulo (3);
		
		System.out.println("El circulo creado tiene un area de: "+c.area());
		
		System.out.println("El area del Metodo Estatico es: "+Circulo.area(9));

}
}