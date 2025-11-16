package ui;
// Clase para el panel del reproductor que estara en la parte inferior
// Importamos las librerias necesarias para crear la interfaz grafica
import javax.swing.*;
import java.awt.*;
public class PanelReproductor extends JPanel {
    // Constructor
    public PanelReproductor() {
        // Configuramos el panel
        setBackground(new Color(62, 39, 35));  // Color de fondo
        setPreferredSize(new Dimension(0, 100)); // Tamaño preferido del panel en la parte inferior
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 25)); // Layout del panel para organizar los botones

        //Colores elegantes
        Color dorado = new Color(231, 199, 122);
        Font f = new Font("Segoe UI", Font.BOLD, 18);

        // Creamos los botones del reproductor
        JButton btnAtras = new JButton("<<");
        JButton btnPlay = new JButton("▶");
        JButton btnAdelante = new JButton(">>");
        JButton btnPause = new JButton("❙❙");
        JButton btnStop = new JButton("■");

        JButton [] botones = {btnAtras, btnPlay, btnAdelante, btnPause, btnStop}; // Array con los botones para aplicar estilos

        // Aplicamos estilos a los botones
        for (JButton btn : botones) {
            btn.setFont(f); // Fuente del boton
            btn.setBackground(dorado); // Color de fondo dorado
            btn.setForeground(new Color(44, 26, 10)); // Color de texto
            btn.setFocusPainted(false); // Quitar el borde de enfoque
            btn.setBorderPainted(false); // Quitar el borde del boton
            btn.setPreferredSize(new Dimension(60, 40)); // Tamaño preferido del boton
        }

        // Barra de volumen (slider)
        JSlider volumen = new JSlider(0, 100, 50); // Minimo, Maximo, Valor inicial
        volumen.setPreferredSize(new Dimension(150, 20)); // Tamaño preferido
        volumen.setBackground(new Color(62, 39, 35)); // Color de fondo del slider
        volumen.setForeground(dorado); // Color del slider


        // Agregamos los botones al panel y slider de volumen
        add(volumen);
        add(btnAtras);
        add(btnPlay);
        add(btnAdelante);
        add(btnPause);
        add(btnStop);
    }
}
