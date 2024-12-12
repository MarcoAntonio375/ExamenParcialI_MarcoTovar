/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author lenovo
 */
import javax.swing.*;
import java.awt.*;

public class LibroGUI extends JFrame {
    private final JButton prestarButton;

    public LibroGUI() {
        setTitle("Sistema de Préstamos de Libros");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        prestarButton = new JButton("Prestar");
        JTextField tituloField = new JTextField();
        setLayout(new GridLayout(3, 1));
        add(new JLabel("Título del libro:"));
        add(tituloField);
        add(prestarButton);
    }

    public JButton getPrestarButton() {
        return prestarButton; 
    }
}

