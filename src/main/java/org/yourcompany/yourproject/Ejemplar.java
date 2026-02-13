package org.yourcompany.yourproject;

public class Ejemplar {

    private String codigo;
    private Libro libro;

    public Ejemplar(String codigo, Libro libro) {
        this.codigo = codigo;
        this.libro = libro;
    }

    public String darCodigo() {
        return codigo;
    }

    public Libro darLibro() {
        return libro;
    }
}
