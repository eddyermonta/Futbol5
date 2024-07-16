package org.example.calificacion.service;

import org.example.calificacion.modelo.Calificacion;

import java.util.List;

public interface CalificacionServiceI {
    public void validarNota(Calificacion calificacion);

    public double promedioNotas(List<Calificacion> calificacion);
}
