/**
 * Clase Libro del sistema BibliotecaWeb.
 * Autor: Vanessa Hernández Hernández
 * Proyecto: BibliotecaWeb
 *
 * Esta clase hereda de MaterialBibliografico.
 */
public class Libro extends MaterialBibliografico {

    // Atributos propios del modelo
    private int paginas;
    private boolean disponible;

    /**
     * Constructor con validaciones.
     */
    public Libro(String titulo, String autor, int paginas) {

        // Llamada al constructor de la clase padre
        super(titulo, autor);

        if (paginas <= 0) {
            throw new IllegalArgumentException(
                "Las páginas deben ser mayores a cero."
            );
        }

        this.paginas = paginas;
        this.disponible = true;
    }

    // =========================
    // GETTERS
    // =========================

    public int getPaginas() {
        return paginas;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // =========================
    // SETTERS
    // =========================

    public void setPaginas(int paginas) {

        if (paginas <= 0) {
            throw new IllegalArgumentException(
                "Las páginas deben ser mayores a cero."
            );
        }

        this.paginas = paginas;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // =========================
    // MÉTODOS DE LÓGICA
    // =========================

    /**
     * Presta el libro si está disponible.
     */
    public String prestar() {

        if (disponible) {
            disponible = false;
            return "El libro ha sido prestado correctamente.";
        }

        return "El libro no está disponible.";
    }

    /**
     * Devuelve el libro a la biblioteca.
     */
    public String devolver() {

        disponible = true;
        return "El libro ha sido devuelto correctamente.";
    }

    /**
     * Obtiene el estado actual del libro.
     */
    public String estado() {

        if (disponible) {
            return "Disponible";
        }

        return "Prestado";
    }

    /**
     * Clasifica el libro de acuerdo con su número de páginas.
     */
    public String clasificarExtension() {

        if (paginas < 100) {
            return "Libro corto";
        }

        if (paginas <= 300) {
            return "Libro mediano";
        }

        return "Libro largo";
    }

    /**
     * Obtiene una descripción completa del libro.
     */
    public String obtenerDescripcion() {

        return "Título: " + getTitulo()
                + " | Autor: " + getAutor()
                + " | Páginas: " + paginas
                + " | Estado: " + estado();
    }

    /**
     * Método recursivo.
     *
     * Caso base:
     * cuando el texto es nulo o está vacío.
     *
     * Condición de avance:
     * elimina un carácter y vuelve a llamar al método.
     */
    public int contarCaracteresRecursivo(String texto) {

        // Caso base
        if (texto == null || texto.isEmpty()) {
            return 0;
        }

        // Llamada recursiva
        return 1 + contarCaracteresRecursivo(texto.substring(1));
    }
}