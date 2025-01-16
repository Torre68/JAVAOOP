package oop01ClaseyObjetoInstancia;

public class p01Rectangulo {

	public static void main(String[] args) {
		
		//Una vez creada la clase/molde. A partir de ella creamos el objeto (r) y empezamos 
		//a asignarle aqui los valores a sus propiedades lado1 y lado2.
		Rectangulo r = new Rectangulo ();
		//Esto facilita las cosas ya que con solo introducir r. nos sale un desplegable con
		//las opciones de la clase
		r.lado1=22.3;
		r.lado2=33.8;
		//los valores double (decimales) van como en ingles, con 0.0 no con coma.
		
		//Luego para ver sus funcionalidades solo necesitariamos:
		System.out.print("El area del rectangulo es: "+r.area()+" y su perimetro es: "+r.perimetro());
		



	}

}
