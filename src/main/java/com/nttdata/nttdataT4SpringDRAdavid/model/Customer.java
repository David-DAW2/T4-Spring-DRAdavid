package com.nttdata.nttdataT4SpringDRAdavid.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "T_DRA_CUSTOMER_T3")
public class Customer extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ID DEL CLIENTE
	 */
	private Long customerId;

	/**
	 * NOMBRE DEL CLIENTE
	 */
	private String customerName;

	/**
	 * PRIMER APELLIDO DEL CLIENTE
	 */
	private String firstSurname;

	/**
	 * SEGUNDO APELLIDO DEL CLIENTE
	 */
	private String secondSurname;
	
	/**
	 * FECHA NACIMIENTO DEL CLIENTE DEL CLIENTE
	 */
	private String fechaNac;


	/**
	 * DNI DEL CLIENTE
	 */
	private int dni;


	/**
	 * RETORNA EL ID DEL CLIENTE
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "C_CUSTOMER_ID")
	public Long getcustomerId() {
		return customerId;
	}

	/**
	 * RETORNA LA FECHA DE NACIMIENTO DEL CLIENTE
	 */
	public String getFechaNac() {
		return fechaNac;
	}

	/**
	 * DECLARA LA FECHA DE NACIMIENTO DEL CLIENTE
	 * @param fechaNac
	 */
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	/**
	 * RETORNA EL NOMBRE DEL CLIENTE
	 * 
	 * @return
	 */
	@Column(name = "C_CUSTOMER_NAME")

	public String getCustomerName() {
		return customerName;
	}

	/**
	 * RETORNA EL PRIMER APELLIDO
	 * 
	 * @return
	 */
	@Column(name = "C_FIRST_SURNAME")
	public String getFirstSurname() {
		return firstSurname;
	}

	/**
	 * RETORNA EL SEGUNDO APELLIDO
	 * 
	 * @return
	 */
	@Column(name = "C_SECOND_SURNAME")
	public String getSecondSurname() {
		return secondSurname;
	}

	/**
	 * RETORNA EL DNI
	 * 
	 * @return
	 */
	@Column(name = "C_DNI", unique = true)
	public int getDni() {
		return dni;
	}

	/**
	 * DECLARA EL ID DE CLIENTE
	 * 
	 * @param customerId
	 */
	public void setcustomerId(long customerId) {
		this.customerId = customerId;
	}

	/**
	 * DECLARA EL NOMBRE DEL CLIENTE
	 * 
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * DECLARA EL PRIMER APELLIDO DEL CLIENTE
	 * 
	 * @param firstSurname
	 */
	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	/**
	 * DECLARA EL SEGUNDO APELLIDO DEL CLIENTE
	 * 
	 * @param secondSurname
	 */
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	/**
	 * DECLARA EL DNI DEL CLIENTE
	 * 
	 * @param dNI
	 */
	public void setDni(int dNI) {
		this.dni = dNI;
	}

	@Override
	@Transient
	public void setId(Long id) {

	}

	@Override
	@Transient
	public long getId() {
		return 0;
	}

}
