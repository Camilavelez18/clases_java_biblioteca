import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void prestarLibro(Usuario usuario, Libro libro) {
        if (libro.isDisponible()) {
            libro.prestar();
            Prestamo prestamo = new Prestamo(usuario, libro, new Date(), null);
            prestamos.add(prestamo);
            System.out.println("Libro prestado: " + libro.getTitulo() + " a " + usuario.getNombre());
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolverLibro(Libro libro) {
        libro.devolver();
        System.out.println("Libro devuelto: " + libro.getTitulo());
    }
}
