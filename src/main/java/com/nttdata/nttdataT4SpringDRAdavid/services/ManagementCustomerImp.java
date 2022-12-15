package com.nttdata.nttdataT4SpringDRAdavid.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.nttdataT4SpringDRAdavid.NttdataT4SpringDrAdavidApplication;
import com.nttdata.nttdataT4SpringDRAdavid.model.Customer;
import com.nttdata.nttdataT4SpringDRAdavid.repository.CustomerRepositoryI;


@Service
public class ManagementCustomerImp implements ManagementCustomerI {
	private static final Logger LOG =LoggerFactory.getLogger(NttdataT4SpringDrAdavidApplication.class);


	/**
	 * Inyección de repositorio
	 */
	@Autowired
	CustomerRepositoryI repoCustomer;

	@Override
	public Optional<Customer> encontrarCliente(Long id) {
		LOG.info("------------------------------BUSQUEDA DE CLIENTE--------------------------");

		//Retorno de cliente encontrado
		return repoCustomer.findById(id);
	}

	@Override
	public Customer obtenerPorNombreYApellido(String nombre, String primerApe, String segundoApe) {
		//Retorno de cliente encontrado por los parámetros
		LOG.info("------------------------------BUSQUEDA DE CLIENTE POR PARÁMETRO--------------------------");

		return repoCustomer.findByCustomerNameAndFirstSurnameAndSecondSurname(nombre, primerApe, segundoApe);
	}

	@Override
	public List<Customer> obtenerTodosLosClientes() {
		//Retorno de todos los clientes
		LOG.info("------------------------------RECUPERACIÓN DE TODOS LOS CLIENTES--------------------------");

		return repoCustomer.findAll();
	}

	@Override
	public void insertarCliente(Customer customer) {
		LOG.info("------------------------------INSERCIÓN DE CLIENTE--------------------------");

		//Inserción de cliente en la BBDD
		repoCustomer.save(customer);
	}

	@Override
	public void BorrarCliente(Customer customer) {
		//Borrado de cliente en la BBDD
		repoCustomer.delete(customer);
		LOG.info("------------------------------CLIENTE ELIMINADO DE LA BBDD--------------------------");

	}
}
