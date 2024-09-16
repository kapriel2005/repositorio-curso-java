import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion_s = " ";
        boolean loopear = true;

        while (loopear){
        System.out.println("1- Cargar colegios");
        System.out.println("2- Agregar colegios");
        System.out.println("3- Imprimir estadisticas del colegio");
        System.out.println("4- Salir");

        opcion_s = sc.nextLine();


        switch (opcion_s) {

            case "1": {
                cargarColegios();

                break;
            }
            case "2": {
                agregarColegios();

                break;
            }

            case "3": {
                imprimirEstadisticasDelColegio();

                break;
            }
            case "4": {
                loopear = false;

            }
        }

            System.out.println("1- Volver");
            System.out.println("1- Volver");
            System.out.println("Crear aula");
            System.out.println("Crear alumno");
            System.out.println("Ingresar datos del alumno");
            System.out.println("Cargar alumno desde archivo");
            System.out.println("Guardar alumno desde archivo");
            System.out.println("Crear profesor");
            System.out.println("Ingresar datos del profesor");
            System.out.println("Cargar profesor desde archivo");
            System.out.println("Guardar profesor desde archivo");
            System.out.println("Ver aula");
            System.out.println("Volver");

        }

    }
        public static void cargarColegios(){
            System.out.println("1- Volver");
        }
        public static void agregarColegios(){
            System.out.println("1- Volver");
        }
        public static void imprimirEstadisticasDelColegio(){
            System.out.println("1- Volver");
        }
    }
