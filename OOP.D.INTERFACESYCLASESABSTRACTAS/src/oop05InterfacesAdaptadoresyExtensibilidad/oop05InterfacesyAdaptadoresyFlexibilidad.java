package oop05InterfacesAdaptadoresyExtensibilidad;

public class oop05InterfacesyAdaptadoresyFlexibilidad {

	public static void main(String[] args) {

		RobotPro rp = new RobotPro();
		rp.setBrazo(new Coctelera());
		
		rp.setBrazopro(new SuperBrazo());
		// Aunque podria tener el tipo de brazo que quisiese; brazo, normal, de acero,
		// coctelera, SuperBrazo. Sin tener que usar adaptador.
		rp.rotarbrazopro();
		rp.girarBrazo();

	}

}
