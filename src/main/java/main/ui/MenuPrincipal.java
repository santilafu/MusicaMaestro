package main.ui;

// En esta clase estará el menú principal de la aplicación.
// Desde aquí se organizan los paneles: autores, info del autor y reproductor.

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame {

    // Constructor de la ventana principal
    public MenuPrincipal() {

        // BARRA DE MENÚ SUPERIOR

        JMenuBar barraMenu = new JMenuBar();
        barraMenu.setBackground(new Color(62, 39, 35));
        barraMenu.setForeground(new Color(231, 199, 122));

        // Menús principales
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuEdicion = new JMenu("Edición");
        JMenu menuVer     = new JMenu("Ver");

        // Color de texto para los menús
        Color dorado = new Color(231, 199, 122);
        menuArchivo.setForeground(dorado);
        menuEdicion.setForeground(dorado);
        menuVer.setForeground(dorado);

        // Menú Archivo
        menuArchivo.add(new JMenuItem("Nuevo"));
        menuArchivo.add(new JMenuItem("Biblioteca"));
        menuArchivo.addSeparator();
        menuArchivo.add(new JMenuItem("Salir"));

        // Menú Edición
        menuEdicion.add(new JMenuItem("Deshacer"));
        menuEdicion.add(new JMenuItem("Rehacer"));
        menuEdicion.addSeparator();
        menuEdicion.add(new JMenuItem("Buscar"));

        // Menú Ver con submenú "Ordenar por"
        JMenu submenuOrdenar = new JMenu("Ordenar por");
        submenuOrdenar.add(new JMenuItem("Autor"));
        submenuOrdenar.add(new JMenuItem("Álbum"));
        submenuOrdenar.add(new JMenuItem("Género"));
        menuVer.add(submenuOrdenar);

        // Añadir menús a la barra y la barra a la ventana
        barraMenu.add(menuArchivo);
        barraMenu.add(menuEdicion);
        barraMenu.add(menuVer);
        setJMenuBar(barraMenu);

        // CREACIÓN DE PANELES

        // Panel lateral con la lista de autores
        PanelAutores panelAutores = new PanelAutores();

        // Panel central con la info del autor seleccionado
        PanelInfoAutor panelInfo = new PanelInfoAutor();

        // Panel inferior con los controles del reproductor
        PanelReproductor panelReproductor = new PanelReproductor();

        // CONFIGURACIÓN DE LA VENTANA

        setTitle("Musica Maestro");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Distribuimos los paneles en la ventana
        add(panelAutores, BorderLayout.WEST);
        add(panelInfo,    BorderLayout.CENTER);
        add(panelReproductor, BorderLayout.SOUTH);

        // Hacemos visible la ventana
        setVisible(true);

        // CARGAR AUTORES EN LA LISTA

        String[] autores = {
                "Wolfgang Amadeus Mozart",
                "Ludwig van Beethoven",
                "Johann Sebastian Bach",
                "Frédéric Chopin",
                "Antonio Vivaldi"
        };

        panelAutores.cargarAutores(autores);

        // CUANDO CAMBIA LA SELECCIÓN DE AUTOR

        panelAutores.getListaAutores().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {

                String autor = panelAutores.getListaAutores().getSelectedValue();

                if(autor != null){
                    String[] datos = DatosAutores.get(autor);
                    panelInfo.mostrarAutor(autor, datos[0], datos[1]);
                }
            }
        });

    }

    // Punto de entrada de la aplicación
    public static void main(String[] args) {
        new MenuPrincipal();
    }
}
