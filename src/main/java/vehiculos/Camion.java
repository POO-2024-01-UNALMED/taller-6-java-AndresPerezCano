package vehiculos;

public class Camion extends Vehiculo {
	
	private int ejes;
    static int cantCamion;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa , 2,  80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		 Camion.cantCamion++;
	}
	
	public int getEjes() {
		return this.ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public static int getCantCamion() {
		return Camion.cantCamion;
	}
	public static void setCantCamion(int cantCamion) {
		Camion.cantCamion = cantCamion;
	}


}

