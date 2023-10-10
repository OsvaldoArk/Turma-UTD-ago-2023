package orientacaoaobjeto.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection createConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/db_teste"; //Nome da base de dados
		String user = "admin"; //nome do usuário do MySQL
		String password = "mariadb123"; //senha do MySQL

		Connection conexao = null;
		conexao = DriverManager.getConnection(url, user, password);

		return conexao;
	}
}