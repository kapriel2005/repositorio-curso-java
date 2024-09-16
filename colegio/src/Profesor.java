import java.io.Serializable;

public class Profesor extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    private String especialidad;

    public Profesor(String nombre, String apellido, String dni, String especialidad) {
        super(nombre, apellido, dni);
        this.especialidad = especialidad;
    }

    // Getters y setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + " (Especialidad: " + especialidad + ")";
    }
}
