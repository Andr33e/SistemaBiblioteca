/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Prestamo {
    private String usuario;
    private String libro;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public Prestamo(String usuario, String libro, String fechaPrestamo, String fechaDevolucion) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public void mostrarPrestamo() {
        System.out.println("Usuario: " + usuario);
        System.out.println("Libro: " + libro);
        System.out.println("Fecha de préstamo: " + fechaPrestamo);
        System.out.println("Fecha de devolución: " + fechaDevolucion);
    }
}
