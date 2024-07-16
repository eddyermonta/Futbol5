package org.example;

import org.example.partido.modelo.Persona;
import org.example.sesion.dao.AdministradorDAO;
import org.example.sesion.dao.AdministradorDAOI;
import org.example.sesion.modelo.Administrador;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Persona administrador = Administrador.getInstance();
        AdministradorDAOI administradorDAOI = new AdministradorDAO();

        administradorDAOI.guardarAdministrador((Administrador) administrador);
        System.out.println(administrador.toString());
    }
}
