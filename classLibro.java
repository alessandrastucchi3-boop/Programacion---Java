/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.claselibro;
import java.util.Scanner;

/**
 *
 * @author aless
 */
class Libro {
    String titulo;
    String autor;
    String editor;
    int añoPublicacion;
    
    public Libro(String titulo, String autor, String editor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.editor = editor;
        this.añoPublicacion = añoPublicacion;
    }
    
    public void setAñoPublicacion (int nuevoAño) {
        this.añoPublicacion = nuevoAño;
    }
    
    public String getTitulo() {
    return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getEditor() {
        return editor;
    }
    
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
}
public class ClaseLibro {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Romeo y Julieta", "William Shakespeare", "Mondadori", 2015);
        libro1.setAñoPublicacion(2020);
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Editor: " + libro1.getEditor());
        System.out.println("Año de publicacion: " + libro1.getAñoPublicacion());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Como se llama el libro? ");
        String tituloUsuario = scanner.nextLine();
        System.out.println("Quien lo ha escrito? ");
        String autorUsuario = scanner.nextLine();
        System.out.println("Cual es el editor? ");
        String editorUsuario = scanner.nextLine();
        System.out.println("En que año ha sido publicado? ");
        int añoUsuario = scanner.nextInt();
        scanner.nextLine();
        Libro libroUsuario = new Libro(tituloUsuario, autorUsuario, editorUsuario, añoUsuario);
        System.out.println("Titulo: " + libroUsuario.getTitulo());
        System.out.println("Autor: " + libroUsuario.getAutor());
        System.out.println("Editor: " + libroUsuario.getEditor());
        System.out.println("Año de publicacion: " + libroUsuario.getAñoPublicacion());
        System.out.println("Añade el nuevo año de publicacion: ");
        int nuevoAñoPublicacion = scanner.nextInt();
        scanner.nextLine();
        libroUsuario.setAñoPublicacion(nuevoAñoPublicacion);
        System.out.println("Titulo: " + libroUsuario.getTitulo());
        System.out.println("Autor: " + libroUsuario.getAutor());
        System.out.println("Editor: " + libroUsuario.getEditor());
        System.out.println("Año de publicacion: " + libroUsuario.getAñoPublicacion());
    }
}
