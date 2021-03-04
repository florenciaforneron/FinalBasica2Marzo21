package ar.edu.unlam.pb2.ordenes;

public class ProductoInexistenteException extends Exception {
	public ProductoInexistenteException() {
		super("Producto inexistente");
	}

}
