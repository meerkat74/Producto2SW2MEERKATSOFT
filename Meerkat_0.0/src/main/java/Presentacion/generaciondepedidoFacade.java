package Presentacion;

import java.util.ArrayList;

import Datos.FacturaRepository;
import Negocio.geraciondefactura.Factura;
import Negocio.tomaynotificacionpedidos.Pedido;

public class generaciondepedidoFacade {
	FacturaRepository facturarepository = new FacturaRepository();
	public ArrayList<Factura> main() throws Exception{
		ArrayList<Factura> x = facturarepository.generarfactura();
		return x;
	}
	
	public int ultimopedidoid() throws Exception{
		ArrayList<Factura> x = facturarepository.generarfactura();
		return x.size();
	}
	
	public void enviar_pedido(Pedido x) throws Exception{
		facturarepository.ingresarPedido(x);
	}
}
