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

        //Crear menu principal
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.setBackground(new Color(62,39,35)); // Color de fondo de la barra de menu
        barraMenu.setForeground(new Color(231,199,122)); // Color de texto de la barra de menu

        // Crear menus principales
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuEdicion = new JMenu("Edicion");
        JMenu menuVer = new JMenu("Ver");

        //Le ponemos color a los menus
        menuArchivo.setForeground(new Color(231,199,122));
        menuEdicion.setForeground(new Color(231,199,122));
        menuVer.setForeground(new Color(231,199,122));

        // Items del menu Archivo
       menuArchivo.add(new JMenuItem("Nuevo"));
       menuArchivo.add(new JMenuItem("Biblioteca"));
       menuArchivo.addSeparator();
       menuArchivo.add(new JMenuItem("Salir"));

        // Items del menu Edicion
       menuEdicion.add(new JMenuItem("Deshacer"));
       menuEdicion.add(new JMenuItem("Rehacer"));
       menuEdicion.addSeparator();
       menuEdicion.add(new JMenuItem("Buscar"));

        // Items del menu Ver con submenu
        JMenu submenuOrdenar = new JMenu("Ordenar por"); // Submenu dentro del menu Ver
        submenuOrdenar.add(new JMenuItem("Autor")); // Items del submenu Ordenar por Autor
        submenuOrdenar.add(new JMenuItem("Album")); // Items del submenu Ordenar por Album
        submenuOrdenar.add(new JMenuItem("Genero")); // Items del submenu Ordenar por Genero
        menuVer.add(submenuOrdenar); // Agregamos el submenu al menu Ver

        // Agregar menus a la barra de menu
        barraMenu.add(menuArchivo);
        barraMenu.add(menuEdicion);
        barraMenu.add(menuVer);
        setJMenuBar(barraMenu); // Agregamos la barra de menu a la ventana principal

        // Crear un JPopupMenu para el menu contextual
        JPopupMenu menuContextual = new JPopupMenu();

        menuContextual.add(new JMenuItem("Reproducir"));
        menuContextual.add(new JMenuItem("Añadir a la cola"));
        menuContextual.add(new JMenuItem("Ver más"));



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

        // Panel de autores y cargar autores de ejemplo
        PanelAutores panelAutores = new PanelAutores();
        String[] autores = {
                "Wolfgang Amadeus Mozart",
                "Ludwig van Beethoven",
                "Johann Sebastian Bach",
                "Frédéric Chopin",
                "Antonio Vivaldi"
        };

        panelAutores.cargarAutores(autores);

        //Vincular seleccion con PanelInfoAutor
        PanelInfoAutor panelInfo = new PanelInfoAutor();
        panelAutores.getListaAutores().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String autorSeleccionado = panelAutores.getListaAutores().getSelectedValue();
                panelInfo.mostrarAutor(autorSeleccionado);
            }
        });

    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        // Crear una instancia del menú principal
        new MenuPrincipal();
    }

}
