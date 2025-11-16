package main.ui;

import javax.swing.*;
import java.awt.*;

public class PanelInfoAutor extends JPanel {

    private JLabel lblTitulo;
    private JLabel lblImagen;
    private JTextArea txtInfo;

    public PanelInfoAutor() {

        setBackground(new Color(33, 20, 15));
        setLayout(new BorderLayout());

        lblTitulo = new JLabel("Selecciona un autor");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setForeground(new Color(231, 199, 122));
        lblTitulo.setFont(new Font("Georgia", Font.BOLD, 28));

        lblImagen = new JLabel();
        lblImagen.setHorizontalAlignment(SwingConstants.CENTER);

        txtInfo = new JTextArea();
        txtInfo.setEditable(false);
        txtInfo.setLineWrap(true);
        txtInfo.setWrapStyleWord(true);
        txtInfo.setForeground(new Color(231,199,122));
        txtInfo.setBackground(new Color(33, 20, 15));
        txtInfo.setFont(new Font("Georgia", Font.PLAIN, 16));

        add(lblTitulo, BorderLayout.NORTH);
        add(lblImagen, BorderLayout.CENTER);
        add(new JScrollPane(txtInfo), BorderLayout.SOUTH);
    }

    // Cargar imagen según autor
    private ImageIcon cargarImagen(String nombreArchivo){
        try {
            return new ImageIcon(
                    new ImageIcon(getClass().getResource("/autores/" + nombreArchivo))
                            .getImage()
                            .getScaledInstance(250, 250, Image.SCALE_SMOOTH)
            );
        } catch (Exception e){
            return null;
        }
    }

    // Método público para actualizar la información
    public void mostrarAutor(String nombre, String imagen, String bio){

        lblTitulo.setText(nombre);

        ImageIcon img = cargarImagen(imagen);

        if(img != null){
            lblImagen.setIcon(img);
        } else {
            lblImagen.setIcon(null);
        }

        txtInfo.setText(bio);
    }
}
