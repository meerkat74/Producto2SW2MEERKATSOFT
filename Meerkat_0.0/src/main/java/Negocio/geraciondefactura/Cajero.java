package Negocio.geraciondefactura;


public class Cajero {

	Factura factura = null;
	
	public String id;
	public String nombre;
	public String apellido;
	public String clave;
	public String telefono;
	
	public Cajero(String id, String nombre, String apellido, String clave, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.telefono = telefono;
	}
	
	public String generarFactura() {
		factura = new Factura(null,null,null,null,null,null);
		return "Factura";
	}

	public Factura getFactura() {
		return factura;
	}

	public boolean aņadirpropina(int x) {
		//se le suma x al valor de la factura.
		return true;
	}
	
}
