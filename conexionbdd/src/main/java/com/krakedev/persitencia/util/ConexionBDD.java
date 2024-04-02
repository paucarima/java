package com.krakedev.persitencia.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {
	private  final static String DRIVER="org.postgresql.Driver";
	private  final static String URL="jdbc:postgresql://localhost:5432/Cuenta";
	private  final static String USUARIO="postgres";
	private  final static String CLAVE="12345p";
	private static final Logger LOGGER=LogManager.getLogger(ConexionBDD.class);
	
		public static Connection conectar() throws Exception{
			Connection connection=null;
			try {
				Class.forName(DRIVER);
				connection=DriverManager.getConnection(URL,USUARIO,CLAVE);
				LOGGER.debug("Conxion exitosa");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				
				LOGGER.error("Error en la infraestructura", e);
				throw new Exception("Error en el infraestructura");
			} catch (SQLException e) {
				
				LOGGER.error("Error al conectarse,revise usuario y pass", e);
				throw new Exception("Error al conectarse, revise usuario y clave");
			}
			
			return connection;
			
		}
}
