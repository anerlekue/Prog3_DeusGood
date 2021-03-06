package BD;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class BDJUnit {

	@Test
	public void RegistrarUsuario() {
		Connection con = BD.initBD("BaseDeDatos.db");
		Statement st = BD.usarBD(con);
		BD.registrarUsuario("test", "test@gmail.com", "test1");
		int enc = BD.buscarUsuario("test", "test1");
		assertEquals(2, enc);
	}

	@Test
	public void BuscarUsuario() {
		Connection con = BD.initBD("BaseDeDatos.db");
		Statement st = BD.usarBD(con);
		int enc = BD.buscarUsuario("admin", "admin1");
		assertEquals(2, enc);

	}
	
	@Test
	public void BuscarNombreUsuario() {
		Connection con = BD.initBD("BaseDeDatos.db");
		Statement st = BD.usarBD(con);
		int enc = BD.buscarNombreUsuario("1");
		assertEquals(1, enc);
	}


}