# 🎼 Música Maestro – Proyecto de Usabilidad (U4)

Aplicación de escritorio desarrollada en Java Swing que representa un reproductor musical especializado en música clásica.
El objetivo principal del proyecto es aplicar criterios reales de usabilidad, accesibilidad y diseño UI, respetando las indicaciones dadas en la unidad.

El proyecto está dividido en varias partes:
menús, navegación por autores, panel de información, reproductor y menú contextual.
Todo el diseño, colores y distribución siguen una línea visual clara y coherente inspirada en una estética clásica.

## 📁 Estructura del proyecto
```text

src/main/java/main/ui/
│
├── MenuPrincipal.java        → Ventana principal que une todos los paneles
├── PanelAutores.java         → Lista lateral de autores + menú contextual
├── PanelInfoAutor.java       → Panel central con imagen + descripción
├── PanelReproductor.java     → Panel inferior con controles del reproductor
├── DatosAutores.java         → Base de datos interna con imágenes + info
└── MenuContextualAutor.java  → (Opcional) Menú contextual separado

src/main/resources/
│
├── autores/
│   ├── bach.jpg
│   ├── beethoven.jpg
│   ├── chopin.jpg
│   ├── mozart.jpg
│   └── vivaldi.jpg
│
└── (iconos del reproductor)
├── btnPlay.png
├── btnAdelante.png
├── btnAtras.png
├── pausa.png
├── detener.png
└── volumen.png
```

## 🎯 Objetivo de la actividad

Implementar una aplicación con:

- Menú superior completo y ordenado

- Lista de autores a la izquierda

- Panel central con información detallada

- Reproductor en la parte inferior

- Menú contextual al pulsar clic derecho en un autor

- Cumplir normas de usabilidad y accesibilidad básicas

## 🧩 Funcionamiento de cada parte
### 🔹 1. Menú Principal

Incluye los menús solicitados en la actividad:

- Archivo

  - Nuevo

  - Biblioteca

  - —----------

  - Salir

- Edición

  - Deshacer

  - Rehacer

  - —-----------

  - Buscar

- Ver

  - Submenú Ordenar por:
    - Autor

    - Álbum

    - Género

Los colores, fuentes y separación se mantienen coherentes con el resto de la interfaz.

### 🔹 2. PanelAutores (lista lateral)

Panel situado en la parte izquierda.
Incluye:

- Lista de autores

- Scroll automático si crecen los elementos

- Menú contextual al hacer clic derecho con:

- Reproducir

- Añadir a la cola

- Ver más

Colores adaptados al fondo y fuente “Georgia” para estética clásica.

Además, cada autor está sincronizado con el panel central:
```java
panelAutores.getListaAutores().addListSelectionListener(...)
```
### 🔹 3. PanelInfoAutor (parte central)

Muestra:

- Nombre del autor

- Fotografía (cargada desde /resources/autores)

- Biografía resumida

La imagen se escala automáticamente.
El texto está en un JTextArea con:

- Color adecuado

- Fuente legible

- Scroll cuando hace falta

- Todo manteniendo el esquema de colores marrón/dorado.

### 🔹 4. PanelReproductor (parte inferior)

Incluye:

- Botón atrás

- Play

- Adelante

- Pausa

- Stop

- Icono de volumen

- Slider de volumen

Los iconos están escalados a 40×40 para que se vean bien.
No hay bordes raros ni fondos grises de Swing: solo iconos limpios y centrados.

## 🧠 Usabilidad aplicada
### **Distribución**

- Menú arriba, navegación a la izquierda, contenido al centro, controles abajo.

- Estructura clásica que el usuario reconoce sin pensar.

### **Legibilidad**

- Alto contraste (dorado sobre marrón).

- Tamaños de letra cómodos.

- Nada recargado.

### **Controles adecuados**

- JList para la lista de autores.

- JPopupMenu para menú contextual.

- Botones para el reproductor con iconos claros.

- JSlider para el volumen.

### **Accesibilidad básica**

- Flujo de tabulación natural.

- Colores no chillones.

- Textos entendibles y sin mensajes crípticos.

## ♿ Posibles mejoras de accesibilidad

En una versión más avanzada se podrían añadir:

- Atajos de teclado (Ctrl+P para Play, etc.).

- Textos alternativos para imágenes.

- Modo alto contraste.

- Opción de aumentar tamaño de fuente desde el menú.

- Integración con AccessibleContext para lectores de pantalla.

## ✅ Conclusiones

El proyecto cumple lo que pide la actividad:

- Menús con buena distribución

- Controles bien colocados

- Lista de autores funcional

- Menú contextual operativo

- Panel central conectado a la selección

- Reproductor visualmente claro

- Usabilidad y accesibilidad mínimas trabajadas

- Código separado en clases, legible y comentado



## ✍️ Autor

- Santiago Lafuente Hernández
- Estudiante de 2º DAM – Desarrollo de Interfaces
- Proyecto realizado con Java 23 y IntelliJ IDEA, organizado y versionado con Git y GitHub.
- Desarrollado con ayuda dr ChatGPT para optimizar código y resolver dudas puntuales.