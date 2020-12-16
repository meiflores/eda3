package flores.melina38256457;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Empresa {

	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	private String nombre;
	private HashMap<Integer, Camion> flota;
	private int idCamionActual=0;
	private TreeSet<Camion> teindasCamionOrdenadosPorPatente;

	public Empresa() {
		nombre="";
		flota=new HashMap<Integer,Camion>();
		teindasCamionOrdenadosPorPatente = new TreeSet<Camion>();
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public void agregarCamion(Camion camion) {

		// se agrega uncamion el primer camion tiene como identificador 0 el el segundo
		// 1 2 3.4
		flota.put(idCamionActual, camion);
		idCamionActual++;
	}
	
	public void agregarTiendaCamion(TiendaCamion tiendaCamion) {
		teindasCamionOrdenadosPorPatente.add(tiendaCamion);
	}

	public Integer cantidadDeCamiones() {

		return flota.size();
	}

	public TreeSet<Camion> obtenerTiendascamionOrdenadoPorPatente() {
		
		return teindasCamionOrdenadosPorPatente;
	}

}
