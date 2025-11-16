package main.ui;

import javax.swing.*;
import java.awt.*;

public class PanelInfoAutor extends JPanel {

    private JLabel titulo;
    private JLabel imagen;
    private JTextArea info;

    public PanelInfoAutor() {

        setBackground(new Color(33, 20, 15));
        setLayout(new BorderLayout());

        titulo = new JLabel("Selecciona un autor", SwingConstants.CENTER);
        titulo.setForeground(new Color(231, 199, 122));
        titulo.setFont(new Font("Georgia", Font.BOLD, 26));

        imagen = new JLabel("", SwingConstants.CENTER);

        info = new JTextArea();
        info.setEditable(false);
        info.setBackground(new Color(33, 20, 15));
        info.setForeground(Color.WHITE);
        info.setFont(new Font("Georgia", Font.PLAIN, 16));
        info.setLineWrap(true);
        info.setWrapStyleWord(true);

        add(titulo, BorderLayout.NORTH);
        add(imagen, BorderLayout.CENTER);
        add(info, BorderLayout.SOUTH);
    }

    public void mostrarAutor(String nombre) {
        titulo.setText(nombre);

        // Cuando tengas las imágenes, las cargamos así:
        // ImageIcon foto = new ImageIcon(getClass().getResource("/mozart.png"));
        // imagen.setIcon(foto);

        info.setText("Información básica de " + nombre + ".\nPronto añadiremos más detalles.");
    }
}
