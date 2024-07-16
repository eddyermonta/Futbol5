package org.example.partido.modelo.enums.jugador;

public enum FormaJuego {
    ESTANDAR("Estandar"),
    SOLIDARIO("Solidario");

    private String formaJuego;

    FormaJuego(String formaJuego) {
        this.formaJuego = formaJuego;
    }

    public String getFormaJuego() {
        return this.formaJuego;
    }
}
