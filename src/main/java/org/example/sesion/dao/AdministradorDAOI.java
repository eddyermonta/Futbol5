package org.example.sesion.dao;

import org.example.sesion.modelo.Administrador;

public interface AdministradorDAOI {
    public boolean guardarAdministrador(Administrador administrador);

    public Administrador obtenerAdministrador();
}
