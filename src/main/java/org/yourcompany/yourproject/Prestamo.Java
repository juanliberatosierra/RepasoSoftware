package org.yourcompany.yourproject;

import java.util.List;

public class Prestamo {

    private Socio socio;
    private List<Ejemplar> ejemplares;

    public Prestamo(Socio socio, List<Ejemplar> ejemplares) {
        this.socio = socio;
        this.ejemplares = ejemplares;
    }

    public void notificarCreacion(Notificador notificador) {
        String mensaje = "Se ha registrado un préstamo con "
                + ejemplares.size() + " ejemplares.";

        notificador.enviar(socio.darEmail(), mensaje);
    }

    public Socio getSocio() {
        return socio;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }
}


