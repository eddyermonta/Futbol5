package org.example.partido.modelo;

import org.example.infraccion.modelo.Infraccion;
import org.example.partido.modelo.enums.jugador.FormaJuego;
import org.example.partido.modelo.enums.jugador.Suscripcion;
import org.example.partido.modelo.enums.jugador.TipoDocumento;
import org.example.partido.modelo.enums.jugador.TipoJugador;

public class Jugador extends Persona {
    private Long idJugador;
    private TipoJugador tipoJugador;
    private Suscripcion suscripcion;
    private FormaJuego formaJuego;
    private Infraccion infraccion;
    private double promedio;

    public Jugador(Long idPersona, String nombre, TipoDocumento tipoDocumento, String numeroDocumento, String telefono, String correoElectronico) {
        super(idPersona, nombre, tipoDocumento, numeroDocumento, telefono, correoElectronico);
        this.idJugador = idJugador;
        this.tipoJugador = tipoJugador;
        this.suscripcion = suscripcion;
        this.formaJuego = formaJuego;
        this.promedio = promedio;
    }

    public FormaJuego formaJuego() {
        return formaJuego;
    }

    public Jugador setFormaJuego(FormaJuego formaJuego) {
        this.formaJuego = formaJuego;
        return this;
    }

    public Suscripcion suscripcion() {
        return suscripcion;
    }

    public Jugador setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
        return this;
    }

    public Long idJugador() {
        return idJugador;
    }

    public Jugador setIdJugador(Long idJugador) {
        this.idJugador = idJugador;
        return this;
    }

    public TipoJugador tipoJugador() {
        return tipoJugador;
    }

    public Jugador setTipoJugador(TipoJugador tipoJugador) {
        this.tipoJugador = tipoJugador;
        return this;
    }

    public double promedio() {
        return promedio;
    }

    public Jugador setPromedio(double promedio) {
        this.promedio = promedio;
        return this;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "idJugador=" + idJugador +
                ", tipoJugador=" + tipoJugador +
                ", promedio=" + promedio +
                '}';
    }
}
