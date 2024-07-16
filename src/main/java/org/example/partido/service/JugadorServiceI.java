package org.example.partido.service;

import org.example.partido.modelo.Jugador;
import org.example.partido.modelo.Partido;

public interface JugadorServiceI {
    public boolean estaElJugador(Jugador jugador);

    public boolean darseBaja(Jugador jugador, Jugador jugadorRemplazo, Partido partido);

    public boolean suscribirse(Jugador jugador, Partido partido);

    public boolean elegirFormaJuego(Jugador jugador, Partido partido);

    public boolean estaPenalizado(Jugador jugador);
}
