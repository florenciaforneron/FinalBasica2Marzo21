package ar.edu.unlam.pb2.ordenes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Mantiene una colección de Productos, los cuales no pueden
 * estar duplicados. Además, por cada Producto se desea mantener 
 * la cantidad del mismo en Stock,
 */
public class Catalogo {
	
	/*
	 * ¿Cuál es la colección adecuada?
	 */
	
		private Set<Producto> productos;
		private Boolean estadoAgregado;
	
	/*
	 * Agregar producto al catálogo.
	 * No se permiten Productos duplicados. Criterio: número de Producto. 
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
	 * Remueve Producto del Catálogo.
	 * Lanza una Excepción si el Producto no se encuentra en el Catálogo.
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
