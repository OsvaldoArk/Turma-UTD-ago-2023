package conexao.con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection createConnection(){
		String url = "jdbc:mysql://127.0.0.1:3306/db_teste"; //Nome da base de dados
		String user = "admin"; //nome do usuário do MySQL
		String password = "mariadb123"; //senha do MySQL

		Connection conexao = null;

		try {
			conexao = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conexao;
	}
	
}
