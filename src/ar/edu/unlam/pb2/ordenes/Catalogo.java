package ar.edu.unlam.pb2.ordenes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Mantiene una colecci�n de Productos, los cuales no pueden
 * estar duplicados. Adem�s, por cada Producto se desea mantener 
 * la cantidad del mismo en Stock,
 */
public class Catalogo {
	
	/*
	 * �Cu�l es la colecci�n adecuada?
	 */
	
		private Set<Producto> productos;
		private Boolean estadoAgregado;
	
	/*
	 * Agregar producto al cat�logo.
	 * No se permiten Productos duplicados. Criterio: n�mero de Producto. 
	 */
	public Boolean agregarProducto(Producto producto, Integer cantidad) {		
			if(!(productos.contains(producto))){
				productos.add(producto);
				estadoAgregado = true;
				cantidad ++;
		  }else{
			  return estadoAgregado = false;
		   } 
			return estadoAgregado;
		}
	
	
	/*
	 * Remueve Producto del Cat�logo.
	 * Lanza una Excepci�n si el Producto no se encuentra en el Cat�logo.
	 */
	public Boolean quitarProducto(Producto producto) throws ProductoInexistenteException{
		Boolean productoEliminado = false;
		try {
			if(productos.contains(producto)) {
				productos.remove(producto);
				productoEliminado = true;
				throw new ProductoInexistenteException();				
			}else {
				productoEliminado = false;
			} 
			}catch(Exception e) {
				System.out.println("no se puede eliminar producto");
			}
			
		return productoEliminado;	
	}
	
	
	/*
	 * Descuenta la cantidad deseada de producto del Stock.
	 */
	
	public Boolean removerStock(Producto producto, Integer cantidad) {
		Boolean productoEliminado = false;
		if(productos.contains(producto)) {
			productos.remove(producto);
			productoEliminado = true;
		}
		else {
			productoEliminado = false;
		}
		return productoEliminado;
	}
	
	/*
	 * Devuleve la cantidad de Productos en existencia.
	 */
	public Integer obtenerCantidad(Producto producto) {		
		Integer cantidadProductos = 0;
		 Iterator<Producto> iterator = productos.iterator(); 
	        while (iterator.hasNext()) {
	        	cantidadProductos ++;
	        }
	        return cantidadProductos;
	}


	
	//Getters y Setters
	public Set<Producto> getProductos() {
		return productos;
	}


	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}


	public Boolean getEstadoAgregado() {
		return estadoAgregado;
	}


	public void setEstadoAgregado(Boolean estadoAgregado) {
		this.estadoAgregado = estadoAgregado;
	}
}
