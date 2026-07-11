/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

public class Prestamo {

    private String usuario;
    private String libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;


    public Prestamo(String usuario, String libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {

        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;

    }


    public String getUsuario() {

        return usuario;

    }


    public String getLibro() {

        return libro;

    }


    public LocalDate getFechaPrestamo() {

        return fechaPrestamo;

    }


    public LocalDate getFechaDevolucion() {

        return fechaDevolucion;

    }


    public void mostrarPrestamo() {

        System.out.println("Usuario: " + usuario);
        System.out.println("Libro: " + libro);
        System.out.println("Fecha de préstamo: " + fechaPrestamo);
        System.out.println("Fecha de devolución: " + fechaDevolucion);

    }

}
