/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportes;

import modelo.Prestamo;

public class Reporte {

    public static void reportePrestamo(Prestamo p) {
        System.out.println("---- REPORTE DE PRÉSTAMO ----");
        p.mostrarPrestamo();
    }

}