/**
 * Clase base del sistema de BibliotecaWeb.
 * Autor: Vanessa Hernández Hernández
 * Proyecto: BibliotecaWeb
 */
public class MaterialBibliografico {

    // Atributos privados para aplicar encapsulamiento
    private String titulo;
    private String autor;

    // Constructor con validaciones
    public MaterialBibliografico(String titulo, String autor) {

        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }

        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }

        this.titulo = titulo;
        this.autor = autor;
    }

    // Getter del título
    public String getTitulo() {
        return titulo;
    }

    // Setter del título
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }

        this.titulo = titulo;
    }

    // Getter del autor
    public String getAutor() {
        return autor;
    }

    // Setter del autor
    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }

        this.autor = autor;
    }

    // Método de lógica del dominio
    public String obtenerInformacion() {
        return titulo + " - " + autor;
    }
}