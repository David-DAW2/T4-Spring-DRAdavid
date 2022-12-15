package com.nttdata.nttdataT4SpringDRAdavid.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nttdata.nttdataT4SpringDRAdavid.NttdataT4SpringDrAdavidApplication;
import com.nttdata.nttdataT4SpringDRAdavid.model.Customer;
import com.nttdata.nttdataT4SpringDRAdavid.services.ManagementCustomerImp;
@Controller
public class ControllerCustomer {
	private static final Logger LOG =LoggerFactory.getLogger(NttdataT4SpringDrAdavidApplication.class);

	/**
	 * Inyección de servicios
	 */
	@Autowired
	ManagementCustomerImp gestorClientes;
	
	
	/**
	 * Controlador el cual recoge un objeto cliente y lo inserta en el gestor cliente.
	 * @param newCustomer
	 * @param model
	 * @param res
	 * @return
	 */
	@RequestMapping("/crearCliente")
	public  String newCustomCreation(@ModelAttribute("cliente") Customer newCustomer, Model model, BindingResult res) {
		LOG.info("------------------------------INSERCIÓN DE CLIENTE--------------------------");

	gestorClientes.insertarCliente(newCustomer);
	LOG.info("------------------------------NAVEGACIÓN A LA VISTA 'REGISTRO'--------------------------");

		return "registerForm";
	}

	
	/**
	 * Controlador el cual redirige hacia la vista donde se muestran todos los clientes
	 * @param model
	 * @return
	 */
	
	@RequestMapping("/listarClientes")
	public  String listOfCustomers(Model model) {
		LOG.info("------------------------------RECUPERACION DE TODOS LOS CLIENTES--------------------------");

		model.addAttribute("clientes", gestorClientes.obtenerTodosLosClientes());
		LOG.info("------------------------------NAVEGACIÓN A LA VISTA 'LISTA DE CLIENTES'--------------------------");

		return "listOfCustomer";
	}
	
	
	/**
	 * Controlador el cual redirige a la vista buscar cliente por parámetros
	 * @return
	 */
	@RequestMapping("/NavegarAbuscarCliente")

	public String natigateToSearchCustomer() {
		LOG.info("------------------------------NAVEGACIÓN A LA VISTA 'BUSQUEDA DE CLIENTE'--------------------------");
		return "/searchCustomer";
	}

	/**
	 * Controlador el cual recoge por parámetro los valores de busqueda del cliente y los muestra en la vista "listOfCustomer"
	 * @param customerName
	 * @param firstSurname
	 * @param secondSurname
	 * @param model
	 * @return
	 */
	@RequestMapping("/buscarCliente")
	public  String SearchCustomer(@RequestParam String customerName ,@RequestParam String firstSurname,@RequestParam String secondSurname  ,Model model) {
		LOG.info("------------------------------RECUPERACIÓN CLIENTE POR PARÁMETRO--------------------------");

		model.addAttribute("clientes", gestorClientes.obtenerPorNombreYApellido(customerName, firstSurname, secondSurname));
		LOG.info("------------------------------NAVEGACIÓN A LA VISTA 'LISTA DE CLIENTES'--------------------------");

		return "listOfCustomer";
	}
	
	
	
	
	/**
	 * Manejador de excepciones
	 * @param res
	 * @return
	 */
	@ExceptionHandler(BindException.class)
	public String checkExceptions(BindingResult res) {

		// Resultado
		String output = "";

		// Verificación de errores.
		if (res.hasErrors()) {

			output = "/showErrorView";

		}

		return output;
	}
}