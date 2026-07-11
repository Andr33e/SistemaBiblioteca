/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import modelo.Prestamo;
import java.util.Scanner;

import modelo.Usuario;
import modelo.Libro;
import modelo.Biblioteca;

public class Archivo {


    public void guardarUsuario(Usuario usuario) {

        try {

            FileWriter archivo = new FileWriter("usuarios.txt", true);
            PrintWriter escribir = new PrintWriter(archivo);

            escribir.println(
                    usuario.getCodigo() + "," +
                    usuario.getNombre() + "," +
                    usuario.getUsuario() + "," +
                    usuario.getContrasena()
            );

            escribir.close();

        } catch (IOException e) {

            System.out.println("Error al guardar usuario: " + e.getMessage());

        }

    }



    public void guardarLibro(Libro libro) {

        try {

            FileWriter archivo = new FileWriter("libros.txt", true);
            PrintWriter escribir = new PrintWriter(archivo);

            escribir.println(
                    libro.getCodigo() + "," +
                    libro.getTitulo() + "," +
                    libro.getAutor() + "," +
                    libro.getCategoria() + "," +
                    libro.isDisponible()
            );

            escribir.close();

        } catch (IOException e) {

            System.out.println("Error al guardar libro: " + e.getMessage());

        }

    }



    public void leerUsuarios() {

        try {

            File archivo = new File("usuarios.txt");

            Scanner lector = new Scanner(archivo);


            while (lector.hasNextLine()) {

                String linea = lector.nextLine();

                System.out.println(linea);

            }


            lector.close();


        } catch (IOException e) {

            System.out.println("Error al leer usuarios: " + e.getMessage());

        }

    }

public void cargarUsuarios(Biblioteca biblioteca) {

    try {

        File archivo = new File("usuarios.txt");

        if(!archivo.exists()){
            return;
        }

        Scanner lector = new Scanner(archivo);


        while(lector.hasNextLine()){

            String linea = lector.nextLine();

            String datos[] = linea.split(",");


            Usuario usuario = new Usuario(
                    datos[0],
                    datos[1],
                    datos[2],
                    datos[3]
            );


            biblioteca.agregarUsuario(usuario);

        }


        lector.close();


    } catch(Exception e){

        System.out.println("Error cargando usuarios: " + e.getMessage());

    }

}
   public void cargarLibros(Biblioteca biblioteca) {

    try {

        File archivo = new File("libros.txt");

        if(!archivo.exists()){
            return;
        }


        Scanner lector = new Scanner(archivo);


        while(lector.hasNextLine()){

            String linea = lector.nextLine();

            String datos[] = linea.split(",");


            Libro libro = new Libro(
                    datos[0],
                    datos[1],
                    datos[2],
                    datos[3],
                    Boolean.parseBoolean(datos[4])
            );


            biblioteca.agregarLibro(libro);

        }


        lector.close();


    } catch(Exception e){

        System.out.println("Error cargando libros: " + e.getMessage());

    }

}
 public void guardarPrestamo(Prestamo prestamo) {

    try {

        FileWriter fw = new FileWriter("prestamos.txt", true);
        PrintWriter pw = new PrintWriter(fw);

        pw.println(
                prestamo.getUsuario() + "," +
                prestamo.getLibro() + "," +
                prestamo.getFechaPrestamo() + "," +
                prestamo.getFechaDevolucion()
        );

        pw.close();

    } catch (Exception e) {

        System.out.println("Error al guardar préstamo.");

    }

}
 public void cargarPrestamos(Biblioteca biblioteca) {

    try {

        File archivo = new File("prestamos.txt");

        if (!archivo.exists()) {
            return;
        }

        Scanner lector = new Scanner(archivo);

        while (lector.hasNextLine()) {

            String[] datos = lector.nextLine().split(",");

            Prestamo prestamo = new Prestamo(
                    datos[0],
                    datos[1],
                    java.time.LocalDate.parse(datos[2]),
                    java.time.LocalDate.parse(datos[3])
            );

            biblioteca.agregarPrestamo(prestamo);
        }

        lector.close();

    } catch (Exception e) {

        System.out.println("Error al cargar préstamos: " + e.getMessage());

    }

}
}