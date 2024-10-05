public class Usuario {
    private String nombre;
    private int idUsuario;
    private int maxPrestamos;

    public Usuario(String nombre, int idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.maxPrestamos = 3;  
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getMaxPrestamos() {
        return maxPrestamos;
    }

    public void setMaxPrestamos(int maxPrestamos) {
        this.maxPrestamos = maxPrestamos;
    }
}