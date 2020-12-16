package flores.melina38256457;

import java.util.ArrayList;
import java.util.List;


/*
 * La clase tiendaCamion pertenece a la familia de los camiones y tambien se comporta como una tienda
 * 
 * Desarrolle  e implemente los metodos pedido para que la clase cumpla con sus funcionalidades
 */
public class TiendaCamion extends Camion implements ITienda {
	private List<Producto> ventas;
	private Boolean estadoDeCaja; // True Abierta - False Cerrada
	
	
	public TiendaCamion(String Patente) {
		super(Patente);
		ventas=new ArrayList<Producto>();
		estadoDeCaja=false;
	}

	
	

	public void abrirCaja() {
		// Al Inicicio del dia limpia todas las ventas
		// y abre la caja diaria
		estadoDeCaja=true;
		ventas.clear();
		
	}




	
	public void vender(Integer idProducto) throws ProductoInexistente, CajaCerrada {
		
		if(estadoDeCaja==false) {
			throw new CajaCerrada("No se puede vender ya que la caja está cerrada.");
		}
		Producto productoAVender=null;
		int i=0;
		for (Producto producto : listaProductos) {
			if(idProducto == producto.getId()) {
				productoAVender=producto;
				listaProductos.remove(i);
				ventas.add(productoAVender);
			}else {
				i++;
			}
				
		}
		if (productoAVender==null) {
			throw new ProductoInexistente("El id de producto no corresponde a ningún producto.");
		}
		
		
	}




	public Reporte cierreZ() {
		Reporte reporteCierreZ=new Reporte();
		Double totalVentaDeldia=0.0;
		Double totalIVADelDia=0.0;
		for (Producto productoVendido : ventas) {
			totalVentaDeldia+=productoVendido.getPrecio();
			totalIVADelDia+=(productoVendido.getPrecio()*0.21);
		}
		reporteCierreZ.setTotalIva(totalIVADelDia);
		reporteCierreZ.setTotalNeto(totalVentaDeldia-totalIVADelDia);
		reporteCierreZ.setTotalVentas(totalVentaDeldia);
		return reporteCierreZ;
	}
	
	public Integer getCantidadDeVentas() {
		return ventas.size();
	}


}
