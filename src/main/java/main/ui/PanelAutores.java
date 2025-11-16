package main.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelAutores extends JPanel {

    private JList<String> listaAutores;       // Lista visual
    private DefaultListModel<String> modelo;  // Datos de la lista
    private JPopupMenu menuContextual;        // Menú contextual

    public PanelAutores() {

        setBackground(new Color(44, 30, 27));
        setLayout(new BorderLayout());

        // MODELO DE LISTA
        modelo = new DefaultListModel<>();
        listaAutores = new JList<>(modelo);

        listaAutores.setBackground(new Color(44, 30, 27));
        listaAutores.setForeground(new Color(231, 199, 122));
        listaAutores.setSelectionBackground(new Color(70, 50, 45));
        listaAutores.setFont(new Font("Georgia", Font.PLAIN, 18));

        JScrollPane scroll = new JScrollPane(listaAutores);
        add(scroll, BorderLayout.CENTER);

        //     MENÚ CONTEXTUAL (Clic derecho sobre un autor)

        menuContextual = new JPopupMenu();

        JMenuItem itemReproducir = new JMenuItem("Reproducir");
        JMenuItem itemCola = new JMenuItem("Añadir a la cola");
        JMenuItem itemVerMas = new JMenuItem("Ver más");

        menuContextual.add(itemReproducir);
        menuContextual.add(itemCola);
        menuContextual.add(itemVerMas);

        // Listener para mostrar el menú al hacer clic derecho
        listaAutores.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mostrarMenuSiProcede(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mostrarMenuSiProcede(e);
            }

            private void mostrarMenuSiProcede(MouseEvent e) {
                if (e.isPopupTrigger()) { // clic derecho
                    int index = listaAutores.locationToIndex(e.getPoint());
                    if (index >= 0) {
                        listaAutores.setSelectedIndex(index);
                        menuContextual.show(listaAutores, e.getX(), e.getY());
                    }
                }
            }
        });
    }

    // Método para cargar autores desde el menú principal
    public void cargarAutores(String[] autores) {
        modelo.clear();
        for (String a : autores) modelo.addElement(a);
    }

    // Permite que MenuPrincipal pueda obtener la selección
    public JList<String> getListaAutores() {
        return listaAutores;
    }
}
