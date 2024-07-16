package org.example.partido.dao;

import org.example.partido.modelo.Persona;
import org.example.util.conexion.DatabaseConnection;
import org.example.util.sql.SQLQueries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonaDAO implements PersonaDAOI {
    @Override
    public long guardarPersona(Persona persona) {
        try (Connection conn = DatabaseConnection.conectar();
             PreparedStatement preparedStatement = conn.prepareStatement(SQLQueries.INSERTAR_PERSONA, Statement.RETURN_GENERATED_KEYS);) {
            //idPersona, nombre, tipoDocumento, documento, correoElectronico
            preparedStatement.setLong(1, persona.idPersona());
            preparedStatement.setString(2, persona.nombre());
            preparedStatement.setString(3, persona.tipoDocumento().getDocumento());
            preparedStatement.setString(4, persona.numeroDocumento());
            preparedStatement.setString(5, persona.correoElectronico());
            int affectedRow = preparedStatement.executeUpdate();
            if (affectedRow == 0) {
                throw new SQLException("No se pudo guardar la persona");
            } else if (affectedRow == 1) {
                return persona.idPersona();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
        return -1;
    }

    @Override
    public Persona obtenerPersona() {
        return null;
    }
}
