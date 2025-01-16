package oop05InterfacesAdaptadoresyExtensibilidad;

public class RobotPro extends Robot{
	
	
	private Rotable brazopro;

	public Rotable getBrazopro() {
		return brazopro;
	}

	public void setBrazopro(Rotable brazopro) {
		this.brazopro = brazopro;
	}
	
	public void rotarbrazopro() {
		
		brazopro.rotar();
	}
	
	
	

}
