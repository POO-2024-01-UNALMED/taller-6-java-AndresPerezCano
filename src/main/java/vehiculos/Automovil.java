package vehiculos;

public class Automovil extends Vehiculo{
	
	private int puestos;
    static int cantAutomovil;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa,4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		Automovil.cantAutomovil++;
				
	}
	
	public int getPuestos() {
		return this.puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public static int getCantAutomovil() {
		return Automovil.cantAutomovil;
	}
	public static void setCantAutomovil(int cantAutomovil) {
		Automovil.cantAutomovil = cantAutomovil;
	}

}
