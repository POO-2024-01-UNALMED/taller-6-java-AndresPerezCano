package vehiculos;

import java.util.ArrayList; 

public class Pais {
	
	private String nombre;
	static ArrayList<Pais> paises = new ArrayList<>();
	static ArrayList<Integer> conteo = new ArrayList<>();
	
	public Pais(String nombre) {
		
		this.nombre = nombre;
		Pais.paises.add(this);
		
	}
	
	
	public String getNombre() {
		return this.nombre;
		
	}
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
   
    public static Pais paisMasVendedor() {
    	for(int i = 0; i < Pais.paises.size(); i++) {
    		Pais.conteo.add(0);
    	}
    	
    	for(Vehiculo veh : Vehiculo.getVehiculos()) {
    		String nombre = veh.getFabricante().getPais().getNombre();
    		for(int i = 0; i < Pais.paises.size(); i++) {
    			if(Pais.paises.get(i).getNombre().equals(nombre)) {
    				Pais.conteo.set(i,  Pais.conteo.get(i) + 1);
    			}
    		}
    		
    	}
    	int maxConteo = 0;
    	Pais nombreMaxConteo = null;
    	for (int i = 0; i < Pais.conteo.size(); i++) {
    		if(Pais.conteo.get(i) > maxConteo) {
    		    maxConteo = Pais.conteo.get(i);
    		    nombreMaxConteo = Pais.paises.get(i);
    		}
    	}
    	return nombreMaxConteo;
    }
}
