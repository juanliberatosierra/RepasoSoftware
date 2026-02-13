/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

public class Repaso {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Bibliotecario bibliotecario = new Bibliotecario("1", "pepe","pepe@gmail.com","mañana");
       

        Socio socio = new Socio("1", "Juan","juan@gmail.com",5);
        biblioteca.agregarSocio(socio);

    }
}
