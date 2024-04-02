package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {
	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement ps=null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Cuenta","postgres","12345p");
			System.out.println("conextion exitosa");
		
			ps=connection.prepareStatement("insert into estudiantes(cedula,nombre,apellido,email,fecha_nacimiento,codigo_profesor,mensual)\r\n"
					+ "			values(?,?,?,?,?,?,?)");
			ps.setString(1, "1856309967");
			ps.setString(2, "Paola");
			ps.setString(3, "Paucarima");
			ps.setString(4,"paucar@gmail.com");
			
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr="2000/03/22 10:05:04";
	
			try {
			
				Date fecha=sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis=fecha.getTime();
				System.out.println(fechaMilis);
			
				java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
				System.out.println("Fecha sql"+fechaSQL);
				
				Time timeSQL=new Time(fechaMilis);
				System.out.println(timeSQL);
				
				ps.setDate(5, fechaSQL);
				ps.setInt(6, 1);
				//ps.setTime(9, timeSQL);
				//ps.setDouble(6,1.56);
				//Columna tipo money
				ps.setBigDecimal(7,new BigDecimal(1200.45));
				
				ps.executeUpdate();
				System.out.println("EJECUTA INSERT");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
