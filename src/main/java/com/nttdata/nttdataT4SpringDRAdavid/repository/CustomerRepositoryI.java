package com.nttdata.nttdataT4SpringDRAdavid.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.nttdataT4SpringDRAdavid.model.Customer;



@Repository
public interface CustomerRepositoryI  extends JpaRepository<Customer, Long>{
	/**
	 * Método implementado de jpaRepository para buscar por determinados parámetros.
	 * @param nombre
	 * @param primerApe
	 * @param segundoApe
	 * @return
	 */
	public Customer findByCustomerNameAndFirstSurnameAndSecondSurname(String nombre, String primerApe, String segundoApe);
}
