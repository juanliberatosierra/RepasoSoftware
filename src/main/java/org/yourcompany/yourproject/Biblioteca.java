package org.yourcompany.yourproject;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Socio> socios;
    private ArrayList<Bibliotecario> bibliotecarios;
    private ArrayList<Libro> libros;

    public Biblioteca() {
        socios = new ArrayList<>();
        bibliotecarios = new ArrayList<>();
        libros = new ArrayList<>();
    }

    public void agregarSocio(Socio socio) {
        socios.add(socio);
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public ArrayList<Socio> darSocios() {
        return socios;
    }

    public ArrayList<Bibliotecario> darBibliotecarios() {
        return bibliotecarios;
    }

    public ArrayList<Libro> darLibros() {
        return libros;
    }
}
