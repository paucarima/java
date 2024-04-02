package com.krakedev.persitencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Estudiantes;
import com.krakedev.persitencia.util.ConexionBDD;

public class AdminEstudiantes {
	private static final Logger LOGGER = LogManager.getLogger(AdminEstudiantes.class);

	public static void insertar(Estudiantes estudiante) throws Exception {

		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a in serta>>> " + estudiante);
		try {
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					"insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor,mensual)\r\n"
							+ "			values(?,?,?,?,?,?,?)");
			ps.setString(1, estudiante.getCedula());
			ps.setString(2, estudiante.getNombre());
			ps.setString(3, estudiante.getApellido());
			ps.setString(4, estudiante.getEmail());
			ps.setDate(5, new java.sql.Date(estudiante.getFecha_nacimiento().getTime()));
			// ps.setTime(5, new Time(estudiante.getHora_nacimiento().getTime()));
			ps.setInt(6, estudiante.getCodigo_profesor().getCodigo());
			// ps.setTime(9, timeSQL);
			// ps.setDouble(6,1.56);
			// Columna tipo money
			ps.setBigDecimal(7, estudiante.getMensual());

			ps.executeUpdate();

		} catch (Exception e) {
			// mostrar el error al usuario
			// System.out.println(e.getMessage());
			// loggear el error
			LOGGER.error("Error al insertar", e);
			e.printStackTrace();
			throw new Exception("Error al insertar");
		} finally {
			// CERRAR LA CONEXION
			try {
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
				LOGGER.error("Erro con la base de datos", e2);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void actualizar(Estudiantes estudiante) throws Exception {

		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante actualizar>>> " + estudiante);
		try {
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					" update estudiantes set nombre=?, apellido=?,email=?,fecha_nacimiento=?, codigo_profesor=?,mensual=?\r\n"
							+ "	  where cedula=?");
			ps.setString(1, estudiante.getNombre());
			ps.setString(2, estudiante.getApellido());
			ps.setString(3, estudiante.getEmail());

			ps.setDate(4, new java.sql.Date(estudiante.getFecha_nacimiento().getTime()));
			// ps.setTime(5, new Time(estudiante.getHora_nacimiento().getTime()));
			ps.setInt(5, estudiante.getCodigo_profesor().getCodigo());
			// ps.setTime(9, timeSQL);
			// ps.setDouble(6,1.56);
			// Columna tipo money
			ps.setBigDecimal(6, estudiante.getMensual());
			ps.setString(7, estudiante.getCedula());

			ps.executeUpdate();
			LOGGER.debug("Actualizacion exitosa");
		} catch (Exception e) {
			// mostrar el error al usuario
			// System.out.println(e.getMessage());
			// loggear el error
			LOGGER.error("Error al actualizar", e);
			e.printStackTrace();
			throw new Exception("Error al actualizar");
		} finally {
			// CERRAR LA CONEXION
			try {
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
				LOGGER.error("Erro con la base de datos", e2);
				throw new Exception("Error con la base de datos");
			}
		}
	}

	public static void eliminar(Estudiantes estudiante) throws Exception{
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Estudiante eliminar>>> " + estudiante);
		try {
			con = ConexionBDD.conectar();

			ps = con.prepareStatement(
					" DELETE FROM estudiantes WHERE cedula=?");
			ps.setString(1, estudiante.getCedula());

			ps.executeUpdate();
			
			LOGGER.debug("Eliminacion exitosa");

		} catch (Exception e) {
			// mostrar el error al usuario
			// System.out.println(e.getMessage());
			// loggear el error
			LOGGER.error("Error al eliminar", e);
			e.printStackTrace();
			throw new Exception("Error al eliminar");
		} finally {
			// CERRAR LA CONEXION
			try {
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
				LOGGER.error("Erro con la base de datos", e2);
				throw new Exception("Error con la base de datos");
			}
		}
	}
}
