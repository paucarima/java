package com.krakedev.ejemplomaven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger logger=LogManager.getLogger(Admin.class);
	
	public void agregar() {
		logger.warn("ingresar a warn");//cuidado
		logger.info("ingresar a info");//info
		logger.debug("ingresar a debug");
		logger.trace("ingresar a trace");//es mas detallado
		//trace se imprime todo
		
		
		logger.error("ingresar a error");//siempre se muestre error
		
	}
}
