package org.example.calificacion.service;

import org.example.calificacion.modelo.Calificacion;

import java.util.List;

public class CalificacionService implements CalificacionServiceI {

    @Override
    public void validarNota(Calificacion calificacion) {
        if (calificacion.nota() < 0 || calificacion.nota() > 10) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10");
        }
    }

    @Override
    public double promedioNotas(List<Calificacion> calificacion) {
        return calificacion.stream().mapToDouble(Calificacion::nota).average().orElse(0);
    }

}
