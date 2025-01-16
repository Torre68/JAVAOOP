package oop05Casting;

public class p02CastingTiposPrimitivos {

	public static void main(String[] args) {
		int numero = 10;
		double decimal = (double) numero; // Casting explícito de int a double
		System.out.println(numero);
		System.out.println(decimal);

		double otroDecimal = 9.7;
		int otroNumero = (int) otroDecimal; // Casting explícito de double a int (puede perder precisión)
		System.out.println(otroDecimal);
		System.out.println(otroNumero);

	}

}
