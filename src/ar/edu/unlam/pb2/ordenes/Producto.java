package ar.edu.unlam.pb2.ordenes;

public class Producto {
	private Integer numero;
	private String descripcion;
	private Double precio;

	/*
	 * Se crea un producto.
	 */
	public Producto(Integer numero, String descripcion, Double precio) {		
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	/*
	 * Retorna el precio unitario del Producto.
	*/
	public Double getPrecio() {
		return precio;
	}
	
	/*
	 * Devulve el monto del impuesto.
	 * Todo producto tiene un 21% de impuesto.
	 */
	public Double getImpuesto() {
		Double impuesto = (precio*21.00)/100;
		return impuesto;
	}
	
	/*
	 * Devuelve la descripción del Producto
	 */
	public String getDescripcion() {
		return this.descripcion;
	}
	
	/*
	 * Devuelve el precio del producto luego de aplicar el impuesto.
	 */
	public Double getPrecioFinal() {
		Double precioFinal = precio - this.getImpuesto();
		return precioFinal;
	}
}
