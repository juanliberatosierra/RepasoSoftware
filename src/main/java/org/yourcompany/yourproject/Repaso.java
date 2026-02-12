/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author angel
 */
public class Repaso {

    public static void main(String[] args) {
        Bibliotecario bibliotecario = new Bibliotecario("1", "pepe","pepe@gmail.com","mañana");
        System.out.println(bibliotecario.darEmail());

        Socio socio = new Socio("1", "Juan","juan@gmail.com",5);
        socio.registrarPrestamo(2);

    }
}
