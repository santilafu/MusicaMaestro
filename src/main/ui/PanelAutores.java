package main.ui;
// Clase para el panel de autores que mostrara la lista de autores disponibles en la izquierda
// Importamos las librerias necesarias para crear la interfaz grafica
import javax.swing.*;
import java.awt.*;
public class PanelAutores extends JPanel {
    // Constructor
    public  PanelAutores() {
        // Configuramos el panel
        setBackground(new Color(62,39,35));  // Color de fondo
        setPreferredSize(new Dimension(180,0)); // Tamaño preferido del panel en la izquierda
        setLayout(new BorderLayout()); // Layout del panel para poder meter la lista dentro
        // Creamos la lista de autores
        JList listaAutores = new JList<>(); // Lista de autores

        //Colores de la lista
        listaAutores.setBackground(new Color(62, 39, 35)); // Color de fondo de la lista
        listaAutores.setForeground(new Color(231, 199, 122)); // Color de texto de la lista
        listaAutores.setSelectionBackground(new Color(90, 55, 45)); // Color de fondo de la seleccion
        listaAutores.setSelectionForeground(new Color(255, 255, 255)); // Color de texto de la seleccion

        // Agregamos la lista al panel dentro de un scroll
        JScrollPane scrollListaAutores = new JScrollPane(listaAutores);
        add(scrollListaAutores, BorderLayout.CENTER); // Agregamos el scroll al centro del panel
    }
}
