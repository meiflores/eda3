package flores.melina38256457;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import flores.melina38256457.Camion;
import flores.melina38256457.Producto;
import flores.melina38256457.TiendaCamion;

public class TestCamion {
	

	//opcional
	@Test
	public void queSeAgregueUnProducto() {
		
	}
	
	//opcional
	@Test
	public void queSeDescargueUnProducto() {
	
	}
	
	//obligatorio
	@Test(expected = ProductoInexistente.class)
	
	public void queDescargueUnProductoInexistenteLanceUnaException() throws ProductoInexistente {
		Camion camion = new Camion("GHJ189");
		Producto producto1 = new Producto();
		Producto producto2 = new Producto();
		producto1.setId(1);
		producto1.setId(2);
		camion.cargarProducto(producto1);
		camion.cargarProducto(producto2);
		
		camion.descargarProducto(3);
	
	}
	
}
