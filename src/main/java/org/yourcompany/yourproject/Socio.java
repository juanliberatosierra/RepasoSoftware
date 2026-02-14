package org.yourcompany.yourproject;

public class Socio extends Usuario {

    private int limiteEjemplares;
    private int ejemplaresEnPrestamo;
    private double multasPendientes;

    public Socio(String id, String nombre, String email, int limiteEjemplares) {
        super(id, nombre, email);
        this.limiteEjemplares = limiteEjemplares;
        this.ejemplaresEnPrestamo = 0;
        this.multasPendientes = 0;
    }

    public boolean puedePedirPrestamo(int cantidad) {
        if (multasPendientes > 0) {
            return false;
        }
        return (ejemplaresEnPrestamo + cantidad) <= limiteEjemplares;
    }

    public void registrarPrestamo(int cantidad) {
        if (!puedePedirPrestamo(cantidad)) {
            throw new IllegalArgumentException("El socio no puede realizar el préstamo");
        }
        ejemplaresEnPrestamo += cantidad;
    }

    public void agregarMulta(double monto) {
        multasPendientes += monto;
    }
}