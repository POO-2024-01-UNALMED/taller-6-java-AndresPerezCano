package vehiculos;

public class Camioneta extends Vehiculo {
	
	private boolean volco;
	static int cantCamioneta;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		Camioneta.cantCamioneta++;
	}
	
	public boolean isVolco() {
		return this.volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	public static int getCantCamioneta() {
		return Camioneta.cantCamioneta;
	}
	public static void setCantCamioneta(int cantCamioneta) {
		Camioneta.cantCamioneta = cantCamioneta;
	}
}

