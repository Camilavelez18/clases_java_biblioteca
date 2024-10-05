public class Bibliotecario extends Usuario {
    private String turno;

    public Bibliotecario(String nombre, int idUsuario, String turno) {
        super(nombre, idUsuario);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    
    public void registrarLibro(Libro libro) {
        System.out.println("Libro registrado: " + libro.getTitulo());
    }


    public void eliminarLibro(Libro libro) {
        System.out.println("Libro eliminado: " + libro.getTitulo());
    }
}
