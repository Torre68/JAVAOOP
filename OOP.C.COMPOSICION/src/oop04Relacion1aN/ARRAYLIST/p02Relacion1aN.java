package oop04Relacion1aN.ARRAYLIST;

public class p02Relacion1aN {

	public static void main(String[] args) {
		
		CajaGalletas micaja = new CajaGalletas ();
		micaja.addGalleta(new Galleta ("Chocolate",1.5));
		micaja.addGalleta(new Galleta ("Chocolate",1.5));
		micaja.addGalleta(new Galleta ("Chocolate",1.5));
		micaja.addGalleta(new Galleta ("Chocolate",1.5));
		micaja.addGalleta("Chocolate", 1.5);
		System.out.println("La caja contiene "+micaja.totalGalletas()+" galletas.");
		System.out.println("El precio de la caja es "+micaja.precioTotal()+"€");

	}

}
