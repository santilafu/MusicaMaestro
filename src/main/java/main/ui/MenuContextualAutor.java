package main.ui;
// Clase para el menu contextual del autor que aparecera al hacer clic derecho sobre un autor en la lista de autores
// Importamos las librerias necesarias para crear la interfaz grafica
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuContextualAutor extends JPopupMenu {
    // Constructor
    public MenuContextualAutor() {
        // Crear items del menu contextual
        JMenuItem itemReproducir = new JMenuItem("Reproducir");
        JMenuItem itemAnadirCola = new JMenuItem("Añadir a la cola");
        JMenuItem itemVerMas = new JMenuItem("Ver más");

        // Agregar items al menu contextual
        add(itemReproducir);
        add(itemAnadirCola);
        add(itemVerMas);
    }

}
