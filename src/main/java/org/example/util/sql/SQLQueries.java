package org.example.util.sql;

public class SQLQueries {

    //ADMINISTRADOR
    public static final String INSERTAR_PERSONA = "INSERT INTO Persona (idPersona, nombre, tipoDocumento, documento, correoElectronico) VALUES (?, ?, ?, ?, ?)";
    public static final String INSERTAR_ADMINISTRADOR = "INSERT INTO Administrador (idAdministrador, Persona_idPersona) VALUES (?,?)";
    public static final String INSERTAR_CUENTA = "INSERT INTO cuentaUsuario (idcuentaUsuario, usuario, contra, Persona_idPersona) VALUES (?, ?, ?, ?);";

    public static final String OBTENER_PERSONA = "SELECT * FROM Persona WHERE idPersona = ?";
    public static final String OBTENER_ADMINISTRADOR = "SELECT * FROM Administrador WHERE idAdministrador = ?";
    public static final String OBTENER_CUENTA = "SELECT * FROM cuentaUsuario WHERE idcuentaUsuario = ?";
}
