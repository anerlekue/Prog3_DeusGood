package BD;

import java.sql.*;
import java.util.Date;
import java.util.logging.Level;

public class BD {
	
	private static Exception lastError = null;

	public static Connection initBD(String nombreBD) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:" + nombreBD);
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			lastError = e;
			e.printStackTrace();
			return null;
		}
	}

	public static Statement usarBD(Connection con) {
		try {
			Statement statement = con.createStatement();
			statement.setQueryTimeout(30); // poner timeout 30 msg
			return statement;
		} catch (SQLException e) {
			lastError = e;
			e.printStackTrace();
			return null;
		}
	}

	public static Statement usarCrearTablasBD(Connection con) {
		try {
			Statement statement = con.createStatement();
			statement.setQueryTimeout(30); // poner timeout 30 msg
			try {
				statement.executeUpdate("create table usuario " + "(nick string, email string, contrasenya string)");
				statement.executeUpdate("create table donantes " + "(nick string, numCuenta int, cantidadDonada int, pagomensual int)");
			} catch (SQLException e) {
			} // Tabla ya existe. Nada que hacer
			return statement;
		} catch (SQLException e) {
			lastError = e;
			e.printStackTrace();
			return null;
		}
	}

	public static Statement reiniciarBD(Connection con) {
		try {
			Statement statement = con.createStatement();
			statement.setQueryTimeout(30); // poner timeout 30 msg
			statement.executeUpdate("drop table if exists usuario");
			return usarCrearTablasBD(con);
		} catch (SQLException e) {
			lastError = e;
			e.printStackTrace();
			return null;
		}
	}

	public static void cerrarBD(final Connection con, final Statement st) {
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();

		} catch (SQLException e) {
			lastError = e;
			e.printStackTrace();
		}
	}
	public static int buscarUsuario(String nick, String contrasenya) {
		int resultado = 0;
		String query = "SELECT * FROM usuario WHERE nick='" + nick + "'";
		Connection con = BD.initBD("BaseDeDatos.db");
		Statement st = BD.usarBD(con);
		try {
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				String cl = rs.getString(2);
				if (cl.equals(contrasenya)) {
					resultado = 1;
				} else {
					resultado = 2;
				}
			} else {
				resultado = 0;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cerrarBD(con, st);
		return resultado;

	}
	public static void registrarUsuario(String nick, String email, String contrasenya) {
		Connection con = BD.initBD("BaseDeDatos.db");
		Statement st = BD.usarBD(con);
		String sql = "INSERT INTO usuario VALUES('" + nick + "','" + email + "','" + contrasenya + "')";
		try {
			st.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cerrarBD(con, st);
	}
	public static int buscarNombreUsuario(String nick) {
		int resultado = 0;
		String query = "SELECT * FROM usuario WHERE nick='" + nick + "'";
		Connection con = BD.initBD("BaseDeDatos.db");
		Statement st = BD.usarBD(con);
		try {
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				String cl = rs.getString(1);
				if (cl.equals(nick)) {
					resultado = 1; // nombres iguales
				}
			} else {
				resultado = 0; // no encontrado
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cerrarBD(con, st);
		return resultado;

	}
	public static void cambiarContrasenyaUsuario(String nombre, String nuevaContrasenya) {
		Connection con = BD.initBD("BaseDeDatos.db");

		Statement st = BD.usarBD(con);
		String sql = "UPDATE usuario SET contrasenya ='" + nuevaContrasenya + "' WHERE nick ='" + nombre + "'";
		try {
			st.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cerrarBD(con, st);
	}
	
	public static void cambiarNombreUsuario(String nombre, String nuevoNombre) {
        Connection con = BD.initBD("BaseDeDatos.db");
        Statement st = BD.usarBD(con);
        String sql = "UPDATE usuario SET nick ='" + nuevoNombre + "' WHERE nick ='" + nombre + "'";
        try {
            st.executeUpdate(sql);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        cerrarBD(con, st);
    }
	public static void Donar(String numCuenta, String cantidad, int pagoMensual) {
		Connection con = BD.initBD("BaseDeDatos.db");
		Statement st = BD.usarBD(con);
		String sql = "INSERT INTO donantes VALUES('" + numCuenta + "','" + cantidad +"','" + pagoMensual + "')";
		try {
			st.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cerrarBD(con, st);
	}
	
	
	public static Exception getLastError() {
		return lastError;
	}
}
