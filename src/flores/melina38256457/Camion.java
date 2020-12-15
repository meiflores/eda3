package flores.melina38256457;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion  {
	
	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	
	
	private String patente;
	protected List <Producto> listaProductos;
	
	
	public Camion (String patente) {
		this.patente=patente;
		this.listaProductos=new ArrayList<Producto>();
	}
	
	
	public Boolean cargarProducto(Producto producto) {
		listaProductos.add(producto);
		return true;
	
	}
	
	
	public Producto descargarProducto(Integer idProducto) throws ProductoInexistente {
	
		/*
		 * buesca y un producto por su id y devuelve el producto encontrado
		 * por otro lado elimina dicho producto de la coleccion
		 * encaso que el idProducto no se encuentre retorna una exception ProductoInexistenteException
		 */
		Producto productoADescargar=null;
		int i=0;
		for (Producto producto : listaProductos) {
			if(idProducto == producto.getId()) {
				productoADescargar=producto;
				listaProductos.remove(i);
			}else {
				i++;
			}
				
		}
		if (productoADescargar==null) {
			throw new ProductoInexistente("El id de producto no corresponde a ningún producto.");
		}
		
	return productoADescargar;
	}
	

	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public List<Producto> getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}


	
}
