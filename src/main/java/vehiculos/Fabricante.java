package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	static ArrayList<Fabricante> fabricantes = new ArrayList<>();
	static ArrayList<Integer> conteo1 = new ArrayList<>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.fabricantes.add(this);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return this.pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
    	for(int i = 0; i < Fabricante.fabricantes.size(); i++) {
    		Fabricante.conteo1.add(0);
    	}
    	
    	for(Vehiculo veh : Vehiculo.getVehiculos()) {
    		 String nombre = veh.getFabricante().getNombre();
    		for(int i = 0; i < Fabricante.fabricantes.size(); i++) {
    			if(Fabricante.fabricantes.get(i).getNombre().equals(nombre)) {
    				Fabricante.conteo1.set(i,  Fabricante.conteo1.get(i) + 1);
    			}
    		}
    		
    	}
    	int maxConteo = 0;
    	Fabricante nombreMaxConteo = null;
    	for (int i = 0; i < Fabricante.conteo1.size(); i++) {
    		if(Fabricante.conteo1.get(i) > maxConteo) {
    		    maxConteo = Fabricante.conteo1.get(i);
    		    nombreMaxConteo = Fabricante.fabricantes.get(i);
    		}
    	}
    	return nombreMaxConteo;
    }
	
}

