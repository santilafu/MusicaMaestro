package main.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelAutores extends JPanel {

    private DefaultListModel<String> modelo;
    private JList<String> listaAutores;
    private JPopupMenu menuContextual;

    public PanelAutores() {

        // Fondo general del panel izquierdo
        setBackground(new Color(44, 30, 27));
        setLayout(new BorderLayout());

        // MODELO Y LISTA DE AUTORES

        modelo = new DefaultListModel<>();
        listaAutores = new JList<>(modelo);

        listaAutores.setBackground(new Color(44, 30, 27));
        listaAutores.setForeground(new Color(231, 199, 122));
        listaAutores.setSelectionBackground(new Color(70, 50, 45));
        listaAutores.setFont(new Font("Georgia", Font.PLAIN, 20));

        add(new JScrollPane(listaAutores), BorderLayout.CENTER);

        // MENÚ CONTEXTUAL

        menuContextual = new JPopupMenu();

        JMenuItem itemReproducir = new JMenuItem("Reproducir");
        JMenuItem itemCola = new JMenuItem("Añadir a la cola");
        JMenuItem itemVerMas = new JMenuItem("Ver más");

        menuContextual.add(itemReproducir);
        menuContextual.add(itemCola);
        menuContextual.add(itemVerMas);

        // MOSTRAR MENÚ AL HACER CLIC DERECHO

        listaAutores.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                mostrarMenu(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mostrarMenu(e);
            }

            private void mostrarMenu(MouseEvent e) {

                if (e.isPopupTrigger()) { // clic derecho

                    int idx = listaAutores.locationToIndex(e.getPoint());

                    if (idx >= 0) {
                        listaAutores.setSelectedIndex(idx);
                        menuContextual.show(listaAutores, e.getX(), e.getY());
                    }
                }
            }
        });
    }


    // MÉTODO PARA CARGAR AUTORES
    public void cargarAutores(String[] autores) {
        modelo.clear();
        for (String a : autores) modelo.addElement(a);
    }

    // Permite al menú principal acceder a la lista seleccionada
    public JList<String> getListaAutores() {
        return listaAutores;
    }
}
