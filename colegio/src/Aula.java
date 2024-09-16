import java.io.Serializable;
import java.util.ArrayList;

public class Aula implements Serializable {
    private static final long serialVersionUID = 1L;

    private String idAula;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;

    public Aula(String idAula, Profesor profesor) {
        this.idAula = idAula;
        this.profesor = profesor;
        this.alumnos = new ArrayList<>();
    }

    // Métodos para agregar alumnos
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    // Getters y setters
    public String getIdAula() {
        return idAula;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Aula: " + idAula + ", Profesor: " + profesor + ", Alumnos: " + alumnos.size();
    }
}
