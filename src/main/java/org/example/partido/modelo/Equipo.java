package org.example.partido.modelo;

import java.util.List;

public record Equipo(Long idEquipo,
                     String nombre,
                     List<Jugador> jugadorList) {
}