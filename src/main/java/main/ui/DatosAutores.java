package main.ui;

import java.util.HashMap;

public class DatosAutores {

    private static final HashMap<String, String[]> datos = new HashMap<>();

    static {
        datos.put("Wolfgang Amadeus Mozart", new String[]{
                "mozart.jpg",
                "Compositor austríaco del periodo clásico..."
        });

        datos.put("Ludwig van Beethoven", new String[]{
                "beethoven.jpg",
                "Figura clave en la transición del clasicismo al romanticismo..."
        });

        datos.put("Johann Sebastian Bach", new String[]{
                "bach.jpg",
                "Uno de los más grandes compositores barrocos..."
        });

        datos.put("Frédéric Chopin", new String[]{
                "chopin.jpg",
                "Considerado el poeta del piano..."
        });

        datos.put("Antonio Vivaldi", new String[]{
                "vivaldi.jpg",
                "Compositor barroco famoso por Las Cuatro Estaciones..."
        });
    }

    public static String[] get(String autor){
        return datos.get(autor);
    }
}
