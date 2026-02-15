package org.yourcompany.yourproject;

public class EmailNotificador implements Notificador {


    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviando mensaje email " + mensaje + " a " + destino);
    }
}
