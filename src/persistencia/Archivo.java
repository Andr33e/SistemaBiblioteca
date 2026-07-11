/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import modelo.Usuario;
import modelo.Libro;

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

}