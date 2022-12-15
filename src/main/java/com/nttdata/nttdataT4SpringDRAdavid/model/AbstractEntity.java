package com.nttdata.nttdataT4SpringDRAdavid.model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;


@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	
	/**
	 * NOMBRE DEL USUARIO QUE HA TRATADO EL REGISTRO
	 * @param obj
	 */
	private String userNameUpdate;
	/**
	 * FECHA DE CREACION/MODIFICACIÓN DEL REGISTRO
	 * @param obj
	 */
	private String updateDate;

	/**
	 * OBTIENE EL ID DEL REGISTRO
	 * @param obj
	 */
	@Transient
	public abstract long getId();

	/**
	 * SETEA EL ID DEL REGISTRO
	 * @param obj
	 */
	public abstract void setId(final Long id);
	
	/**
	 *DEVUELVE EL NOMBRE DEL USUARIO
	 * @param obj
	 */
	@Column(name="C_NAME_UPDATE_USER")
	public String getUserNameUpdate() {
		return userNameUpdate;
	}
	
	/**
	 *DEVUELVE LA FECHA DE ACTUALIZACIÓN
	 * @param obj
	 */
	@Column(name="C_DATE_UPDATE")

	public String getUpdateDate() {
		return updateDate;
	}
	
	
	/**
	 *SETEA EL NOMBRE DE USUARIO
	 * @param obj
	 */
	public void setUserNameUpdate(String userNameUpdate) {
		this.userNameUpdate = userNameUpdate;
	}
	
	/**
	 *SETEA LA FECHA DE ACTUALIZACIÓN
	 * @param obj
	 */
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
}
