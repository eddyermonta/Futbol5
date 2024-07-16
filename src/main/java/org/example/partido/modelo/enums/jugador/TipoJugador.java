package org.example.partido.modelo.enums.jugador;

public enum TipoJugador {
    JE("Jugador Frecuente"),
    JO("Jugador Ocasional");

    private String tipoJugador;

    TipoJugador(String tipoJugador) {
        this.tipoJugador = tipoJugador;
    }

    public String getTipoJugador() {
        return this.tipoJugador;
    }
}
