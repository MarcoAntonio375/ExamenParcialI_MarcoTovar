/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Libro;
import Vista.LibroGUI;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class LibroController {
    private Libro libro;
    private LibroGUI vista;

    public LibroController(Libro libro, Vista.LibroGUI vista) {
        this.libro = libro;
        this.vista = vista;
    }

    public void iniciar() {
        vista.setVisible(true);
        vista.getPrestarButton().addActionListener(e -> {
            if (libro.disponibilidad()) {
                libro.prestar();
                JOptionPane.showMessageDialog(vista, "Libro prestado con éxito.");
            } else {
                JOptionPane.showMessageDialog(vista, "El libro no está disponible.");
            }
        });
    }
}


