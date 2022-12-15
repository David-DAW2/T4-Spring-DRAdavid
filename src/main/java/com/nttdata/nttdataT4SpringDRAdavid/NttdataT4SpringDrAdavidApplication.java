package com.nttdata.nttdataT4SpringDRAdavid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.nttdataT4SpringDRAdavid.model.Customer;
import com.nttdata.nttdataT4SpringDRAdavid.services.ManagementCustomerI;



@SpringBootApplication
public class NttdataT4SpringDrAdavidApplication  implements CommandLineRunner{
	private static final Logger LOG =LoggerFactory.getLogger(NttdataT4SpringDrAdavidApplication.class);

	/**
	 * Inyección de servicios clientes
	 */
	@Autowired
	ManagementCustomerI gestionClientes;

	public static void main(String[] args) {
LOG.info("------------------------------INICIO DE APLICACIÓN--------------------------");
		SpringApplication.run(NttdataT4SpringDrAdavidApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/**
		 * Instanciación de clientes a insertar
		 */
		Customer davi=new Customer();
		davi.setCustomerName("David");
		davi.setFirstSurname("Rodriguez");
		davi.setSecondSurname("Aguilar");
		davi.setFechaNac("29/07/1995");
		davi.setDni(38473);
		
		Customer julian = new Customer();
		julian.setCustomerName("julian");
		julian.setFirstSurname("marquez");
		julian.setSecondSurname("ossorio");
		julian.setDni(90752);
		
		Customer fernando = new Customer();
		fernando.setCustomerName("Fernando");
		fernando.setFirstSurname("Marquez");
		fernando.setSecondSurname("Rodriguez");
		fernando.setDni(37752);
		
		LOG.info("---------------------INSERCIÓN DE CLIENTES--------------------------\n");

		

		/**
		 * Inserción de clientes
		 */
		gestionClientes.insertarCliente(davi);
		gestionClientes.insertarCliente(julian);
		gestionClientes.insertarCliente(fernando);


	}

}
