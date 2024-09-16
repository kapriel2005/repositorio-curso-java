import java.io.Serializable;

public class Alumno extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    private String curso;
    private double notaMedia;

    public Alumno(String nombre, String apellido, String dni, String curso, double notaMedia) {
        super(nombre, apellido, dni);
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    // Getters y setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return super.toString() + " (Curso: " + curso + ", Nota Media: " + notaMedia + ")";
    }
}
