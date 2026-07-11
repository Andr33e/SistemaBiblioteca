/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportes;

import modelo.Libro;
import modelo.Prestamo;


public class Reporte {

     public static String reporteLibro(Libro libro){

        StringBuilder sb = new StringBuilder();

        sb.append("===== REPORTE DE LIBRO =====\n");
        sb.append("Código: ").append(libro.getCodigo()).append("\n");
        sb.append("Título: ").append(libro.getTitulo()).append("\n");
        sb.append("Autor: ").append(libro.getAutor()).append("\n");
        sb.append("Categoría: ").append(libro.getCategoria()).append("\n");
        sb.append("Disponible: ")
          .append(libro.isDisponible() ? "Sí" : "No")
          .append("\n");


        return sb.toString();

    }



    public static String reportePrestamo(Prestamo prestamo){

        StringBuilder sb = new StringBuilder();

        sb.append("===== REPORTE DE PRÉSTAMO =====\n");
        sb.append("Usuario: ").append(prestamo.getUsuario()).append("\n");


        return sb.toString();

    }

}