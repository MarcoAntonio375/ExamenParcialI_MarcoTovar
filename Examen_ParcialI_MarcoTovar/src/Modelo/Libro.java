/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author lenovo
 */
public class Libro {
    private boolean disponible;

    public Libro(String titulo, Autor autor) {
        this.disponible = true; 
    }

    public boolean disponibilidad() {
        return disponible; 
    }

    public void prestar() {
        if (disponible) {
            disponible = false; 
        } else {
            System.out.println("El libro no está disponible :c");
        }
    }
}


