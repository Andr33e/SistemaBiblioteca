/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author andr33ee
 */
public class Libro {
    private String codigo;
    private String titulo;
    private String autor;
    private String categoria;
    private boolean disponible; 
    
    public Libro (String codigo, String titulo, String categoria, boolean disponible){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponible = disponible;
        
    }
}
