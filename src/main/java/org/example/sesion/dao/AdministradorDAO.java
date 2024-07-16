package org.example.sesion.dao;

import org.example.partido.dao.PersonaDAO;
import org.example.partido.dao.PersonaDAOI;
import org.example.partido.modelo.Persona;
import org.example.sesion.modelo.Administrador;
import org.example.util.conexion.DatabaseConnection;
import org.example.util.sql.SQLQueries;

import java.sql.*;

public class AdministradorDAO implements AdministradorDAOI {
    @Override
    public boolean guardarAdministrador(Administrador administrador) {
        PersonaDAOI personaDAOI = new PersonaDAO();
        personaDAOI.guardarPersona((Persona) administrador);
        Long idPersona;
        try (Connection connection = DatabaseConnection.conectar();
             PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.INSERTAR_ADMINISTRADOR, Statement.RETURN_GENERATED_KEYS);
        ) {
            preparedStatement.setLong(1, administrador.idPersona());
            preparedStatement.setLong(1, administrador.idAdministrador());
            int affectedRow = preparedStatement.executeUpdate();
            return affectedRow > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Administrador obtenerAdministrador() {
        try (Connection connection = DatabaseConnection.conectar();
             PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.OBTENER_ADMINISTRADOR);) {
            preparedStatement.setLong(1, 1L);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getObject(1, Administrador.class);
            } else {
                return null;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
