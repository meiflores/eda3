package flores.melina38256457;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.Test;

import flores.melina38256457.Camion;
import flores.melina38256457.Empresa;
import flores.melina38256457.TiendaCamion;

public class TestEmpresa {
	
	
	//Opcional
	@Test
	public void queSeAgregueUnCamion() {
	
	}
	
	
//Obligatorio
	@Test
	public void QueSeObtengaUnaListaDeCaionesTiendaOrdenadosPorPatentes() {
		Empresa fedex = new Empresa();
		
		//Creo tiendas camiones
		
		TiendaCamion tiendaCamion1 = new TiendaCamion("AAA987");
		TiendaCamion tiendaCamion2 = new TiendaCamion("ZFE567");
		TiendaCamion tiendaCamion3 = new TiendaCamion("AAA123");
		TiendaCamion tiendaCamion4 = new TiendaCamion("ABC118");
		
		fedex.agregarTiendaCamion(tiendaCamion1);
		fedex.agregarTiendaCamion(tiendaCamion2);
		fedex.agregarTiendaCamion(tiendaCamion3);
		fedex.agregarTiendaCamion(tiendaCamion4);
		
		TreeSet<TiendaCamion> camionesOrdenados = new TreeSet<TiendaCamion>();
		camionesOrdenados.add(tiendaCamion3);
		camionesOrdenados.add(tiendaCamion1);
		camionesOrdenados.add(tiendaCamion4);
		camionesOrdenados.add(tiendaCamion2);
		
		assertEquals(camionesOrdenados, fedex.obtenerTiendascamionOrdenadoPorPatente());
		
	}


}
