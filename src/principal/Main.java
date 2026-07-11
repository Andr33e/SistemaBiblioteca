/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;
import modelo.Biblioteca;
import modelo.Libro;
import modelo.Usuario;
import modelo.Prestamo;
import reportes.Reporte;
import servicio.Login;
import persistencia.Archivo;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);

Biblioteca biblioteca = new Biblioteca();

Archivo archivo = new Archivo();

archivo.cargarUsuarios(biblioteca);

 archivo.cargarLibros(biblioteca);
 
 archivo.cargarPrestamos(biblioteca);
         
       Login login = new Login();
       
       Usuario usuarioAdmin = new Usuario(
        "001",
        "Administrador",
        "admin",
        "1234"
);

     biblioteca.agregarUsuario(usuarioAdmin);

        int opcion;
  
       boolean acceso = false;

    while(!acceso){

    System.out.print("Usuario: ");
    String usuario = teclado.next();

    System.out.print("Contraseña: ");
    String contrasena = teclado.next();


    acceso = login.validarUsuario(biblioteca, usuario, contrasena);


    if(acceso){

        System.out.println("Bienvenido al sistema.");

    }else{

        System.out.println("Usuario o contraseña incorrectos.");

    }

}  
        
     do {

    System.out.println("==================================");
    System.out.println("     SISTEMA DE BIBLIOTECA");
    System.out.println("==================================");
    System.out.println("1. Registrar libro");
    System.out.println("2. Registrar usuario");
    System.out.println("3. Registrar préstamo");
    System.out.println("4. Mostrar libros");
    System.out.println("5. Mostrar usuarios");
    System.out.println("6. Mostrar préstamos");
    System.out.println("7. Salir");
    System.out.print("Seleccione una opción: ");

    opcion = teclado.nextInt();
   
    switch (opcion) {

     case 1:

    teclado.nextLine();

    System.out.print("Código: ");
    String codigo = teclado.nextLine();

    System.out.print("Título: ");
    String titulo = teclado.nextLine();

    System.out.print("Autor: ");
    String autor = teclado.nextLine();

    System.out.print("Categoría: ");
    String categoria = teclado.nextLine();

    Libro libro = new Libro(codigo, titulo, autor, categoria, true);

    biblioteca.agregarLibro(libro);
    archivo.guardarLibro(libro);
         System.out.println(Reporte.reporteLibro(libro));

    System.out.println("Libro registrado correctamente.");

    break;

    case 2:

    teclado.nextLine();

    System.out.print("Código del usuario: ");
    String codigoUsuario = teclado.nextLine();

    System.out.print("Nombre: ");
    String nombre = teclado.nextLine();

    System.out.print("Usuario: ");
    String usuario = teclado.nextLine();

    System.out.print("Contraseña: ");
    String contrasena = teclado.nextLine();


    Usuario nuevoUsuario = new Usuario(
            codigoUsuario,
            nombre,
            usuario,
            contrasena
    );


    biblioteca.agregarUsuario(nuevoUsuario);
    
    archivo.guardarUsuario(nuevoUsuario);


    System.out.println("Usuario registrado correctamente.");

    break;

 
case 3:

    teclado.nextLine();

    System.out.print("Usuario que realiza el préstamo: ");
    String usuarioPrestamo = teclado.nextLine();

    Usuario usuarioBuscado = biblioteca.buscarPorUsuario(usuarioPrestamo);

    if (usuarioBuscado == null) {
        System.out.println("El usuario no existe.");
        break;
    }

    System.out.print("Libro prestado (código): ");
    String libroPrestamo = teclado.nextLine();

    Libro libroBuscado = biblioteca.buscarLibro(libroPrestamo);

    if (libroBuscado == null) {
        System.out.println("El libro no existe.");
        break;
    }

    if (!libroBuscado.isDisponible()) {
        System.out.println("El libro ya está prestado.");
        break;
    }

    System.out.print("Año de préstamo: ");
    int anioPrestamo = teclado.nextInt();

    System.out.print("Mes de préstamo: ");
    int mesPrestamo = teclado.nextInt();

    System.out.print("Día de préstamo: ");
    int diaPrestamo = teclado.nextInt();

    System.out.print("Año de devolución: ");
    int anioDevolucion = teclado.nextInt();

    System.out.print("Mes de devolución: ");
    int mesDevolucion = teclado.nextInt();

    System.out.print("Día de devolución: ");
    int diaDevolucion = teclado.nextInt();

    LocalDate fechaPrestamo;
    LocalDate fechaDevolucion;

    try {

        fechaPrestamo = LocalDate.of(
                anioPrestamo,
                mesPrestamo,
                diaPrestamo
        );

        fechaDevolucion = LocalDate.of(
                anioDevolucion,
                mesDevolucion,
                diaDevolucion
        );

    } catch (Exception e) {

        System.out.println("Fecha inválida.");
        break;

    }

    libroBuscado.setDisponible(false);

    Prestamo nuevoPrestamo = new Prestamo(
            usuarioPrestamo,
            libroPrestamo,
            fechaPrestamo,
            fechaDevolucion
    );

    biblioteca.agregarPrestamo(nuevoPrestamo);
    archivo.guardarPrestamo(nuevoPrestamo);

    System.out.println("Préstamo registrado correctamente.");

    break;
    case 4:

    biblioteca.mostrarLibros();

    break;

    case 5:

    biblioteca.mostrarUsuarios();

    break;

    case 6:
       biblioteca.mostrarPrestamos();
       break;

    case 7:
        System.out.println("Gracias por usar el sistema.");
        break;

    default:
        System.out.println("Opción inválida.");
}

          } while (opcion != 7);
    }
 }