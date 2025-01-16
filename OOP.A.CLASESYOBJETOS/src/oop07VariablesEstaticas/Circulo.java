package oop07VariablesEstaticas;

public class Circulo {

	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double area() {

		return Circulo.area(this.radio);
		// Aqui creo el METODO DE INSTANCIA/objeto para calcular el area del circulo que
		// usare cuando cree un objeto/instancia de la Clase Circulo.
		// Este metodo delegara en el METODO ESTATICO (o metodo de clase) para realizar su funcion

	}

	public static double area(double radio) {
		return 2 * Math.PI * radio;
		// Accedemos a las APIS de JAVA, la Clase Math. y veremos el monton de
		// funcionalidades que vienen ya incluidas, en este caso seleccionamos el num
		// PI.

		// Este METDO ESTATICO puedo usarlo sin necesidad de crear un circulo, pero la
		// clase me permite seguir creando circulos. Por lo tanto necesito otro metodo
		// para calcular el area a partir de los onjetos que cree.
	}
}
