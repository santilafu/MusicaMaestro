package main.ui;

import javax.swing.*;
import java.awt.*;

public class PanelReproductor extends JPanel {

    // Método para cargar iconos desde resources
    private ImageIcon cargarIcono(String nombre){
        ImageIcon original = new ImageIcon(getClass().getResource("/" + nombre));

        // Escalar a 40x40, ajusta si quieres más pequeño o más grande
        Image img = original.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);

        return new ImageIcon(img);
    }



    // Método para estilizar botones
    private void estilizar(JButton b) {
        b.setFocusPainted(false); // Quitar el borde de enfoque
        b.setBorderPainted(false); // Quitar el borde del botón
        b.setContentAreaFilled(false); // Quitar el área de contenido
        b.setOpaque(false); // Hacer el botón transparente
        b.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambiar el cursor al pasar sobre el botón
    }

    // Constructor
    public PanelReproductor() {

        // Fondo del panel inferior
        setBackground(new Color(62, 39, 35));
        setPreferredSize(new Dimension(0, 100));
        setLayout(new FlowLayout(FlowLayout.CENTER, 25, 25));

        // Colores y tipografía
        Color dorado = new Color(231, 199, 122);

        // Crear botones con iconos
        JButton btnAtras = new JButton(cargarIcono("btnAtras.png"));
        JButton btnPlay = new JButton(cargarIcono("btnPlay.png"));
        JButton btnAdelante = new JButton(cargarIcono("btnAdelante.png"));
        JButton btnPause = new JButton(cargarIcono("pausa.png"));
        JButton btnStop = new JButton(cargarIcono("detener.png"));



        // Estilizar botones
        estilizar(btnAtras); //
        estilizar(btnPlay);
        estilizar(btnAdelante);
        estilizar(btnPause);
        estilizar(btnStop);

        // ICONO volumen
        JLabel iconoVolumen = new JLabel(cargarIcono("volumen.png"));

        // Slider de volumen
        JSlider volumen = new JSlider(0, 100, 50);
        volumen.setPreferredSize(new Dimension(150, 20));
        volumen.setBackground(new Color(62, 39, 35));
        volumen.setForeground(dorado);

        // Añadir al panel
        add(iconoVolumen);
        add(volumen);
        add(btnAdelante);
        add(btnPlay);
        add(btnAtras);
        add(btnPause);
        add(btnStop);
    }
}
