package oop03ThrowPersonalizedExceptions;

public class p01ThrowPersonalizedException {

	public static void main(String[] args) {

		

		try {
			Servicio.miMetodo();
		} catch (Exception e) {
			System.out.println("Ventana de Alerta " + e.getMessage());
			System.out.println("Ventana de Alerta 2 "+e.getCause().getMessage());
			
		}

		//
	}
}