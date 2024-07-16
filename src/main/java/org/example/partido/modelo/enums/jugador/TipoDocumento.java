package org.example.partido.modelo.enums.jugador;

public enum TipoDocumento {
    CC("Cedula de ciudadania"),
    CE("Cedula de extranjeria"),
    TI("Tarjeta de identidad");

    private String documento;

    TipoDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return this.documento;
    }
}
