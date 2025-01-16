package oop05ConstructorporDefecto;

public class Coche {

	private String marca;
	private String modelo;

//	public Coche () {
//		Este seria el constructor por defecto. Aunque no aparezca, esta seria su forma.
//		Escribiendolo o no, el programa main funcionaria igual. 
// Esto cambia al introducir un constructor nuestro ya que el nuestro
	// sustituiria
	// al que viene por defecto

//}
	public Coche(String modelo) {
		this.marca= "Citroen";
		this.modelo = modelo;
	}

	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
