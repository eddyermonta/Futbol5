package org.example.infraccion.service;

import org.example.partido.modelo.Jugador;

public interface InfraccionServiceI {
    void infraccionar(String motivo, Jugador jugador);

    void eliminarInfraccion(Jugador jugador);

    void verificarInfraccion(Jugador jugador);
}
