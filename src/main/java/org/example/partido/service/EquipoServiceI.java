package org.example.partido.service;

import org.example.partido.modelo.Equipo;
import org.example.partido.modelo.Jugador;
import org.example.partido.modelo.Partido;

import java.util.List;
import java.util.Optional;

public interface EquipoServiceI {
    public Optional<List<Equipo>> formaciones(List<Jugador> jugadorList);

    public boolean moverJugador(Equipo equipo, Jugador jugador);

    public boolean agregarJUgador(Jugador jugador);

    public boolean quitarJugador(Jugador jugador);

    public boolean cambiarFormacion(Equipo equipo);

    public boolean reemplarJugador(Jugador jugador, Jugador jugadorRemplazo);

    public int contarInfracciones(List<Partido> partido);
}
