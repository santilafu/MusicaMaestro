package main.ui;
// En esta clase estara el menu principal de la aplicacion
// desde donde se podra acceder a las diferentes funcionalidades
// Importamos las librerias necesarias para crear la interfaz grafica
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
public class MenuPrincipal extends  JFrame {
    // Constructor
    public MenuPrincipal() {

        // Configuración de la ventana principal
        setTitle("Musica Maestro"); // Título de la ventana
        setSize(900, 600); // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setLayout(new BorderLayout()); // Layout de la ventana


        //Aqui se pueden agregar los diferentes paneles y menus contextuales
        add(new PanelAutores(), BorderLayout.WEST); // Agregamos el panel de autores a la izquierda
        add(new PanelInfoAutor(), BorderLayout.CENTER); // Agregamos el panel de informacion del autor al centro
        add(new PanelReproductor(), BorderLayout.SOUTH); // Agregamos el panel del reproductor en la parte inferior


        // Hacemos visible la ventana
        setVisible(true);
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        // Crear una instancia del menú principal
        new MenuPrincipal();
    }

}
