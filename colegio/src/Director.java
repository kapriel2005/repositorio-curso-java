import java.io.Serializable;

public class Director extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    private double valoracion;

    public Director(String nombre, String apellido, String dni, double valoracion) {
        super(nombre, apellido, dni);
        this.valoracion = valoracion;
    }

    // Getters y setters
    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return super.toString() + " (Valoración: " + valoracion + ")";
    }
}
