package org.example.partido.dao;

import org.example.partido.modelo.Persona;

public interface PersonaDAOI {
    public long guardarPersona(Persona persona);

    public Persona obtenerPersona();
}
