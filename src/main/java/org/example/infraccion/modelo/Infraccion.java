package org.example.infraccion.modelo;

public record Infraccion(int idInfracion,
                         int cantidadInfracion,
                         boolean estaPenalizado) {
}
