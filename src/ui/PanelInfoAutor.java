package ui;
// Clase para el panel de informacion del autor que mostrara la informacion del autor seleccionado en el centro
// Importamos las librerias necesarias para crear la interfaz grafica
import javax.swing.*;
import java.awt.*;
public class PanelInfoAutor extends  JPanel {
    // Constructor
    public PanelInfoAutor() {
        // Configuramos el panel
        setBackground(new Color(44, 26, 10));  // Color de fondo
        setLayout(new BorderLayout()); // Layout del panel para organizar el contenido

        // Texto central provisional
        JLabel titulo = new JLabel("Selecciona un autor" , SwingConstants.CENTER);
        titulo.setForeground(new Color(231, 199, 122)); // Color de texto de la etiqueta
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 32)); // Fuente y tamaño de la etiqueta


        // Agregamos la etiqueta al panel
        add(titulo, BorderLayout.NORTH); // Agregamos la etiqueta en la parte superior del panel

        // Aqui se pueden agregar mas componentes para mostrar la informacion del autor
    }
}
