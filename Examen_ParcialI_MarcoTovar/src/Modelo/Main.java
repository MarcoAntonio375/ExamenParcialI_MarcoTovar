/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.LibroController;
import Vista.LibroGUI;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        
        Autor autor = new Autor("Gabriel García Márquez", "Colombia", "Escritor colombiano.");
        Libro libro = new Libro("Cien años de soledad", autor);      
        LibroGUI vista = new LibroGUI();

        LibroController controller = new LibroController(libro, vista);
        controller.iniciar();
    }
}



