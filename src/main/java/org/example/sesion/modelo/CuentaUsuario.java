package org.example.sesion.modelo;

public class CuentaUsuario {
    private Long idCuentaUsuario;
    private String usuario;
    private String contrasena;

    public CuentaUsuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.idCuentaUsuario = null;
    }

    public Long idCuentaUsuario() {
        return idCuentaUsuario;
    }

    public CuentaUsuario setIdCuentaUsuario(Long idCuentaUsuario) {
        this.idCuentaUsuario = idCuentaUsuario;
        return this;
    }

    public String usuario() {
        return usuario;
    }

    public CuentaUsuario setUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public String contrasena() {
        return contrasena;
    }

    public CuentaUsuario setContrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }
}
