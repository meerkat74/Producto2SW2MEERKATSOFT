package Negocio.ManejodeNomina;

import org.junit.Assert;

import Negocio.inventario.Administrador;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class agregarMeseroStepdefinitions {
	
	Administrador administrador = null;
	
	@Given("^El administrador quiere agregar un nuevo despachador$")
	public void El_administrador_quiere_agregar_un_nuevo_mesero() throws Throwable {
		administrador = new Administrador(null, null, null, null, null);
		administrador.Contratar_Despachador(null, null, null, null);
	}

	@When("^Presiona el boton nuevo mesero$")
	public void Presiona_el_boton_nuevo_despachador() throws Throwable {
		
	}

	@Then("^Redirigir a una nueva jsp para llenar todos los datos y finalmente registrarlo.$")
	public void Redirigir_a_una_nueva_jsp_para_llenar_todos_los_datos_y_finalmente_registrarlo() throws Throwable {
		
	}
	
}
