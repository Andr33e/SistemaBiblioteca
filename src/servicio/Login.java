/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import modelo.Usuario;
import modelo.Biblioteca;

public class Login {

    public boolean validarUsuario(Biblioteca biblioteca, String usuario, String contrasena){

        for(int i = 0; i < biblioteca.getTotalUsuarios(); i++){

            Usuario u = biblioteca.getUsuarios()[i];

            if(u.getUsuario().equals(usuario) &&
               u.getContrasena().equals(contrasena)){

                return true;
            }
        }

        return false;
    }
}
