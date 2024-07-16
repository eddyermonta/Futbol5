package org.example.partido.modelo.enums.jugador;

public enum Suscripcion {
    AUTOMATICA("Suscripcion automatica"),
    MANUAL("Suscripcion manual");

    private String suscripcion;

    Suscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    public String getSuscripcion() {
        return this.suscripcion;
    }
}
