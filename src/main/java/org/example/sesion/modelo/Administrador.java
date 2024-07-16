package org.example.sesion.modelo;

import org.example.partido.modelo.Persona;
import org.example.partido.modelo.enums.jugador.TipoDocumento;

public class Administrador extends Persona {
    private Long idAdministrador;
    private static Administrador administrador;

    private Administrador(Long idPersona, String nombre, TipoDocumento tipoDocumento, String numeroDocumento, String telefono, String correoElectronico) {
        super(idPersona, nombre, tipoDocumento, numeroDocumento, telefono, correoElectronico);
        this.idAdministrador = idPersona;
    }

    public Long idAdministrador() {
        return idAdministrador;
    }

    public static synchronized Administrador getInstance() {
        if (administrador == null) {
            administrador = new Administrador(1L, "Administrador", TipoDocumento.CC, "123456789", "1234567890", "");
        }
        return administrador;
    }

}
