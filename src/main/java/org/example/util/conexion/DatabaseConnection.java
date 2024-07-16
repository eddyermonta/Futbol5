package org.example.util.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private ConfigConnection configConnection;

    public DatabaseConnection(ConfigConnection configConnection) {
        this.configConnection = configConnection;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                configConnection.url(),
                configConnection.username(),
                configConnection.password()
        );
    }

    public static Connection conectar() throws SQLException {
        DatabaseConnection databaseConnection = new DatabaseConnection(new ConfigConnection());
        Connection connection = databaseConnection.getConnection();
        if (connection != null) return connection;
        else return null;
    }

    public static void desconectar(Connection connection) throws SQLException {
        connection.close();
    }

}
