/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



/**
 *
 * @author andr33ee
 */
public class Usuario {
    private String codigo;
    private String nombre;
    private String usuario;
    private String contrasena;
    public Usuario() {
   }
public Usuario(String codigo, String nombre, String usuario, String contrasena) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.usuario = usuario;
    this.contrasena = contrasena;
   }

  public String getCodigo() {
      return codigo;
    }
  public void setCodigo(String codigo){
      this.codigo = codigo;
    }
  public String getNombre(){
      return nombre;
    }
  public void setNombre(String nombre){
      this.nombre = nombre;
    }
  public String getUsuario(){
       return usuario;
    }
  public void setUsuario(String usuario){
      this.usuario = usuario;
  }
  public String getContrasena(){
      return contrasena;
  }
  public void setContrasena(String contrasena){
      this.contrasena = contrasena;
  }
   @Override
   public String toString(){
       return "Usuario{" +
               "codigo=" + codigo + '\''+
              ",nombre='"+ nombre + '\'' +
              ", usuario='" + usuario + '\'' +
              ", contrasena='" + contrasena + '\'' + '}';
   }
}