package org.example.partido.service;

import org.example.partido.modelo.Jugador;

import java.util.List;
import java.util.Optional;

public interface PartidoServiceI {

    public void crearPartido();

    public Optional<List<Jugador>> listaJugadoresFrecuentesPre(List<Jugador> jugadorList);

    //pobrabilidad de usar comparetor
    public Optional<List<Jugador>> ordenarListaJugadoresFrecuente(List<Jugador> jugadorFrecuenteList);

    public boolean confirmarFinPartido();

}
