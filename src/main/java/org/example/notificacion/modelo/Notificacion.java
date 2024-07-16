package org.example.notificacion.modelo;

import java.util.Date;

public record Notificacion(Long idNotificacion,
                           String contenido,
                           String destino,
                           String origen,
                           String asunto,
                           Date fechaEnvio
) {
}
