package Presentacion;

import java.util.ArrayList;

import Datos.FacturaRepository;
import Negocio.tomaynotificacionpedidos.Producto;

public class realizarpedidoFacade {
	public void main(ArrayList<Producto> lista, String mesa, String cliente, String meser, String caja, String fecha, String estado, String id) throws Exception{
		FacturaRepository facturarepository = new FacturaRepository();
		facturarepository.ingresarPedido(id, lista, fecha,estado, mesa, meser, cliente,caja);
	}
}