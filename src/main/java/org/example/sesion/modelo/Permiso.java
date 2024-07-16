package org.example.sesion.modelo;

public class Permiso {
    private Long idPermiso;
    private String descripcionPermiso;
    private CuentaUsuario cuentaUsuario;

    public Permiso(String descripcionPermiso, CuentaUsuario cuentaUsuario) {
        this.descripcionPermiso = descripcionPermiso;
        this.cuentaUsuario = cuentaUsuario;
        this.idPermiso = null;
    }

    public Long idPermiso() {
        return idPermiso;
    }

    public Permiso setIdPermiso(Long idPermiso) {
        this.idPermiso = idPermiso;
        return this;
    }

    public String descripcionPermiso() {
        return descripcionPermiso;
    }

    public Permiso setDescripcionPermiso(String descripcionPermiso) {
        this.descripcionPermiso = descripcionPermiso;
        return this;
    }

    public CuentaUsuario cuentaUsuario() {
        return cuentaUsuario;
    }

    public Permiso setCuentaUsuario(CuentaUsuario cuentaUsuario) {
        this.cuentaUsuario = cuentaUsuario;
        return this;
    }
}
