package Negocio.pedido;

import java.util.ArrayList;

import org.junit.Assert;

import Negocio.inventario.Administrador;
import Negocio.pedido.Mesero;
import Negocio.pedido.Producto;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class listadodepedidosencolaStepDefinitions {
	
	Mesero mesero = null;
	Administrador administrador = null;
	
	ArrayList<Producto> lista = new ArrayList<Producto>();
	
	Producto producto = new Producto("9090", "cerveza", 2000, "Refresacante","a","a");
	String mesa = "01";
	String cliente = "100";
	String meser = "200";
	String caja = "10";
	String fecha = "2015-12-03";
	String estado = "Pendiente";
	String id = "002";
	
	@Given("^El mesero envia un pedido al despachador.$")
	public void El_mesero_envia_un_pedido_al_despachador() throws Throwable { 
		mesero = new Mesero();
		administrador = new Administrador();
		lista.add(producto);
	}

	@When("^Hay productos en el pedido.$")
	public void Hay_productos_en_el_pedido() throws Throwable {
		Assert.assertTrue(lista.size()>0);  
	}

	@Then("^Agregar el pedido a la cola de pedidos.$")
	public void Agregar_el_pedido_a_la_cola_de_pedidos() throws Throwable {
		mesero.enviar_pedido(null);
	    Assert.assertTrue("Pedido enviado" != mesero.enviar_pedido(null));
	}
	
	@When("^No hay productos en el pedido.$")
	public void No_hay_productos_en_el_pedido() throws Throwable {
		Assert.assertTrue((lista.size()>0));
	}

	@Then("^Notificar que no hay productos en el pedido.$")
	public void Notificar_que_no_hay_productos_en_el_pedido() throws Throwable {
		Assert.assertTrue("No hay productos."==mesero.enviar_pedido(null));
	}
	@When("^Hay despachador.$")
	public void Hay_despachador() throws Throwable {
		Assert.assertTrue(administrador.consultar_despachador());
	}

	@When("^No hay despachador.$")
	public void No_hay_despachador() throws Throwable {
		Assert.assertTrue(administrador.consultar_despachador());
	}

	@Then("^Notificar que no hay despachador.$")
	public void Notificar_que_no_hay_despachador() throws Throwable {
		Assert.assertEquals("No hay despachador.", administrador.getMessageHayDespachador());
	}
	
}