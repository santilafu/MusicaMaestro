package main.ui;

import javax.swing.*;
import java.awt.*;

public class PanelReproductor extends JPanel {

    // Método para cargar iconos desde resources
    private ImageIcon cargarIcono(String nombre){
        return new ImageIcon(getClass().getResource("/" + nombre));
    }


    // Método para estilizar botones
    private void estilizar(JButton b) {
        b.setFocusPainted(false);
        b.setBorderPainted(false);
        b.setContentAreaFilled(false);
        b.setOpaque(false);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
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
        estilizar(btnAtras);
        estilizar(btnPlay);
        estilizar(btnAdelante);
        estilizar(btnPause);
        estilizar(btnStop);

        // ICONO volumen
        JLabel iconoVolumen = new JLabel(cargarIcono("volume.png"));

        // Slider de volumen
        JSlider volumen = new JSlider(0, 100, 50);
        volumen.setPreferredSize(new Dimension(150, 20));
        volumen.setBackground(new Color(62, 39, 35));
        volumen.setForeground(dorado);

        // Añadir al panel
        add(iconoVolumen);
        add(volumen);
        add(btnAtras);
        add(btnPlay);
        add(btnAdelante);
        add(btnPause);
        add(btnStop);
    }
}
