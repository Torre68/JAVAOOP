package oop01ClaseyObjetoInstancia;

public class Rectangulo {
	// habitualmente las Clases no necesitan el método "main"
	// ya que el método main es necesario solo en la clase que se ejecuta
	// directamente como una aplicación Java.

	double lado1;
	double lado2;
    //Aqui vemos que solo creamos las propiedades de los objetos que 
	// crearemos y sus tipos de variables. Los variables de esas propiedades se
	// asignaran una vez se cree el objeto.
	
	public double area () {
		return lado1*lado2;
	}
	//Aqui creamos las dos funcionalidades/metodos del rectangulo que utilizaremos. Area y perimetro.
	public double perimetro () {
		return 2*lado1+2*lado2;
	}
}
