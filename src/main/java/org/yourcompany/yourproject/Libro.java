package org.yourcompany.yourproject;

import java.util.ArrayList;

public class Libro {

    private String isbn;
    private String titulo;
    private ArrayList<Ejemplar> ejemplares;

    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.ejemplares = new ArrayList<>();
    }

    public Ejemplar crearEjemplar(String codigo) {
        Ejemplar ejemplar = new Ejemplar(codigo, this);
        ejemplares.add(ejemplar);
        return ejemplar;
    }

    public String darTitulo() {
        return titulo;
    }

    public ArrayList<Ejemplar> darEjemplares() {
        return ejemplares;
    }
}
