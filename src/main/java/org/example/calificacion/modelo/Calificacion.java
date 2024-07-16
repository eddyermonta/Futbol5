package org.example.calificacion.modelo;

public record Calificacion(Long idCalificacion, double nota, String critica) {

    public Calificacion(Long idCalificacion, double nota, String critica) {

        this.idCalificacion = idCalificacion;
        this.nota = 5.0; // Nota predeterminada para jugadores
        this.critica = critica;
    }
}
