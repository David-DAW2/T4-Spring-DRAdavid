package com.nttdata.nttdataT4SpringDRAdavid.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nttdata.nttdataT4SpringDRAdavid.model.Customer;

@Service
public interface ManagementCustomerI{
	
	/**
	 * Método buscar cliente por id
	 * @param id
	 * @return
	 */
	public Optional<Customer> encontrarCliente(Long id);
	/**
	 * Metodo buscar un cliente que coincida con los paámetros
	 * @param nombre
	 * @param primerApe
	 * @param segundoApe
	 * @return
	 */
	public Customer obtenerPorNombreYApellido(String nombre, String primerApe, String segundoApe);
	/**
	 * Método recuperar todos los clientes
	 * @return
	 */
	public List<Customer> obtenerTodosLosClientes();
	
	/**
	 * Método insertar clientes
	 * @param customer
	 */
	public void insertarCliente(Customer customer);
	/**
	 * Método borrar cliente
	 * @param customer
	 */
	public void BorrarCliente(Customer customer);

}
