/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author andr33ee
 */
public class Biblioteca {

    private Libro[] libros;
    private Usuario[] usuarios;
    private Prestamo[] prestamos;

    private int totalLibros;
    private int totalUsuarios;
    private int totalPrestamos;


    public Biblioteca() {

        libros = new Libro[100];
        usuarios = new Usuario[100];
        prestamos = new Prestamo[100];

        totalLibros = 0;
        totalUsuarios = 0;
        totalPrestamos = 0;
    }


    public void agregarLibro(Libro libro) {

        libros[totalLibros] = libro;
        totalLibros++;
    }


    public void agregarUsuario(Usuario usuario) {

        usuarios[totalUsuarios] = usuario;
        totalUsuarios++;
    }


    public void agregarPrestamo(Prestamo prestamo) {

        prestamos[totalPrestamos] = prestamo;
        totalPrestamos++;
    }


    public void mostrarLibros() {

        for (int i = 0; i < totalLibros; i++) {

            System.out.println(libros[i]);

        }
    }


    public void mostrarUsuarios() {

        for (int i = 0; i < totalUsuarios; i++) {

            System.out.println(usuarios[i]);

        }
    }


    public void mostrarPrestamos() {

        for (int i = 0; i < totalPrestamos; i++) {

            prestamos[i].mostrarPrestamo();

        }
    }


    public Libro buscarLibro(String codigo) {

        for (int i = 0; i < totalLibros; i++) {

            if (libros[i].getCodigo().equals(codigo)) {

                return libros[i];
            }
        }

        return null;
    }


    public Usuario buscarUsuario(String codigo) {

        for (int i = 0; i < totalUsuarios; i++) {

            if (usuarios[i].getCodigo().equals(codigo)) {

                return usuarios[i];
            }
        }

        return null;
    }


    public Prestamo buscarPrestamo(String usuario) {

        for (int i = 0; i < totalPrestamos; i++) {

            if (prestamos[i].getUsuario().equals(usuario)) {

                return prestamos[i];
            }
        }

        return null;
    }


    public boolean libroDisponible(String codigo) {

        Libro libro = buscarLibro(codigo);

        if (libro != null) {

            return libro.isDisponible();

        }

        return false;
    }


    public void realizarPrestamo(Prestamo prestamo) {

        prestamos[totalPrestamos] = prestamo;
        totalPrestamos++;

    }


    public Usuario buscarPorUsuario(String usuario) {

        for (int i = 0; i < totalUsuarios; i++) {

            if (usuarios[i].getUsuario().equals(usuario)) {

                return usuarios[i];

            }
        }

        return null;
    }


    public Libro[] getLibros() {

        return libros;

    }


    public Usuario[] getUsuarios() {

        return usuarios;

    }


    public Prestamo[] getPrestamos() {

        return prestamos;

    }


    public int getTotalLibros() {

        return totalLibros;

    }


    public int getTotalUsuarios() {

        return totalUsuarios;

    }


    public int getTotalPrestamos() {

        return totalPrestamos;

    }

}
