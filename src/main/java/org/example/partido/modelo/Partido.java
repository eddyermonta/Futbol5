package org.example.partido.modelo;

import org.example.partido.modelo.enums.partido.Estado;

import java.util.Date;

public record Partido(Long idPartido,
                      Estado estadoPartido,
                      String resultado,
                      Date fechaPartido,
                      int golesLocal,
                      int golesVisitante,
                      Equipo equipoLocal,
                      Equipo equipoVisitante,
                      int semana) {
}
