package org.example.partido.modelo.enums.partido;

public enum Estado {
    CANCELADO("Cancelado"),
    PENDIENTE("Pendiente"),
    JUGADO("Jugado");

    private String estado;

    Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }
}
