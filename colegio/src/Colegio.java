import java.io.Serializable;
import java.util.ArrayList;

public class Colegio implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private Director director;
    private ArrayList<Aula> aulas;

    public Colegio(String nombre, Director director) {
        this.nombre = nombre;
        this.director = director;
        this.aulas = new ArrayList<>();
    }

    // Métodos para agregar aulas
    public void agregarAula(Aula aula) {
        aulas.add(aula);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }

    // Método para imprimir estadísticas
    public void imprimirEstadisticas() {
        System.out.println("Colegio: " + nombre);
        System.out.println("Director: " + director);
        System.out.println("Número de aulas: " + aulas.size());
        for (Aula aula : aulas) {
            System.out.println(aula);
        }
    }

    @Override
    public String toString() {
        return "Colegio: " + nombre + ", Director: " + director;
    }
}
