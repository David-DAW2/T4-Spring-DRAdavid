package com.nttdata.nttdataT4SpringDRAdavid.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nttdata.nttdataT4SpringDRAdavid.NttdataT4SpringDrAdavidApplication;
@Controller
public class ControllerForm {
	private static final Logger LOG =LoggerFactory.getLogger(NttdataT4SpringDrAdavidApplication.class);

	/**
	 * Muestra la vista principal al acceder al servidor en el buscador
	 * @return
	 */
	@RequestMapping("/*")
	public String metodoPrueba() {
		LOG.info("------------------------------NAVEGACIÓN A LA VISTA PRINCIPAL--------------------------");

		return "registerForm";
	}
}
