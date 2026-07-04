/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import modelo.Prestamo;
import reportes.Reporte;

public class Main {

    public static void main(String[] args) {
        
        Prestamo p1 = new Prestamo(
                "Felipe",
                "Java Básico",
                "03/07/2026",
                "10/07/2026"
        );

        Reporte.reportePrestamo(p1);
    }
}
