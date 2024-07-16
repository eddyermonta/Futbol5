package org.example.notificacion.modelo.enums;

public enum Email {
    GMAIL("@gmail.com"),
    OUTLOOK("@outlook.com"),
    HOTMAIL("@hotmail.com");

    private final String email;

    Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
}
