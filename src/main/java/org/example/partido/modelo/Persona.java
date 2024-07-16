package org.example.partido.modelo;

import org.example.partido.modelo.enums.jugador.TipoDocumento;

public abstract class Persona {
    private Long idPersona;
    private String nombre;
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;
    private String telefono;
    private String correoElectronico;

    public Persona(Long idPersona, String nombre, TipoDocumento tipoDocumento, String numeroDocumento, String telefono, String correoElectronico) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public Long idPersona() {
        return idPersona;
    }

    public Persona setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
        return this;
    }

    public String nombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public TipoDocumento tipoDocumento() {
        return tipoDocumento;
    }

    public Persona setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    public String numeroDocumento() {
        return numeroDocumento;
    }

    public Persona setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    public String telefono() {
        return telefono;
    }

    public Persona setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public String correoElectronico() {
        return correoElectronico;
    }

    public Persona setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
        return this;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", tipoDocumento=" + tipoDocumento +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
