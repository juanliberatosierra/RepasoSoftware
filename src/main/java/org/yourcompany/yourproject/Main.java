/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Bibliotecario bibliotecario =
                new Bibliotecario("1", "Pepe", "pepe@gmail.com", "mañana");
        biblioteca.agregarBibliotecario(bibliotecario);

        Socio socio = new Socio("2", "Juan", "juan@gmail.com", 5);
        biblioteca.agregarSocio(socio);

        Libro libro = new Libro("ISBN1", "Ingeniería de Software");
        biblioteca.agregarLibro(libro);

        Ejemplar e1 = libro.crearEjemplar("Ejemplar-1");
        Ejemplar e2 = libro.crearEjemplar("Ejemmplar-2");

        // Probar regla del socio
        socio.registrarPrestamo(2);

        System.out.println("Sistema funcionando correctamente");
    }
}
