package flores.melina38256457;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import flores.melina38256457.Producto;
import flores.melina38256457.Reporte;
import flores.melina38256457.TiendaCamion;

public class TestTiendaCamion {
	
	
	
	//Obligatorio
	
	@Test
	public void queSeObtengaUnreporteAlHAcerUnCierreZ() throws ProductoInexistente, CajaCerrada {
		TiendaCamion tiendaCamion1 = new TiendaCamion("ABC123");
		Producto laptop = new Producto();
		laptop.setId(1);
		laptop.setPrecio(300.50);
		
		Producto monitor = new Producto();
		monitor.setId(2);
		monitor.setPrecio(120.50);
		
		Producto mouse = new Producto();
		mouse.setId(3);
		mouse.setPrecio(80.00);
		
		tiendaCamion1.cargarProducto(laptop);
		tiendaCamion1.cargarProducto(monitor);
		tiendaCamion1.cargarProducto(mouse);
		
		tiendaCamion1.abrirCaja();
		
		tiendaCamion1.vender(1);
		tiendaCamion1.vender(3);
		tiendaCamion1.vender(2);
		
		System.out.println(tiendaCamion1.cierreZ());
		
		
		
	}
	

	//opcional
	@Test
	public void queAlArirUnaCajaLaListaDeVentaEsteVacia() throws ProductoInexistente, CajaCerrada {
		TiendaCamion tiendaCamion2 = new TiendaCamion("ABC123");
		Producto laptop2 = new Producto();
		laptop2.setId(1);
		laptop2.setPrecio(300.50);
		
		Producto monitor2 = new Producto();
		monitor2.setId(2);
		monitor2.setPrecio(120.50);
		
		Producto mouse2 = new Producto();
		mouse2.setId(3);
		mouse2.setPrecio(80.00);
		
		tiendaCamion2.cargarProducto(laptop2);
		tiendaCamion2.cargarProducto(monitor2);
		tiendaCamion2.cargarProducto(mouse2);
		
		tiendaCamion2.abrirCaja();
		
		tiendaCamion2.vender(1);
		tiendaCamion2.vender(3);
		tiendaCamion2.vender(2);
		
		tiendaCamion2.abrirCaja();
		
		assertTrue(tiendaCamion2.getCantidadDeVentas()==0);
		
	}

}
